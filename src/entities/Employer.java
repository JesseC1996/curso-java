package entities;

public class Employer {
	private String nome;
	private Integer id;
	private Double salario;
	
	public Employer(Integer id,String nome,Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	public void setId(Integer id) {
		this.id  = id;
	}
	public Integer getId( ) {
		return id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double porcentagem) {
		salario += salario * porcentagem /10.0;
		
	}
	public String toString() {
		return id+", "+nome+", "+String.format("%.2f", salario);
	}
	
	
}
