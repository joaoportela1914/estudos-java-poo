package poly_application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import poly_entities.ImportedProduct;
import poly_entities.Product;
import poly_entities.UsedProduct;

public class MainProduct {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		List<Product> list = new ArrayList<>();
		
		
		System.out.print("Enter the number of products:");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (ch == 'c') {
				Product product = new Product(name, price);
				list.add(product);
			}
			if (ch == 'i') {
				System.out.print("Customs fee: ");
				double customs = sc.nextDouble();
				Product importProduct = new ImportedProduct(name, price, customs);
				list.add(importProduct);
			}
			if (ch == 'u') {
				System.out.println("Manufacture date (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), fmt);
				Product usedProduct = new UsedProduct(name, price, date);
				list.add(usedProduct);
			}
		}
		
		 System.out.println("PRICE TAGS");
		 for (Product prods : list) {
			 System.out.println(prods.priceTag());
		 }
		
		sc.close();
	}

}
