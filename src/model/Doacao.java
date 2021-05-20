package model;

public class Doacao {

	private double valor;
	
	public Doacao () {
		
	}
	public Doacao (double valor) {
		this.valor = valor;
	
	}
	public double getvalor() {
		return valor;
	}
	
	public void setvalor (double valor) {
		this.valor = valor;
		
	}
	
	@Override
	public String toString() {
		return " " + valor;
	}
}
