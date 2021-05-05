package model;

public class Despesa {
	private Evento evento;
	private Receita receita;
	
	public Despesa() {
		
	}

	public Despesa(Evento evento, Receita receita) {
		this.evento = evento;
		this.receita = receita;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Receita getReceita() {
		return receita;
	}

	public void setReceita(Receita receita) {
		this.receita = receita;
	}
	
	public double despesaTotal() {
		
	}
	
	
}
