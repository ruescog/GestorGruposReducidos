import java.util.AbstractMap;
import java.util.HashMap;

public class Horario {

	private AbstractMap<String, Dia> horario;

	public Horario() {

		this.horario = new HashMap<String, Dia>();
	}

	public boolean añadirDia(String nombreDia, Dia dia) {

		if (this.horario.containsKey(nombreDia))
			return false;

		this.horario.put(nombreDia, dia);
		return true;
	}

	public boolean eliminarDia(String nombreDia) {

		if (this.horario.containsKey(nombreDia))
			this.horario.remove(nombreDia);

		return true;
	}

	public Dia getDia(String dia) {

		if (this.horario.containsKey(dia))
			return this.horario.get(dia);

		return null;
	}
	
	public boolean equals(Object o) {
		
		Horario cast;
		
		if(this == o) return true;
		
		if(o instanceof Horario) {
			cast = (Horario) o;
			
			if(this.horario.size() != cast.horario.size()) return false;
			
			for(Dia d : this.horario.values()) if(!cast.horario.containsValue(d)) return false; 
			
			return true;
		}
		
		return false;
	}
}
