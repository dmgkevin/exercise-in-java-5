package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		Product product = new Product(name, price);

		System.out.println();
		System.out.printf("Product data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be added in stock");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.printf("Updated data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be removed from stock");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.printf("Updated data: " + product);

		sc.close();
	}

}
