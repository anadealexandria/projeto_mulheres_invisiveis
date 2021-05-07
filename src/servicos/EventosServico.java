package servicos;

import java.util.ArrayList;
import java.util.List;

import model.Evento;

public class EventosServico {
	private static List<Evento> eventos = new ArrayList<>();
	
	public void adicionar(Evento evento) {
		eventos.add(evento);
	}
	
	public List<Evento> listar() {
		return eventos;
	}
}
