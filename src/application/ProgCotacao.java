package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ConversosCotacao;

public class ProgCotacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Informe a cotação do dólar: ");
		double cotacaoDolar = sc.nextDouble();
		System.out.println("Quantos dolares deseja comprar? ");
		double valorReais = sc.nextDouble();
		
		double total = ConversosCotacao.conversor(valorReais, cotacaoDolar);
		System.out.printf("O total a ser pago em reais é: R$%.2f",total);
	}

}
