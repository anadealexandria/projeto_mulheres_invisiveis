 package servicos;

import java.util.ArrayList;
import java.util.List;

import model.Disponibilidade;
import model.Evento;
import model.Voluntaria;

public class DadosEventos {

	private static List<Evento> eventos = new ArrayList<>();
	 
	public DadosEventos() {
		if (eventos.isEmpty()) {
			Disponibilidade dispoEventoZero = new Disponibilidade(true, false, false);
			Evento evento = new Evento("Mulheres Unidas", "09/08/2021", "Arrecadar verba",
					"Ana Paula", 300.00, dispoEventoZero);
			eventos.add(evento);
		}
		
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}
	
	public List<Evento> buscarEvento(Disponibilidade turno){
		List<Evento> eventosTurno = new ArrayList<>();
		for(Evento evento: eventos) {
			if ((evento.getTurno().isManha() && turno.isManha()) || 
					(evento.getTurno().isTarde() && turno.isTarde()) ||
					(evento.getTurno().isNoite() && turno.isNoite())){
				eventosTurno.add(evento);
			}
		}
		return eventosTurno;
	}
	
	public List<Evento> buscarEventoPorVoluntaria(Voluntaria voluntaria){
		List<Evento> eventosVoluntaria = new ArrayList<>();
		for (Evento evento: eventos) {
			if(evento.isVoluntarioNoEvento(voluntaria)) {
				eventosVoluntaria.add(evento);
			}
		}
		return eventosVoluntaria;
	}
}
