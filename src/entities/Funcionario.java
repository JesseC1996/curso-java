package entities;

public class Funcionario {
	/*
	 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e
	 * imposto). Em seguida, mostrar os dados do funcionário (nome e salário
	 * líquido). Em seguida, aumentar o salário do funcionário com base em uma
	 * porcentagem dada (somente o salário bruto é afetado pela porcentagem) e
	 * mostrar novamente os dados do funcionário.
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
