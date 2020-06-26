package application;

import java.util.Scanner;

public class Matriz2 {
	/*
	 * Fazer um programa para ler dois números inteiros M e N, e depois ler uma
	 * matriz de M linhas por N colunas contendo números inteiros, podendo haver
	 * repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para
	 * cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e
	 * abaixo de X, quando houver, conforme exemplo.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print ("Informe o número de linhas: ");
		int n = sc.nextInt();
		System.out.print ("Informe o número de colunas: ");
		int m = sc.nextInt();
		
		int[][] mat = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				mat[i][j] = sc.nextInt();
				}
		}
		System.out.print("Informe o número a ser analisado: ");
		int x = sc.nextInt();
		
		for(int i =0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(x == mat[i][j]) {
					 System.out.println("Posição"+i+","+j+":");
					 if(j>0) {
						 System.out.println("À esquerda: "+mat[i][j-1]);
					 }
					if(i>0) {
						System.out.println("Acima: "+mat[i-1][j]);
					}
					if(j<mat[i].length-1) {
						System.out.println("À direita: "+ mat[i][j+1]);
					}
					if(i<mat.length-1) {
						System.out.println("Abaixo: "+mat[i+1][j]);
					}
				}
			}
		}
		sc.close();
	}
	
	 

}
