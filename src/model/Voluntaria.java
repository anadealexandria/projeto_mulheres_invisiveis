package model;

import java.util.ArrayList;
import java.util.List;

public class Voluntaria {
	private String nome;
	private String cpf;
	private String telefone;
	
	public static List<Voluntaria> voluntarias = new ArrayList<>();
	
	public Voluntaria() {
		
	}
		
	public Voluntaria(String nome, String cpf, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		
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
	
	@Override
	public String toString() {
		return "\n    Nome: " + nome + "\n    CPF: " + cpf + "\n    Telefone: " + telefone + "\n";
	}
}
