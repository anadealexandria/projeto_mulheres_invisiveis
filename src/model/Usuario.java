package model;

import enums.PerfisEnum;

public class Usuario {
	private String nome;
	private String email;
	private String senha;
	private String cpfCnpj;
	private PerfisEnum perfil;
	
	public Usuario() {
		
	}
	
	public Usuario(String nome, String email, String senha, String cpfCnpj, PerfisEnum perfil) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.cpfCnpj = cpfCnpj;
		this.perfil = perfil;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public PerfisEnum getPerfil() {
		return perfil;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public void setPerfil(PerfisEnum perfil) {
		this.perfil = perfil;
	}	
	
	
}
