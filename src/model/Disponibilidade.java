package model;

public class Disponibilidade {
	
	private boolean manha;
	private boolean tarde;
	private boolean noite;
	
	public Disponibilidade() {
		
	}	
	
	public Disponibilidade(boolean manha, boolean tarde, boolean noite) {
		this.manha = manha;
		this.tarde = tarde;
		this.noite = noite;
	}

	public boolean isManha() {
		return manha;
	}
	public void setManha(boolean manha) {
		this.manha = manha;
	}
	public boolean isTarde() {
		return tarde;
	}
	public void setTarde(boolean tarde) {
		this.tarde = tarde;
	}
	public boolean isNoite() {
		return noite;
	}
	public void setNoite(boolean noite) {
		this.noite = noite;
	}
	
	

}
