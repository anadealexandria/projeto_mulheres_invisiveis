package model;

public class Doador {

		private String nome;
		private  String cpfCnpj;
		private double doacao;
		
		public Doador() {
}
		public Doador (String nome, String cpfCnpj, double doacao ) {
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
		
		public double getdoa�ao() {
			return doacao;
		}
		
		public void setdoa�ao(double doacao) {
			this.doacao = doacao;
		}
}
