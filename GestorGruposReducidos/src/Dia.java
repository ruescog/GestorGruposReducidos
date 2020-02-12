import java.util.LinkedList;

public class Dia {

	private LinkedList<Clase> clases;

	public Dia(LinkedList<Clase> lista) {

		this.clases = lista;
	}

	public LinkedList<Clase> getClases() {

		return this.clases;
	}

	public boolean añadirClase(Clase clase) {

		int clasesPrevias;

		if (this.clases == null)
			this.clases = new LinkedList<>();

		clasesPrevias = 0;
		for (Clase c : this.clases) { // mejorar eficiencia haciendo que se salga si ya ha pasado
			if (c.getTermina().antesDe(clase.getEmpieza()))
				clasesPrevias++;
		}
		
		this.clases.add(clasesPrevias, clase); //añade la clase en ese momento

		return true;
	}

	public boolean eliminarClase(Clase clase) {

		if (this.clases == null)
			return true;

		return this.clases.remove(clase);
	}

	public boolean tieneClase(Date horaInicio) {

		if (this.clases == null)
			return false;

		for (Clase c : this.clases)
			if (c.getEmpieza().mismaHora(horaInicio))
				return true;

		return false;
	}
}
