package model;

import enums.PerfisEnum;

public class Voluntaria extends Usuario {
	
	private Disponibilidade disponibilidade;
	
	public Voluntaria() {
		
	}

	public Voluntaria(String nome, String email,
			String senha, String cpfCnpj, Disponibilidade disponibilidade) {
		super(nome, email, senha, cpfCnpj, PerfisEnum.VOLUNTARIA);
		this.disponibilidade = disponibilidade;
	}

	public Disponibilidade getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(Disponibilidade disponibilidade) {
		this.disponibilidade = disponibilidade;
	}	
	
	
}
