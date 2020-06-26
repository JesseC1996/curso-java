package application;

import java.util.Scanner;

public class Matriz2 {
	/*
	 * Fazer um programa para ler dois n�meros inteiros M e N, e depois ler uma
	 * matriz de M linhas por N colunas contendo n�meros inteiros, podendo haver
	 * repeti��es. Em seguida, ler um n�mero inteiro X que pertence � matriz. Para
	 * cada ocorr�ncia de X, mostrar os valores � esquerda, acima, � direita e
	 * abaixo de X, quando houver, conforme exemplo.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print ("Informe o n�mero de linhas: ");
		int n = sc.nextInt();
		System.out.print ("Informe o n�mero de colunas: ");
		int m = sc.nextInt();
		
		int[][] mat = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				mat[i][j] = sc.nextInt();
				}
		}
		System.out.print("Informe o n�mero a ser analisado: ");
		int x = sc.nextInt();
		
		for(int i =0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(x == mat[i][j]) {
					 System.out.println("Posi��o"+i+","+j+":");
					 if(j>0) {
						 System.out.println("� esquerda: "+mat[i][j-1]);
					 }
					if(i>0) {
						System.out.println("Acima: "+mat[i-1][j]);
					}
					if(j<mat[i].length-1) {
						System.out.println("� direita: "+ mat[i][j+1]);
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
