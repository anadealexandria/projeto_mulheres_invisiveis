package model;

import java.util.ArrayList;

public class Receita {
	public static ArrayList<Double> receitas = new ArrayList<>();
	public static Double receitaTotal = 0.0;
	
	public Receita() {
		
	}	
	

	public static Double receitaTotal() {
		
		for(int i = 0 ; i < receitas.size() ; i++) {
			double valores = 0.0;
			valores = ((Double) receitas.get(i)).doubleValue();
			receitaTotal += valores;
		}
		System.out.println("Receita Total: " + receitaTotal);
		return receitaTotal;
	}
		
		
	@Override
	public String toString() {
		return "\n               Receita Total: " + receitaTotal;
	}
	
}
