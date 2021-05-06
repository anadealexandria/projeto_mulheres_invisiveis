package model;

public class Voluntaria {
	
	private String nome;
	private String telefone;
	private String disponibilidadeTempo;
	
	public Voluntaria() {
		
	}
	public Voluntaria (String nome, String telefone, String disponibilidadeTempo) {
		this.nome = nome;
		this.telefone = telefone;
		this.disponibilidadeTempo = disponibilidadeTempo;
	}
	
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String gettelefone() {
		return telefone;
	}
	public void settelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getdisponibilidadeTempo() {
		return disponibilidadeTempo;
	}
	public void setdisponibilidadeTempo() {
		this.disponibilidadeTempo = disponibilidadeTempo;
	}
}
