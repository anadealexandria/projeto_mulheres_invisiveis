package model;

import java.util.ArrayList;
import java.util.List;

public class Evento {
	private String nome;
	private String data;	
	private String objetivo;
	private double custo;
	public static List<Evento> eventos = new ArrayList<>();
	
	public Evento() {
		
	}

	public Evento(String nome, String data, String objetivo, double custo) {
		this.nome = nome;
		this.data = data;			
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
		return "\n      Nome: " + nome + "\n      Data: " + data + "\n      Objetivo: " + objetivo + "\n      Custo: " + custo + "\n";
		
	}
	
}
