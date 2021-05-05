package model;

public class Evento {
	private String nome;
	private String data;
	private int duracao;
	private GrupoEvento grupo;
	private Voluntaria responsavel;
	private String objetivo;
	private double custo;
	private String parceria;
	
	public Evento() {
		
	}

	public Evento(String nome, String data, int duracao, GrupoEvento grupo, Voluntaria responsavel, String objetivo,
			double custo, String parceria) {
		this.nome = nome;
		this.data = data;
		this.duracao = duracao;
		this.grupo = grupo;
		this.responsavel = responsavel;
		this.objetivo = objetivo;
		this.custo = custo;
		this.parceria = parceria;
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

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public GrupoEvento getGrupo() {
		return grupo;
	}

	public void setGrupo(GrupoEvento grupo) {
		this.grupo = grupo;
	}

	public Voluntaria getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Voluntaria responsavel) {
		this.responsavel = responsavel;
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

	public String getParceria() {
		return parceria;
	}

	public void setParceria(String parceria) {
		this.parceria = parceria;
	}
	
	
	
}
