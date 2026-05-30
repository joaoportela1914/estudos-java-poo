package list_application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Emp_Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registread? ");
		int n = sc.nextInt();
		
		List<String> names = new ArrayList<>(n);
		List<Integer> IDs = new ArrayList<>(n);
		List<Double> salarys = new ArrayList<>(n);
		
		for(int i=0; i >n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i+1));
			names.add(sc.next());
			IDs.add(sc.nextInt());
			salarys.add(sc.nextDouble());	
		}
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		
		sc.close();
	}
}
