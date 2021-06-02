package model;

import enums.PerfisEnum;

public class Funcionaria extends Usuario{
	
	private String matricula;
	
	public Funcionaria() {
		
	}
	
	public Funcionaria (String nome, String email, String senha,
			String cpfCnpj, String matricula) {
	super(nome, email, senha, cpfCnpj, PerfisEnum.FUNCIONARIO);
	this.matricula = matricula;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setString (String matricula) {
		this.matricula = matricula;
	}
}
