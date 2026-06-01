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

		
		for(int i=0; i >n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i+1));
			String names =sc.next();
			int IDs=sc.nextInt();
			double salarys = sc.nextDouble();	
		}
		employee.add(new Employee(names,Ids,salary);
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int searchId = sc.nextInt();
		
		sc.close();
	}
}
