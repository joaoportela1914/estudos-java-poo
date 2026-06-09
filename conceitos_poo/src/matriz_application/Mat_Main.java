package matriz_application;

import java.util.Locale;
import java.util.Scanner;

public class Mat_Main {
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		int count = 0;
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
				if (mat[i][j] <0) {
					count++;
				}
			}
		}
		
		System.out.println("Main Diagonal: ");
		for (int i=0; i<mat.length; i++) {
			System.out.println(mat[i][i] + " ");
			
		System.out.println();
		System.out.println("Negative numbers= " + count);
		sc.close();
	}
}}