package entidade;

import aplicacao.cores;

public class contacomercial  extends conta{
	
	private double limite;

	public contacomercial(String nome, int numero, double saldo, cores cor, double limite) {
		super(nome, numero, saldo, cor);
		this.limite = limite;
	}
	
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public String agua() {

		return toString()+ "limite" + limite;
	}

	public void depositar(int deposito) {
		// TODO Auto-generated method stub
		
	}

	}	
