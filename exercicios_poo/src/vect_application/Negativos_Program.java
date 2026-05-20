package vect_application;

import java.util.Locale;
import java.util.Scanner;

public class Negativos_Program {
		public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar?");
		int n = Math.min(sc.nextInt(), 10);
		double vect[] = new double [n];
		
		for(int i = 0; i<vect.length;i++) {
			System.out.println("Digite um número : ");
			vect[i] = sc.nextDouble();
		}
		System.out.println("NUMEROS NEGATIVOS: ");
		for(int i = 0; i<vect.length;i++) {	
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
		}
}
