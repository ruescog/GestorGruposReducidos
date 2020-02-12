public class Asignatura {

	private String codigo;
	private String nombre;

	public Asignatura(String codigo, String nombre) {

		this.codigo = codigo;
		this.nombre = nombre;
	}

	public String getCodigo() {

		return this.codigo;
	}

	public String getNombre() {

		return this.nombre;
	}

	public boolean equals(Object o) {

		Asignatura cast;

		if (this == o)
			return true;

		if (o instanceof Asignatura) {
			cast = (Asignatura) o;

			return this.codigo == cast.codigo;
		}

		return false;
	}
}
