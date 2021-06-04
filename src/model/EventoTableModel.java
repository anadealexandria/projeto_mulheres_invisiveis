package model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import servicos.DadosEventos;

public class EventoTableModel extends AbstractTableModel {
	
	private DadosEventos dadosEventos;
	private List<Evento> eventosSelecionados = new ArrayList<>();
	private String[] colunas = {"Nome", "Data", "Objetivo "};
	
	public EventoTableModel() {
		dadosEventos = new DadosEventos();
	}	
	
	public DadosEventos getDadosEventos() {
		return dadosEventos;
	}

	public void setEventosSelecionados(List<Evento> eventosSelecionados) {
		this.eventosSelecionados = eventosSelecionados;
		fireTableDataChanged();
	}

	@Override
	public String getColumnName(int column) {
		return colunas[column];
	}
	@Override
	public int getRowCount() {
		return eventosSelecionados.size();
	}

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	public List<Evento> getEventosSelecionados() {
		return eventosSelecionados;
	}
	
	@Override
	public Object getValueAt(int linha, int coluna) {
		
		switch(coluna) {
		case 0:
			return eventosSelecionados.get(linha).getNome();
		case 1:
			return eventosSelecionados.get(linha).getData();
		case 2:
			return eventosSelecionados.get(linha).getObjetivo();
		
		}
		return null;
	}

	
	
	public Evento selecionaVoluntario(int index) {
		return eventosSelecionados.get(index);
	}		
	
	public void addEventoSelecionado(Evento evento) {
		eventosSelecionados.add(evento);
		fireTableDataChanged();
	}
	
	public void carregarEventosVoluntaria(Voluntaria voluntaria) {
		eventosSelecionados = dadosEventos.buscarEventoPorVoluntaria(voluntaria);
	}
	
	public void carregarEventos() {
		eventosSelecionados = dadosEventos.getEventos();
		fireTableDataChanged();
	}
	
	public void removeEvento(int indice) {
		Evento evento = eventosSelecionados.get(indice);
		dadosEventos.getEventos().remove(evento);
		carregarEventos();
	}

}
