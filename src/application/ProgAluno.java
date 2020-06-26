package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class ProgAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Aluno aluno = new Aluno();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do aluno: ");
		aluno.nome = sc.nextLine();
		System.out.println("Informe as 3 notas: ");
		aluno.nota1 =sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		double notaFinal = aluno.notaFinal();
		if(notaFinal>60.0) {
		System.out.println("A nota final é: "+notaFinal);
		}else {
			double faltam = aluno.pontosFaltam();
			System.out.println("A nota final é: "+notaFinal);
			System.out.println("Faltam "+ faltam);
		}
	}

}
