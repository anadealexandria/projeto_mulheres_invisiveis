package model;

import java.util.ArrayList;

public class Doador {

		private String nome;
		private  String cpfCnpj;
		private Doacao doacao;
		public static ArrayList<Doador> doadores = new ArrayList<>();
		
		public Doador() {
		}
		
		public Doador (String nome, String cpfCnpj, Doacao doacao ) {
			this.nome = nome;
			this.cpfCnpj = cpfCnpj;
			this.doacao = doacao;
		}
		
		public String getnome() {
			return nome;
		}
		
		public void setnome(String nome) {
			this.nome = nome;
		}
		
		public String getcpfCnpj() {
			return cpfCnpj;
		}
		
		public void setcpfCnpj(String cpfCnpj) {
			this.cpfCnpj = cpfCnpj;
		}
		
		public Doacao getdoaçao() {
			return doacao;
		}
		
		public void setdoaçao(Doacao doacao) {
			this.doacao = doacao;
		}
		
		@Override
		public String toString() {
			return "\n    Nome do doador(a): " + nome + "\n    CPF/CNPJ: " + cpfCnpj + "\n    Doação:" + doacao + "\n";
		}
}
