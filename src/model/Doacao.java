package model;

import java.time.LocalDateTime;

import enums.DoacaoEnum;

public class Doacao {

	private double quantidade;
	private String descricao;
	private boolean recorrente;
	private String doador;
	private boolean coleta;
	private LocalDateTime dataHora;
	private DoacaoEnum tipoDoacao;
	
	public Doacao () {
		
	}

	public Doacao(double valor, String descricao, boolean recorrente, String doador, boolean coleta,
			 DoacaoEnum tipoDoacao) {
		this.quantidade = valor;
		this.descricao = descricao;
		this.recorrente = recorrente;
		this.doador = doador;
		this.coleta = coleta;
		this.dataHora = LocalDateTime.now();
		this.tipoDoacao = tipoDoacao;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setValor(double valor) {
		this.quantidade = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isRecorrente() {
		return recorrente;
	}

	public void setRecorrente(boolean recorrente) {
		this.recorrente = recorrente;
	}

	public String getDoador() {
		return doador;
	}

	public void setDoador(String doador) {
		this.doador = doador;
	}

	public boolean isColeta() {
		return coleta;
	}

	public void setColeta(boolean coleta) {
		this.coleta = coleta;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public DoacaoEnum getTipoDoacao() {
		return tipoDoacao;
	}

	public void setTipoDoacao(DoacaoEnum tipoDoacao) {
		this.tipoDoacao = tipoDoacao;
	}
}
