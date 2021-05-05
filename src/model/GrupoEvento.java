package model;

public class GrupoEvento {
	private Voluntaria voluntaria1;
	private Voluntaria voluntaria2;
	private Voluntaria voluntaria3;
	
	public GrupoEvento() {
		
	}

	public GrupoEvento(Voluntaria voluntaria1, Voluntaria voluntaria2, Voluntaria voluntaria3) {
		this.voluntaria1 = voluntaria1;
		this.voluntaria2 = voluntaria2;
		this.voluntaria3 = voluntaria3;
	}

	public Voluntaria getVoluntaria1() {
		return voluntaria1;
	}

	public void setVoluntaria1(Voluntaria voluntaria1) {
		this.voluntaria1 = voluntaria1;
	}

	public Voluntaria getVoluntaria2() {
		return voluntaria2;
	}

	public void setVoluntaria2(Voluntaria voluntaria2) {
		this.voluntaria2 = voluntaria2;
	}

	public Voluntaria getVoluntaria3() {
		return voluntaria3;
	}

	public void setVoluntaria3(Voluntaria voluntaria3) {
		this.voluntaria3 = voluntaria3;
	}
	
	 
}
