package entidade;

public class conta {

	private String nome;
	private int numero;
	private double saldo;
	private aplicacao.cores cor;
	public double addconta(double add) {
		return saldo = add;
	}
	
	public conta(String nome, int numero, double saldo, aplicacao.cores cor2) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
		this.setCor(cor2);
	}
	
	public void sacar(double saque) {
		saldo = saldo - saque;
	}
	
	public void depositar(double deposito) {
		saldo = saldo + (deposito);
			
	}
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	@Override
	public String toString() {
		return "Conta [nome =" + nome +", numero " +numero +",saldo =" + saldo + "]";
	}

	public aplicacao.cores getCor() {
		return cor;
	}

	public void setCor(aplicacao.cores cor2) {
		this.cor = cor2;
	}
	}

