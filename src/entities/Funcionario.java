package entities;

public class Funcionario {
	/*
	 * Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e
	 * imposto). Em seguida, mostrar os dados do funcion�rio (nome e sal�rio
	 * l�quido). Em seguida, aumentar o sal�rio do funcion�rio com base em uma
	 * porcentagem dada (somente o sal�rio bruto � afetado pela porcentagem) e
	 * mostrar novamente os dados do funcion�rio.
	 */
	public String nome;
	public double salarioBruto;
	public double taxa;
	
	public double netSalario() {
		return salarioBruto - taxa;
	}
	public void incrementarSal(double porcentagem) {
		salarioBruto += salarioBruto * porcentagem / 100.0;
	}
	public String toString() {
		return nome + ", $ " + String.format("%.2f", netSalario());
	}
}
