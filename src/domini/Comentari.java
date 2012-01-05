package domini;

import java.util.Date;

public class Comentari {

	private float avaluacio;
	private String descripcio;
	private Date date;
	
	public Comentari() {
				
	}
	
	public Comentari(float avaluacio, String descripcio, Date date) {
		this.avaluacio = avaluacio;
		this.descripcio = descripcio;
		this.date = date;
	}

	public float getAvaluacio() {
		return avaluacio;
	}

	public void setAvaluacio(float avaluacio) {
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
