package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employer;

public class ProgFuncionarioLista {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um n�mero inteiro N e depois os dados (id, nome e
		 * salario) de N funcion�rios. N�o deve haver repeti��o de id. Em seguida,
		 * efetuar o aumento de X por cento no sal�rio de um determinado funcion�rio.
		 * Para isso, o programa deve ler um id e o valor X. Se o id informado n�o
		 * existir, mostrar uma mensagem e abortar a opera��o. Ao final, mostrar a
		 * listagem atualizada dos funcion�rios, conforme exemplos. Lembre-se de aplicar
		 * a t�cnica de encapsulamento para n�o permitir que o sal�rio possa ser mudado
		 * livremente. Um sal�rio s� pode ser aumentado com base em uma opera��o de
		 * aumento por porcentagem dada.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o n�mero de funcion�rios que deseja cadastrar: ");
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
			System.out.print("Sal�rio: ");
			Double salario = sc.nextDouble();
			
			Employer emp = new Employer(id,nome,salario);
			lista.add(emp);
		}
		 System.out.println("Informe o id do empregado que ter� o sal�rio incrementado:");
		 int idsalario = sc.nextInt();
	 	Integer pos = posicao(lista,idsalario);
		if(pos == null) {
			System.out.println("Esse id n�o existe.");
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
