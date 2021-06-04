 package model;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import enums.PerfisEnum;
import servicos.UsuariosDados;

public class VoluntarioTableModel extends AbstractTableModel{
	
	private UsuariosDados usuariosDados;
	private List<Voluntaria> voluntarios;
	private String[] colunas = {"Nome", "CPF/CNPJ"};
	
	public VoluntarioTableModel() {
		usuariosDados = new UsuariosDados();
		voluntarios = new ArrayList<>();
		addVoluntarios();
	}
	
	

	public List<Voluntaria> getVoluntarios() {
		return voluntarios;
	}


	@Override
	public String getColumnName(int column) {
		return colunas[column];
	}
	@Override
	public int getRowCount() {
		return voluntarios.size();
	}

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public Object getValueAt(int linha, int coluna) {
		
		switch(coluna) {
		case 0:
			return voluntarios.get(linha).getNome();
		case 1:
			return voluntarios.get(linha).getCpfCnpj();
		}
		return null;
	}
	
	public void addVoluntarios() {
		List<Usuario> listaAuxiliar = usuariosDados.buscaPorPerfil(PerfisEnum.VOLUNTARIA);
		for (Usuario voluntario: listaAuxiliar) {
			voluntarios.add((Voluntaria) voluntario);
		}
		
		
	}
	
	public void removeVoluntario(int linha) {
		usuariosDados.removerUsuario(voluntarios.get(linha));
		this.voluntarios.remove(linha);
		this.fireTableRowsDeleted(linha, linha);
	}
	
	public Voluntaria selecionaVoluntario(int index) {
		return voluntarios.get(index);
	}
	
	public void carregarDados(List<Voluntaria> voluntarias) {
		voluntarios.clear();
		addVoluntarios();
		fireTableDataChanged();	
		}
}

