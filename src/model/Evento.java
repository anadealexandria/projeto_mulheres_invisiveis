package model;

public class Evento {
	private String nome;
	private String data;
	//private GrupoEvento grupo;	
	private String objetivo;
	private double custo;
	
	
	public Evento() {
		
	}

	public Evento(String nome, String data, String objetivo, double custo) {
		this.nome = nome;
		this.data = data;		
		//this.grupo = grupo;		
		this.objetivo = objetivo;
		this.custo = custo;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}	

	//public GrupoEvento getGrupo() {
	//	return grupo;
	//}

	//public void setGrupo(GrupoEvento grupo) {
	//	this.grupo = grupo;
	//}
	
	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}
	
	@Override
	public String toString() {
		return "\nNome: " + nome + "\nData: " + data + "\nObjetivo: " + objetivo + "\nCusto: " + custo;
	}
	
}
