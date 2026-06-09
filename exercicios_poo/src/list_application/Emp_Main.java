package list_application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import list_entities.Employee;

public class Emp_Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many employees will be registread? ");
		int n = sc.nextInt();
		
		List<Employee> employee = new ArrayList<>(n);

		
		for(int i=0; i<n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i+1));		
			System.out.print("Id:");
			Integer ID = sc.nextInt();
			
			while (hasId(employee, ID)) {
				System.out.print("Id already taken. Try again: ");
				ID = sc.nextInt();
			}
			
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary:");
			Double salary = sc.nextDouble();	
			
			Employee emp = new Employee(ID,name,salary);
			employee.add(emp);
		}
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int searchId = sc.nextInt();
		Employee emp = employee.stream().filter(x -> x.getId() == searchId).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("This id does not exist! ");		
		}
		else {
			System.out.print("Enter the percentage:");
			double percentage = sc.nextDouble();
			emp.salaryIncrease(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee e : employee) {
			System.out.println(e);
		}
		
		sc.close();
        }
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	
	}


