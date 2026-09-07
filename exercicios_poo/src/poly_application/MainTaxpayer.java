package poly_application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import poly_entities.CompanyTaxpayer;
import poly_entities.IndividualTaxpayer;
import poly_entities.Taxpayer;

public class MainTaxpayer {
		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			List<Taxpayer> list = new ArrayList<>();
			
			System.out.print("Enter the number of tax payers:");
			int n = sc.nextInt();
			
			for(int i=1; i<=n; i++) {
				System.out.println("Tax payer #" + i + " data:");
				System.out.print("Individual or company (i/c)?");
				char ch = sc.next().charAt(0);
				System.out.print("Name:");
				String name = sc.next();
				System.out.print("Anual Income:");
				double anualIncome = sc.nextDouble();
				if (ch == 'i') {
					System.out.print("Health expenditures:");
					double healthExpenditures = sc.nextDouble();
					Taxpayer indTaxPayer = new IndividualTaxpayer();
				}
				else {
					System.out.print("Number of employees:");
					double totalEmployees = sc.nextDouble();
					Taxpayer compTaxPayer = new CompanyTaxpayer();
				}
				
				System.out.println();
				System.out.println("TAXES PAID");
				
				double sum=0;
				for (Taxpayer tx1 : list) {
					sum += tx1.tax();
					
				}
				for (Taxpayer tx : list) {
					System.out.println(tx.getName() + ": $ " + tx.tax() );
					
				}
				
				System.out.println("TOTAL TAXES: $ " + sum);
			}
		}
}
