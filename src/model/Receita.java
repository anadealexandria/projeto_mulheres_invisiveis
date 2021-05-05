package model;

public class Receita {
	private Doador doador;
	
	
	public Receita() {
		
	}

	public Receita(Doador doador) {
		this.doador = doador;
		
	}

	public Doador getDoador() {
		return doador;
	}

	public void setDoador(Doador doador) {
		this.doador = doador;
	}	
	
	public double receitaTotal() {
		
	}
	
}
