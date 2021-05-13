package model;

public class CadastraVoluntaria {
	private String nome;
	private String cpf;
	private String telefone;
	private DadosLoginSenha loginSenha;
	
	public CadastraVoluntaria() {
		
	}
		
	public CadastraVoluntaria(String nome, String cpf, String telefone, DadosLoginSenha loginSenha) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.loginSenha = loginSenha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public DadosLoginSenha getLoginSenha() {
		return loginSenha;
	}

	public void setLoginSenha(DadosLoginSenha loginSenha) {
		this.loginSenha = loginSenha;
	}
	
	
}
