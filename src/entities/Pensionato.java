package entities;

public class Pensionato {
	/*
	 * Fazer um programa que inicie com todos os dez quartos vazios, e depois leia
	 * uma quantidade N representando o número de estudantes que vão alugar quartos
	 * (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para
	 * cada registro de aluguel, informar o nome e email do estudante, bem como qual
	 * dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto
	 * vago. Ao final, seu programa deve imprimir um relatório de todas ocupações do
	 * pensionato, por ordem de quarto, conforme exemplo.
	 */
	private String nome;
	private String email;
	private int quarto;
	
	public Pensionato(String nome,String email,int quarto) {
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int getQuarto() {
		return quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}
	public String toString() {
		return "Quarto:"+quarto+
				"Nome do estudante: "+nome
				+ " Email:@"+email
				 ;
	}

}
