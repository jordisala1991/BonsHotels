package dades;

@SuppressWarnings("serial")
public class HabitacioId implements java.io.Serializable {
	
	private String nomHotel;
	private Integer numero;
	
	public HabitacioId() {
		
	}
	
	public HabitacioId(String nomHotel, Integer numero) {
		this.nomHotel = nomHotel;
		this.numero = numero;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nomHotel == null) ? 0 : nomHotel.hashCode());
		result = prime * result + numero;
		return result;
	}

	public String getNomHotel() {
		return nomHotel;
	}

	public void setNomHotel(String nomHotel) {
		this.nomHotel = nomHotel;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

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
