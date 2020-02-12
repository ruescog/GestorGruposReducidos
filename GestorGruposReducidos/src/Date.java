public class Date {

	private int hora;
	private int minuto;

	public Date(int hora, int minuto) {

		this.hora = hora;
		this.minuto = minuto;
	}

	public int getHoras() {

		return this.hora;
	}

	public int getMinutos() {

		return this.minuto;
	}

	// date != null;
	public boolean antesDe(Date date) {

		if (this.hora == date.hora) {
			return this.minuto < date.minuto;
		} else
			return this.hora < date.hora;
	}

	// date != null
	public boolean despuesDe(Date date) {

		if (this.equals(date))
			return false;

		if (this.antesDe(date))
			return false;

		return true;
	}

	public boolean mismaHora(Date date) {

		if (date == null)
			return false;

		return this.hora == date.hora;
	}

	public boolean mismoMinuto(Date date) {

		if (date == null)
			return false;

		return this.minuto == date.minuto;
	}

	public boolean equals(Object o) {

		Date cast;

		if (this == o)
			return true;

		if (o instanceof Date) {
			cast = (Date) o;

			return this.hora == cast.hora && this.minuto == cast.minuto;
		}

		return false;
	}
}
