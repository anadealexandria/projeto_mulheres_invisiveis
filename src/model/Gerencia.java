package model;

public class Gerencia {
	private Receita receita;
	private Despesa despesa;
	
	public Gerencia() {
		
	}

	public Gerencia(Receita receita, Despesa despesa) {
		this.receita = receita;
		this.despesa = despesa;
	}

	public Receita getReceita() {
		return receita;
	}

	public void setReceita(Receita receita) {
		this.receita = receita;
	}

	public Despesa getDespesa() {
		return despesa;
	}

	public void setDespesa(Despesa despesa) {
		this.despesa = despesa;
	}
	
	public double mostrarReceita() {	
	
	}
	
	public double mostrarDespesa() {
	
	}
	
}
