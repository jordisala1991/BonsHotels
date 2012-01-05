package domini;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

public class Habitacio {

	private Integer numero;
	private Hotel hotel;
	private HashSet<Reserva> reserva;
	
	public Habitacio() {
		
	}

	public Habitacio(Integer numero, Hotel hotel, HashSet<Reserva> reserva) {
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

	public HashSet<Reserva> getReserva() {
		return reserva;
	}

	public void setReserva(HashSet<Reserva> reserva) {
		this.reserva = reserva;
	}

	public boolean esDelHotel(String NomH) {
		return this.hotel.etsElHotel(nomH);
	}
	
	public boolean estaDispobible(Date dIni, Date dFi) {
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
