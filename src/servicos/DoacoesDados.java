package servicos;

import java.util.ArrayList;
import java.util.List;

import enums.DoacaoEnum;
import model.Doacao;

public class DoacoesDados {
	
	private static List<Doacao> doacoes = new ArrayList<>();
	
	public DoacoesDados() {
		if (doacoes.isEmpty()) {
		Doacao doacao = new Doacao(12.90, "Doação feita pelo prefeito", 
				false, "Prefeito", false, DoacaoEnum.DINHEIRO);
		adicionaDoacao(doacao);
		}
	}

	public static List<Doacao> getDoacoes() {
		return doacoes;
	}
		
	public void adicionaDoacao(Doacao doacao) {
		doacoes.add(doacao);
	}
	
	public void removeDoacao(Doacao doacao) {
		doacoes.remove(doacao);
			
		}
	}

