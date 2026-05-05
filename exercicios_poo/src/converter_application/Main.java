package converter_application;

import java.util.Locale;
import java.util.Scanner;

import converter_util.Converter;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price?" );
		double dolar_price = sc.nextDouble();
		
	    System.out.print("How many dollars will be bought?");
	    double quantity = sc.nextDouble();
	    
	    System.out.println("Amount to be paid in reais = " + Converter.currencyConverter(quantity , dolar_price));
		
		sc.close();
	}

}
