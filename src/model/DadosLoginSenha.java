package model;

import java.util.ArrayList;

public class DadosLoginSenha {
	private String login;
	private String senha;
	public static String[] acesso = new String [2];
	
	public DadosLoginSenha() {
		
	}

	public DadosLoginSenha(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		return "\n" + login + "\n" + senha;
	
	}
}
