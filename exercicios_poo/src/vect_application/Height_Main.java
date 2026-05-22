package vect_application;

import java.util.Locale;
import java.util.Scanner;

public class Height_Main {
	public static void main(String[] args) {
			
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	System.out.println("Quantas pessoas serao digitadas?");
	int n = sc.nextInt();
	
	String name[] = new String [n];
	int age[] = new int [n];
	double height[] = new double [n];
	double menores = 0.0;
	
	double sum = 0.0;
	
	for (int i=0; i<name.length; i++) {
		System.out.println("Dados da " + (i + 1) +"a pessoa:");
		System.out.print("Nome:");
		name[i]= sc.next();
		System.out.print("Idade:");
		age[i] = sc.nextInt();
		System.out.print("Altura:");
		height[i] = sc.nextDouble();
		sum+= height[i];
	}
	
	double avg = sum / height.length;
	System.out.println();
	System.out.printf("Altura media: %.2f%n " , avg);
	
	for (int i=0; i<age.length; i++) {
		if (age[i] < 16) {
			menores ++;
		}	
	} 
	double percent = (menores / n) * 100;
	System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);
	for (int i=0; i<age.length; i++) {
		if (age[i] < 16) {
			System.out.println(name[i]);
		}	
	}
	sc.close();
	}
}
