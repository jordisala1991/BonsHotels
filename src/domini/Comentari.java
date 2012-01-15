package domini;

import java.util.Date;

public class Comentari {

	private Float avaluacio;
	private String descripcio;
	private Date date;
	
	public Comentari() {
				
	}
	
	public Comentari(Float avaluacio, String descripcio, Date date) {
		this.avaluacio = avaluacio;
		this.descripcio = descripcio;
		this.date = date;
	}

	public Float getAvaluacio() {
		return avaluacio;
	}

	public void setAvaluacio(Float avaluacio) {
		this.avaluacio = avaluacio;
	}

	public String getDescripcio() {
		return descripcio;
	}

	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
