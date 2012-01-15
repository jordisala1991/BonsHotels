package domini;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hotel {

	private String nom;
	private String descripcio;
	private CategoriaHotel categoriaHotel;
	private Set<Comentari> comentari;
	private Set<PreuTipusHabitacio> preuTipusHabitacio;
	
	private final long MILLSECS_PER_DAY = 24*60*60*1000; //Milisegons per dia 
	
	public Hotel() {
		categoriaHotel = new CategoriaHotel();
		comentari = new HashSet<Comentari>();
		preuTipusHabitacio = new HashSet<PreuTipusHabitacio>();
	}
	
	public Hotel(String nom, String descripcio, CategoriaHotel categoriaHotel, 
			Set<Comentari> comentari, Set<PreuTipusHabitacio> preuTipusHabitacio) {
		this.nom = nom;
		this.descripcio = descripcio;
		this.categoriaHotel = categoriaHotel;
		this.comentari = comentari;
		this.preuTipusHabitacio = preuTipusHabitacio;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getDescripcio() {
		return descripcio;
	}
	
	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}

	public CategoriaHotel getCategoriaHotel() {
		return categoriaHotel;
	}
	
	public void setCategoriaHotel(CategoriaHotel categoriaHotel) {
		this.categoriaHotel = categoriaHotel;
	}

	public Set<Comentari> getComentari() {
		return comentari;
	}

	public void setComentari(Set<Comentari> comentari) {
		this.comentari = comentari;
	}
	
	
	public Set<PreuTipusHabitacio> getPreuTipusHabitacio() {
		return preuTipusHabitacio;
	}

	public void setPreuTipusHabitacio(Set<PreuTipusHabitacio> preuTipusHabitacio) {
		this.preuTipusHabitacio = preuTipusHabitacio;
	}
	
	public HotelInformation buscarHabsHotel(Date dIni, Date dFi, int numOcup) {
		HotelInformation hotel = new HotelInformation();
		Set<TipusHabInformation> habs = new HashSet<TipusHabInformation>();
		Iterator<PreuTipusHabitacio> it = preuTipusHabitacio.iterator();
		while (it.hasNext()) {
			PreuTipusHabitacio pth = it.next();
			TipusHabInformation thab = pth.obteDisponiblesDelTipus(dIni, dFi, numOcup, nom);
			if (thab.getNum() > 0) habs.add(thab);
		}
		Iterator<Comentari> it2 = comentari.iterator();
		float av = 0;
		while (it2.hasNext()) av += it2.next().getAvaluacio();
		hotel.setNomHotel(nom);
		hotel.setDesc(descripcio);
		hotel.setCategoria(categoriaHotel.getNom());
		if (comentari.size() > 0) hotel.setAvaluacio(av/comentari.size());
		hotel.setHabs(habs);
		return hotel;
	}
	
	public Boolean etsElHotel(String nomH) {
		return nom.equals(nomH);
	}
	
	public ReservaInformation seleccionarHabitacio(Date dIni, Date dFi, String tipusHab) {
		ReservaInformation res = new ReservaInformation();
		float preu = 0;
		int numHab = 0;
		Iterator<PreuTipusHabitacio> it = preuTipusHabitacio.iterator();
		while (it.hasNext()) {
			PreuTipusHabitacio pth = it.next();
			if (pth.esDelTipus(tipusHab)) {
				preu = pth.obtePreu();
				numHab = pth.obteHabitacio(dIni, dFi, nom);
				break;
			}
		}
		res.setPreuTotal(preu*((dFi.getTime() - dIni.getTime())/MILLSECS_PER_DAY));
		res.setNumHab(numHab);
		return res;
	}
	
}