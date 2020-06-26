package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculadora;

public class ProgCalc {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o radio: ");
		double radius = sc.nextDouble();
		
		double c = Calculadora.circumference(radius);
		double v = Calculadora.volume(radius);
		
		System.out.printf("Circunferência: %.2f%n",c);
		System.out.printf("Volume: %.2f%n",v);
		System.out.printf("Valor de PI: %.2f%n",Calculadora.PI);

	}

}
