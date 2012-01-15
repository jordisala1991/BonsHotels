package domini;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Poblacio {

	private String nom;
	private Set<Hotel> hotels;

	public Poblacio() {
		hotels = new HashSet<Hotel>();
	}
	
	public Poblacio(String nom, Set<Hotel> hotels) {
		this.nom = nom;
		this.hotels = hotels;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(Set<Hotel> hotels) {
		this.hotels = hotels;
	}

	public Set<HotelInformation> buscarHotelsDisponibles(Date dIni, Date dFi, int numOcup) throws Exception {
		Set<HotelInformation> hotelsinfo = new HashSet<HotelInformation>();
		Iterator<Hotel> it = hotels.iterator();
		while (it.hasNext()) {
			Hotel h = it.next();
			HotelInformation hinfo = h.buscarHabsHotel(dIni, dFi, numOcup);
			if (hinfo.getHabs().size() > 0) hotelsinfo.add(hinfo);
		}
		if (hotelsinfo.size() == 0) throw new Exception("hotelsNoDisp");
		return hotelsinfo;
	}
	
}
