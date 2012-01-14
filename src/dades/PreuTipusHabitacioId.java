package dades;


public class PreuTipusHabitacioId implements java.io.Serializable {

	private String nomHotel;
	private String nomTipusHabitacio;
	
	public PreuTipusHabitacioId() {
		
	}
	
	public PreuTipusHabitacioId(String nomHotel,String nomTipusHabitacio) {
		this.nomHotel = nomHotel;
		this.nomTipusHabitacio = nomTipusHabitacio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result
				+ ((nomTipusHabitacio == null) ? 0 : nomTipusHabitacio.hashCode());
		result = prime * result
				+ ((nomHotel == null) ? 0 : nomHotel.hashCode());
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
		PreuTipusHabitacioId other = (PreuTipusHabitacioId) obj;
		if (nomTipusHabitacio == null) {
			if (other.nomTipusHabitacio != null)
				return false;
		} else if (!nomTipusHabitacio.equals(other.nomTipusHabitacio))
			return false;
		if (nomHotel == null) {
			if (other.nomHotel != null)
				return false;
		} else if (!nomHotel.equals(other.nomHotel))
			return false;
		return true;
	}
	
}
