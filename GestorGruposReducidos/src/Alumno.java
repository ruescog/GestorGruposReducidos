public class Alumno {
	
	private String cuasi;
	private Horario horario;
	
	public Alumno(String cuasi, Horario horario) {
		
		this.cuasi = cuasi;
	}

	public String getCuasi() {
		
		return this.cuasi;
	}
	
	public Horario getHorario() {
		
		return this.horario;
	}
}
