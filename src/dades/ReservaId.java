package dades;

import java.util.Date;

@SuppressWarnings("serial")
public class ReservaId implements java.io.Serializable {
	
	private String dniClient;
	private String nomHotel;
	private Integer numeroHabitacio;
	private Date dataInici;
	
	public ReservaId() {
		
	}

	public ReservaId(String dniClient, String nomHotel,
			Integer numeroHabitacio, Date dataInici) {
		super();
		this.dniClient = dniClient;
		this.nomHotel = nomHotel;
		this.numeroHabitacio = numeroHabitacio;
		this.dataInici = dataInici;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dataInici == null) ? 0 : dataInici.hashCode());
		result = prime * result
				+ ((dniClient == null) ? 0 : dniClient.hashCode());
		result = prime * result
				+ ((nomHotel == null) ? 0 : nomHotel.hashCode());
		result = prime * result
				+ ((numeroHabitacio == null) ? 0 : numeroHabitacio.hashCode());
		return result;
	}
	
	public String getDniClient() {
		return dniClient;
	}
	
	public void setDniClient(String dniClient) {
		this.dniClient = dniClient;
	}
	
	public String getNomHotel() {
		return nomHotel;
	}
	
	public void setNomHotel(String nomHotel) {
		this.nomHotel = nomHotel;
	}
	
	public Integer getNumeroHabitacio() {
		return numeroHabitacio;
	}
	
	public void setNumeroHabitacio(Integer numeroHabitacio) {
		this.numeroHabitacio = numeroHabitacio;
	}
	
	public Date getDataInici() {
		return dataInici;
	}
	
	public void setDataInici(Date dataInici) {
		this.dataInici = dataInici;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReservaId other = (ReservaId) obj;
		if (dataInici == null) {
			if (other.dataInici != null)
				return false;
		} else if (!dataInici.equals(other.dataInici))
			return false;
		if (dniClient == null) {
			if (other.dniClient != null)
				return false;
		} else if (!dniClient.equals(other.dniClient))
			return false;
		if (nomHotel == null) {
			if (other.nomHotel != null)
				return false;
		} else if (!nomHotel.equals(other.nomHotel))
			return false;
		if (numeroHabitacio == null) {
			if (other.numeroHabitacio != null)
				return false;
		} else if (!numeroHabitacio.equals(other.numeroHabitacio))
			return false;
		return true;
	}
	
}
