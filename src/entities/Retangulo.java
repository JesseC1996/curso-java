package entities;

public class Retangulo {
	/*
	 * Fazer um programa para ler os valores da largura e altura de um ret�ngulo. Em
	 * seguida, mostrar na tela o valor de sua �rea, per�metro e diagonal.
	 */
	
	public double largura;
	public double altura;
	
	public double area() {
		return altura*largura;
	}
	public double perimetro() {
		return 2*altura + 2*largura;
	}
	public double diagonal() {
		return Math.sqrt(altura*altura+largura*largura);
	}
}
