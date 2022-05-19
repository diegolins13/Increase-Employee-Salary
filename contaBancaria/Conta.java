package entidades;

public class Conta {

	private int numero;
	private String nome;
	private double saldo;
	
	public Conta() {
		super();
	}

	public Conta(int numero, String nome, double saldo) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void numeroConta(int numero) {
		this.numero = numero;
	}
	
	public void deposito(double deposito) {
		this.saldo += deposito; 
	}
	
	public void saque(double saque) {
		this.saldo = (this.saldo - saque) - 5.00;
	}
	
	public String toString() {
		return "Conta: "
				+ this.numero
				+ ", Titular: "
				+ this.nome
				+ ", Saldo: R$ "
				+ String.format("%.2f", this.saldo);
	}
}
