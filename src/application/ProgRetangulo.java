package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class ProgRetangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	 
	 Retangulo retangulo = new Retangulo();
	 
	 System.out.println("Informe a altura do ret�ngulo: ");
	 retangulo.altura= sc.nextDouble();
	 System.out.println("Informe a largura do ret�ngulo: ");
	 retangulo.largura= sc.nextDouble();
	 
	 System.out.printf("�rea: %.2f%n",retangulo.area());
	 System.out.printf("Perimetro: %.2f%n",retangulo.perimetro());
	 System.out.printf("Diagonal: %.2f%n",retangulo.diagonal());
	 
	 
	 
	 sc.close();
	}

}
