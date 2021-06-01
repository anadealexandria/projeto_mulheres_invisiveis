package model;

import javax.swing.table.AbstractTableModel;

import servicos.DoacoesDados;

public class DoacaoTableModel extends AbstractTableModel {
	
	
	private DoacoesDados doacoesDados;
	private String[] colunas = {"Quantidade", "Descrição", "Doador", "Tipo de Doacao"};
	
	public DoacaoTableModel() {
		doacoesDados = new DoacoesDados();
	}
	
	@Override
	public String getColumnName(int column) {
		return colunas[column];
	}
	
	@Override
	public int getRowCount() {
		return DoacoesDados.getDoacoes().size();
		
	}	

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public Object getValueAt(int linha, int coluna) {
		
		switch(coluna) {
		case 0:
			return DoacoesDados.getDoacoes().get(linha).getQuantidade();
		case 1:
			return DoacoesDados.getDoacoes().get(linha).getDescricao();
		case 2:
			return DoacoesDados.getDoacoes().get(linha).getDoador();
		case 3:
			return DoacoesDados.getDoacoes().get(linha).getTipoDoacao();
		}
		return null;
	}
	
	public void removeDoacao(int linha) {
		doacoesDados.removeDoacao(DoacoesDados.getDoacoes().get(linha));
		this.fireTableRowsDeleted(linha, linha);
	}
	
}

