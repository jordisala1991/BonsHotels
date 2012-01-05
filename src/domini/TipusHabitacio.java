package domini;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

public class TipusHabitacio {
	
	private String nom;
	private int capacitat;
	private String descripcio;
	private HashSet <Habitacio> habitacions;
	
	public TipusHabitacio() {

	}
	
	public TipusHabitacio(String nom, int capacitat, String descripcio) {
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

	public int getCapacitat() {
		return capacitat;
	}

	public void setCapacitat(int capacitat) {
		this.capacitat = capacitat;
	}

	public String getDescripcio() {
		return descripcio;
	}

	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}
	
	public HashSet<Habitacio> getHabitacions() {
		return habitacions;
	}

	public void setHabitacions(HashSet<Habitacio> habitacions) {
		this.habitacions = habitacions;
	}

	public boolean esDelTipus(String tipusHab) {
		return tipusHab.equals(this.nom);
	}
	
	public TipusHabInformation obteDisponibles(Date dIni, Date dFi, int numOcup, String nomH) {
		int disponibles = 0;
		if(capacitat>=numOcup) {
			Iterator<Habitacio> i = habitacions.iterator();
			while(i.hasNext()) {
				Habitacio habitacio = i.next();
				if( habitacio.esDelHotel(nomH) && habitacio.estaDisponible(dIni,dFi)) 
					++disponibles;
			}
		}
		TipusHabInformation thi = new TipusHabInformation(nom,disponibles,-1);
		return thi;
	}
	
	public int obteHabitacio(Date dIni, Date dFi, String nomH) {
		Iterator<Habitacio> i = habitacions.iterator();
		int nhab = 0;
		while(i.hasNext()) {
			Habitacio habitacio = i.next();
			if( habitacio.esDelHotel(nomH) && habitacio.estaDisponible(dIni,dFi)) {
				nhab = habitacio.getNum();
				break;
			}	
		}
		return nhab;
	}	

}
