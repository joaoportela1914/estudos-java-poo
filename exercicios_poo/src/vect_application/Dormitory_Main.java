package vect_application;

import java.util.Locale;
import java.util.Scanner;

import vect_entities.Student;

public class Dormitory_Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("How many rooms will be rented?");
		int n = sc.nextInt();
		String studentName;
		String studentEmail;
		Student[] vect = new Student[10];
		for(int i=0;i<vect.length;i++) {
			System.out.println("Rent #" + (i + 1));
			System.out.print("Name: ");
			sc.nextLine();
			studentName = sc.nextLine();
			System.out.print("Email: ");
			studentEmail = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			vect[roomNumber] = new Student(studentName, studentEmail);
			
		}
		
		System.out.println("Busy Rooms:");
		for(int i=0;i<vect.length;i++) {
			if (vect[i] != null) {
				
				System.out.println((i + ": " +vect[i].getName() + ", " + vect[i].getEmail()));
			}
		}
		sc.close();
	}
}
