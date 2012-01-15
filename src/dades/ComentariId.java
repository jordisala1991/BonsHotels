package dades;

import java.util.Date;

@SuppressWarnings("serial")
public class ComentariId implements java.io.Serializable {

	private String nomHotel;
	private String dniClient;
	private Date date;
	
	public ComentariId() {
		
	}
	
	public ComentariId(String nomHotel, String dniClient, Date date) {
		this.nomHotel = nomHotel;
		this.dniClient = dniClient;
		this.date = date;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result
				+ ((dniClient == null) ? 0 : dniClient.hashCode());
		result = prime * result
				+ ((nomHotel == null) ? 0 : nomHotel.hashCode());
		return result;
	}

	public String getNomHotel() {
		return nomHotel;
	}

	public void setNomHotel(String nomHotel) {
		this.nomHotel = nomHotel;
	}

	public String getDniClient() {
		return dniClient;
	}

	public void setDniClient(String dniClient) {
		this.dniClient = dniClient;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComentariId other = (ComentariId) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
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
		return true;
	}

}
