package model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VoluntariasUtil {
	
	public static List<Voluntaria> lerArquivo(String caminho) throws Exception {
		List<Voluntaria> listaArquivo = new ArrayList<>();
		Disponibilidade disponibilidade = null;
		Voluntaria elementoAdd = null;
		
		Scanner leitura = new Scanner(new File(caminho));
		
		while (leitura.hasNextLine()) {
			String line = leitura.nextLine();
			String[] dados = line.split(",");
			elementoAdd = new Voluntaria();
			
			elementoAdd.setNome(dados[0]);
			elementoAdd.setEmail(dados[1]);
			elementoAdd.setSenha(dados[2]);
			elementoAdd.setCpfCnpj(dados[3]);
			
			if (dados[4].equals("Tarde")) {
				disponibilidade = new Disponibilidade(false, true, false);
			}
			if (dados[4].contentEquals("Noite")) {
				disponibilidade = new Disponibilidade(false, false, true);
			}
			if (dados[4].equals("Manhã") || dados[4].equals("Manha")) {
				disponibilidade = new Disponibilidade(true, false, false);
			}			
			elementoAdd.setDisponibilidade(disponibilidade);
			listaArquivo.add(elementoAdd);
		}
		return listaArquivo;
	}
}
