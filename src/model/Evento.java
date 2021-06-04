package model;

import java.util.ArrayList;
import java.util.List;

public class Evento {
	private String nome;
	private String data;	
	private String objetivo;
	private String voluntariaResponsavel;
	private double custo;
	private Disponibilidade turno;
	private List<Voluntaria> voluntariaEventos = new ArrayList<>();
	
	public Evento() {
		
	}

	public Evento(String nome, String data, String objetivo, String voluntariaResponsavel, double custo, Disponibilidade turno) {
		this.nome = nome;
		this.data = data;			
		this.objetivo = objetivo;
		this.voluntariaResponsavel = voluntariaResponsavel;
		this.custo = custo;
		this.turno = turno;
		
	}

	public List<Voluntaria> getVoluntariaEventos() {
		return voluntariaEventos;
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
	
	
	public String getVoluntariaResponsavel() {
		return voluntariaResponsavel;
	}

	public void setVoluntariaResponsavel(String voluntariaResponsavel) {
		this.voluntariaResponsavel = voluntariaResponsavel;
	}

	public Disponibilidade getTurno() {
		return turno;
	}

	public void setTurno(Disponibilidade turno) {
		this.turno = turno;
	}	
	
	public boolean isVoluntarioNoEvento(Voluntaria voluntaria) {
		return voluntariaEventos.indexOf(voluntaria) >= 0;
	}
}
