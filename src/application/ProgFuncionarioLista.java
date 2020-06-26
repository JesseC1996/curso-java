package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employer;

public class ProgFuncionarioLista {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e
		 * salario) de N funcionários. Não deve haver repetição de id. Em seguida,
		 * efetuar o aumento de X por cento no salário de um determinado funcionário.
		 * Para isso, o programa deve ler um id e o valor X. Se o id informado não
		 * existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a
		 * listagem atualizada dos funcionários, conforme exemplos. Lembre-se de aplicar
		 * a técnica de encapsulamento para não permitir que o salário possa ser mudado
		 * livremente. Um salário só pode ser aumentado com base em uma operação de
		 * aumento por porcentagem dada.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o número de funcionários que deseja cadastrar: ");
		int n = sc.nextInt();
		List<Employer> lista= new ArrayList<>();
		for (int i =0;i<n;i++) {
			System.out.println();
			System.out.println("Empregado #"+(i+1)+":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			Double salario = sc.nextDouble();
			
			Employer emp = new Employer(id,nome,salario);
			lista.add(emp);
		}
		 System.out.println("Informe o id do empregado que terá o salário incrementado:");
		 int idsalario = sc.nextInt();
	 	Integer pos = posicao(lista,idsalario);
		if(pos == null) {
			System.out.println("Esse id não existe.");
		}else {
			System.out.println("Entre com a porcentagem: ");
			double porcentagem = sc.nextDouble();
			lista.get(pos).aumentarSalario(porcentagem);
		}
		System.out.println();
		System.out.println("Lista de empregados: ");
		for(Employer emp : lista) {
			System.out.println(emp);
		}
		sc.close();

	}
	public static Integer posicao(List<Employer>lista,int id) {
		for(int i =0;i<lista.size();i++) {
			if(lista.get(i).getId()==id) {
				return i;
			}
		}
		return null;
	}

}
