import java.util.AbstractMap;
import java.util.HashMap;

public class Horario {

	private AbstractMap<String, Dia> horario;

	public Horario() {

		this.horario = new HashMap<String, Dia>();
	}
}
