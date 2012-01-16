package domini;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TipusHabitacio {
	
	private String nom;
	private Integer capacitat;
	private String descripcio;
	private Set<Habitacio> habitacions;
	
	public TipusHabitacio() {
		habitacions = new HashSet<Habitacio>();
		capacitat = new Integer(0);
	}
	
	public TipusHabitacio(String nom, Integer capacitat, String descripcio) {
		this.nom = nom;
		this.capacitat = capacitat;
		this.descripcio = descripcio;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getCapacitat() {
		return capacitat;
	}

	public void setCapacitat(Integer capacitat) {
		this.capacitat = capacitat;
	}

	public String getDescripcio() {
		return descripcio;
	}

	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}
	
	public Set<Habitacio> getHabitacions() {
		return habitacions;
	}

	public void setHabitacions(Set<Habitacio> hs) {
		this.habitacions = hs;
	}

	public Boolean esDelTipus(String tipusHab) {
		return tipusHab.equals(this.nom);
	}
	
	public TipusHabInformation obteDisponibles(Date dIni, Date dFi, Integer numOcup, String nomH) {
		Integer disponibles = new Integer(0);
		if(capacitat>=numOcup) {
			Iterator<Habitacio> i = habitacions.iterator();
			while(i.hasNext()) {
				Habitacio habitacio = i.next();
				if(habitacio.esDelHotel(nomH) && habitacio.estaDisponible(dIni,dFi)) 
					++disponibles;
			}
		}
		Float f = new Float(-1);
		TipusHabInformation thi = new TipusHabInformation(nom,disponibles,f);
		return thi;
	}
	
	public Integer obteHabitacio(Date dIni, Date dFi, String nomH) {
		Iterator<Habitacio> i = habitacions.iterator();
		Integer nhab = 0;
		while(i.hasNext()) {
			Habitacio habitacio = i.next();
			if(habitacio.esDelHotel(nomH) && habitacio.estaDisponible(dIni,dFi)) {
				nhab = habitacio.getNumero();
				break;
			}	
		}
		return nhab;
	}	

}

