package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Name: ");
		String name= sc.nextLine();
		System.out.print("Preço: ");
		double price = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		int quantity = sc.nextInt();
		
		 
		System.out.println();
		System.out.print ("Entre com o número de produtos para ser adicionado ao estoque: ");
		quantity = sc.nextInt();
		Product product = new Product(name,price,quantity);
		product.addProducts(quantity);
		
		System.out.println();
		System.out.print ("Atualizar dados: "+product);
		
		System.out.println();
		System.out.print ("Entre com o número de produtos à ser removido do estoque: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.print("Atualizar dados: "+product);
		
		
		sc.close();
	}

}
