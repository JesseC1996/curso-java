package application;

import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com o número de elementos: ");
		
		int n = sc.nextInt();
		
		String[] vetor = new String[n] ;
		System.out.println("Digite os nomes desejados:");
		for(int i =0;i<n;i++) {
			vetor[i]=sc.nextLine();
		}
		
		
		// Para cada ITEM do VETOR 
		for (String item : vetor) {
			System.out.println(item);
		}
	}

}
