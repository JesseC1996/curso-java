package entities;

public class ConversosCotacao {
	/*
	 * Fa�a um programa para ler a cota��o do d�lar, e depois um valor em d�lares a
	 * ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai
	 * pagar pelos d�lares, considerando ainda que a pessoa ter� que pagar 6% de IOF
	 * sobre o valor em d�lar. Criar uma classe CurrencyConverter para ser
	 * respons�vel pelos c�lculos.
	 */
	
	public static final double IOF = 0.6;
	
	
	public static double conversor(double valorReais,double cotacaoDolar) {
		return valorReais *cotacaoDolar *(1.0*IOF);
	}
	
}
