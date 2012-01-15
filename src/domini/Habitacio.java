package domini;

import java.util.Date;
import java.util.Iterator;
import java.util.Set;

public class Habitacio {

	private Integer numero;
	private Hotel hotel;
	private Set<Reserva> reserva;
	
	public Habitacio() {

	}

	public Habitacio(Integer numero, Hotel hotel, Set<Reserva> reserva) {
		this.numero = numero;
		this.hotel = hotel;
		this.reserva = reserva;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Set<Reserva> getReserva() {
		return reserva;
	}

	public void setReserva(Set<Reserva> reserva) {
		this.reserva = reserva;
	}

	public Boolean esDelHotel(String nomH) {
		return this.hotel.etsElHotel(nomH);
	}
	
	public Boolean estaDisponible(Date dIni, Date dFi) {
		boolean estaLliure = true;
		Iterator<Reserva> it = this.reserva.iterator();
		while(it.hasNext() && estaLliure) 
			if (it.next().EstaEntre(dIni, dFi)) estaLliure = false;
		return estaLliure;
		
	}
	
	public void afegirReserva(Reserva r) {
		this.reserva.add(r);
	}
}
