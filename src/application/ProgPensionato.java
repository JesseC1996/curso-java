package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pensionato;

public class ProgPensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o número de quartos que serão registrados: ");
		int n = sc.nextInt();
		Pensionato[] vetor = new Pensionato[10];
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Informe o nome do estudante:");
			String nome = sc.nextLine();
			System.out.print("Informe o email: @");
			String email = sc.nextLine();
			System.out.print("Informe o número do quarto desejado: ");
			int quarto = sc.nextInt();
			vetor[quarto] = new Pensionato(nome, email, quarto);

		}
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null) {
				System.out.println(vetor[i].toString());
			}
		}
		sc.close();
	}
	

}
