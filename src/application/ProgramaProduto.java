package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class ProgramaProduto {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Informe o n�mero de produtos � serem cadastrados: ");
		 int n = sc.nextInt();
		 Produto[] vetor = new Produto[n];
		 
		 
		 for(int i =0;i<n;i++) {
			 sc.nextLine();//para consumir a linha que n�o foi pulada anteriormente
			 System.out.print("Informe o nome do produto: ");
			 String nome = sc.nextLine();
			 System.out.print("Informe o pre�o do produto: R$");
			 double preco = sc.nextDouble();
			 
			 vetor [i] = new Produto(nome,preco);
			 
		 }
		 double soma = 0.0;
		 for(int i=0;i<n;i++) {
			 soma += vetor[i].getPreco();
		 }
		 
		 double media = soma/n;
		 
		 System.out.printf("A media do pre�o �: R$ %.2f",media);
	}

}
