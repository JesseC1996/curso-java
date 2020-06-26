package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ProgUsuario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		System.out.println("Informe o nome:");
		funcionario.nome = sc.nextLine();
		System.out.println("Informe o salario bruto: ");
		funcionario.salarioBruto  = sc.nextDouble();
		System.out.println("Informe a taxa: ");
		funcionario.taxa = sc.nextDouble();
		
		System.out.println("Empregado: "+funcionario);
		System.out.println("Qual a porcentagem que deseja incrementar o salario?");
		double porcentagem = sc.nextDouble();
		funcionario.incrementarSal(porcentagem);
		System.out.println("Empregado: "+funcionario);
		sc.close();
	}

}
