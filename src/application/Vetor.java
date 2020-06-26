package application;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
	 Locale.setDefault(Locale.US);
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 double [] vetor = new double[n];
	 double soma = 0;
	 for(int i =0; i<n;i++) {
		 vetor[i]=sc.nextDouble();
		  soma += vetor[i];
		  
	 }
	 System.out.printf("A média das alturas é: %.2f%n",soma/n);
	 
	 sc.close();
	}

}
