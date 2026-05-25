package vect_application;

import java.util.Locale;
import java.util.Scanner;

import vect_entities.Student;

public class Dormitory_Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student[] vect = new Student[10];
		
		System.out.print("How many rooms will be rented?");
		int n = sc.nextInt();

	
		for(int i=0;i<n;i++) {
		    System.out.println();
			System.out.println("Rent #" + (i+1));
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			vect[roomNumber] = new Student(name, email);
			
		}
		System.out.println();
		System.out.println("Busy Rooms:");
		for(int i=0;i<vect.length;i++) {
			if (vect[i] != null) {
				
				System.out.println((i + ": " +vect[i].getName() + ", " + vect[i].getEmail()));
			}
		}
		sc.close();
	}
}
