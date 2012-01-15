package domini;

import java.util.Date;

public class ReservaInformation {
	
	private String pob;
	private Date dIni;
	private Date dFi;
	private String hotel;
	private String tipusHab; 
	private Integer numHab;
	private String dni;
	private String nomClient;
	private String cognoms;
	private String email;
	private Float preuTotal;
	
	public ReservaInformation() {
		
	}
	
	public ReservaInformation(String pob, Date dIni, Date dFi, String hotel,
			String tipusHab, Integer numHab, String dni, String nomClient, String cognoms,
			String email, Float preuTotal) {
		this.pob = pob;
		this.dIni = dIni;
		this.dFi = dFi;
		this.hotel = hotel;
		this.tipusHab = tipusHab;
		this.numHab = numHab;
		this.dni = dni;
		this.nomClient = nomClient;
		this.cognoms = cognoms;
		this.email = email;
		this.preuTotal = preuTotal;
	}

	public String getPob() {
		return pob;
	}
	
	public void setPob(String pob) {
		this.pob = pob;
	}
	
	public Date getdIni() {
		return dIni;
	}
	
	public void setdIni(Date dIni) {
		this.dIni = dIni;
	}
	
	public Date getdFi() {
		return dFi;
	}
	
	public void setdFi(Date dFi) {
		this.dFi = dFi;
	}
	
	public String getHotel() {
		return hotel;
	}
	
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	
	public String getTipusHab() {
		return tipusHab;
	}
	
	public void setTipusHab(String tipusHab) {
		this.tipusHab = tipusHab;
	}

	public Integer getNumHab() {
		return numHab;
	}

	public void setNumHab(Integer numHab) {
		this.numHab = numHab;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNomClient() {
		return nomClient;
	}
	
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	
	public String getCognoms() {
		return cognoms;
	}
	
	public void setCognoms(String cognoms) {
		this.cognoms = cognoms;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Float getPreuTotal() {
		return preuTotal;
	}
	
	public void setPreuTotal(Float preuTotal) {
		this.preuTotal = preuTotal;
	}
	
}
