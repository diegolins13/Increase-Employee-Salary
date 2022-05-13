package entities;

public class ClasseFuncionario {

	private Integer id;
	private String nome;
	private Double salario;
	
	public ClasseFuncionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getnome() {
		return nome;
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public Double getsalario() {
		return salario;
	}
	
	public void setsalario(Double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double porcentagem) {
		salario += salario * porcentagem /100;
	}
	
	public String toString() {
		return "ID: " + id
				+ ", "
				+ "Nome: " + nome
				+ ", "
				+ "Salario: " + String.format("%.2f%n", salario);
	}
	
}
