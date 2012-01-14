package dades;

public class HabitacioId implements java.io.Serializable {
	
	private String nomHotel;
	private int numero;
	
	public HabitacioId(String nomHotel, int numero) {
		this.nomHotel = nomHotel;
		this.numero = numero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nomHotel == null) ? 0 : nomHotel.hashCode());
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HabitacioId other = (HabitacioId) obj;
		if (nomHotel == null) {
			if (other.nomHotel != null)
				return false;
		} else if (!nomHotel.equals(other.nomHotel))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}
	
}
