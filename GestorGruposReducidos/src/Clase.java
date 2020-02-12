public class Clase {

	private Asignatura asignatura;
	private Date empieza;
	private Date termina;

	public Clase(Date inicio, Date fin) {
		
		this.empieza = inicio;
		this.termina = fin;
	}
	
	public Date getEmpieza() {
		
		return this.empieza;
	}
	
	public Date getTermina() {
		
		return this.termina;
	}
	
	public Asignatura getAsignatura() {
		
		return this.asignatura;
	}
	
	public boolean equals(Object o) {
		
		Clase cast;
		
		if(this == o) return true;
		if(o instanceof Clase) {
			cast = (Clase) o;
			return cast.empieza.equals(this.empieza) && cast.termina.equals(this.termina) && cast.asignatura.equals(this.asignatura);
		}
		
		return false;
	}
}
