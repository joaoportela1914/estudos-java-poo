package vect_application;

import java.util.Locale;
import java.util.Scanner;

public class Height_Main {
	public static void main(String[] args) {
			
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	System.out.println("Quantas pessoas serao digitadas?");
	int n = sc.nextInt();
	
	String vect1[] = new String [n];
	int vect2[] = new int [n];
	double vect3[] = new double [n];
	double menores = 0.0;
	
	double sum = 0.0;
	
	for (int i=0; i<vect1.length; i++) {
		System.out.println("Dados da " + (i + 1) +"a pessoa:");
		System.out.print("Nome:");
		vect1[i]= sc.next();
		System.out.print("Idade:");
		vect2[i] = sc.nextInt();
		System.out.print("Altura:");
		vect3[i] = sc.nextDouble();
		sum+= vect3[i];
	}
	
	double avg = sum / vect3.length;
	System.out.println("Altura media: " + avg);
	
	System.out.println("Pessoas com menos de 16 anos: ");
	for (int i=0; i<vect2.length; i++) {
		if (vect2[i] < 16) {
			menores ++;
		}	
	} 
	System.out.println(( (menores / n) * 100 + "%"));
	for (int i=0; i<vect2.length; i++) {
		if (vect2[i] < 16) {
			System.out.println(vect1[i]);
		}	
	}
	sc.close();
	}
}
