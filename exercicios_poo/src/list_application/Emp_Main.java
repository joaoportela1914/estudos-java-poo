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
			int ID = sc.nextInt();
			System.out.print("Name:");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.print("Salary:");
			double salary = sc.nextDouble();	
			
			employee.add(new Employee(ID,name,salary));
		}
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int searchId = sc.nextInt();
		Employee idsearch = employee.stream().filter(x -> x.getId() == searchId).findFirst().orElse(null);
		if(idsearch == null) {
			System.out.println("This id does not exist! ");		
		}
		else {
			System.out.print("Enter the percentage:");
			int percentage = sc.nextInt();
			idsearch.salaryIncrease(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		System.out.println(employee.toString());
		
		sc.close();
        }
	}


