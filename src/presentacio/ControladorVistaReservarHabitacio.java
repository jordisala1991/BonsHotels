package presentacio;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import domini.ControladorReservarHabitacio;
import domini.ReservaInformation;
import domini.HotelInformation;

public class ControladorVistaReservarHabitacio {
	
	private static ControladorReservarHabitacio controladorReservarHabitacio;
	private VistaReservarHabitacio vistaReservarHabitacio;
	
	public ControladorVistaReservarHabitacio() {
		if (controladorReservarHabitacio == null) 
			controladorReservarHabitacio = new ControladorRervarHabitacio();
		vistaReservarHabitacio = new VistaReservarHabitacio();
	}
	
	public void PrReservarHabitacio() {
		try {
			HashSet<String> pb = controladorReservarHabitacio.obtePoblacions();
			vistaReservarHabitacio.mostraPoblacions(pb);
		} catch (Exception e) {
			if (e.getMessage().equals("noHiHaPoblacions")) 
				vistaReservarHabitacio.mostraMissatge("No hi ha poblacions");
		}
	}
	
	public void PrOKObteHotels(String pob, String sIni, String sFi, String sNumOcup) {
		try {
			if (pob.equals(null) || sIni.equals("") || sFi.equals("") || sNumOcup.equals("")) 
				throw new Exception ("faltenDades");
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
			sdf.setLenient(false);
			Date dIni, dFi;
			try {
				dIni = sdf.parse(sIni);
			} catch (ParseException pe) { throw new Exception ("sIniNoValida"); }
			try {
				dFi = sdf.parse(sFi);
			} catch (ParseException pe) { throw new Exception ("sFiNoValida"); }
			if (!dIni.after(new Date())) throw new Exception ("dIniNoPosteriorAvui");
			if (!dFi.after(dIni)) throw new Exception ("dFiNoPosteriordIni");
			int numOcup;
			try {
				numOcup = Integer.parseInt(sNumOcup);
			} catch (NumberFormatException nfe) { throw new Exception ("sNumOcupNoValid"); }
			if (numOcup <= 0) throw new Exception ("numOcupNoOk");
			HotelInformation hotels = controladorReservarHabitacio.buscarHabitacio(dIni, dFi, numOcup);
			vistaReservarHabitacio.mostraHotels(hotels);
		} catch (Exception e) {
			switch (e.getMessage()) {
				case "faltenDades":
					vistaReservarHabitacio.mostraMissatge("S'han d'introduir totes les dades");
				case "sIniNoValida":
					vistaReservarHabitacio.mostraMissatge("La data inici no és una data vàlida");
				case "sFiNoValida":
					vistaReservarHabitacio.mostraMissatge("El data fi no és una data vàlida");
				case "dIniNoPosteriorAvui":
					vistaReservarHabitacio.mostraMissatge("La data inici no és posterior a la data d'avui");
				case "dFiNoPosteriordIni":
					vistaReservarHabitacio.mostraMissatge("La data fi no és posterior a la data inici");
				case "sNumOcupNoValid":
					vistaReservarHabitacio.mostraMissatge("El nombre d'ocupants ha de ser un número");
				case "numOcupNoOk":
					vistaReservarHabitacio.mostraMissatge("El nombre d'ocupants ha de ser superior a 0");
				case "hotelsNoDisp":
					vistaReservarHabitacio.mostraMissatge("No hi ha cap hotel disponible");
			}
		}
	}
	
	public void PrOKSeleccionarHabitacio(String hotel, String tipusHab) {
		try {
			if (hotel.equals(null) || tipusHab.equals(null)) throw new Exception ("faltenDades");
			ReservaInformation res = controladorReservarHabitacio.seleccionarHabitacio(hotel, tipusHab);
			vistaReservarHabitacio.mostraPreu(res);
		} catch (Exception e) {
			if (e.getMessage().equals("faltenDades")) 
				vistaReservarHabitacio.mostraMissatge("S'han d'introduir totes les dades");
		}
	}
	
	public void PrOKObteDadesClient(String dni) {
		try {
			if (dni.equals("")) throw new Exception ("faltenDades");
			ReservaInformation dades = controladorReservarHabitacio.introduirDni(dni);
			vistaReservarHabitacio.mostraDadesClient(dades);
		} catch (Exception e) {
			switch (e.getMessage()) {
				case "faltenDades":
					vistaReservarHabitacio.mostraMissatge("S'han d'introduir totes les dades");
				case "clientNoExisteix":
					vistaReservarHabitacio.mostraMissatge("El client no existeix");
			}
		}
	}
	
	public void PrOKReservaCreada(String numTarg, String cCad) {
		try {
			if (numTarg.equals("") || cCad.equals("")) throw new Exception ("faltenDades");
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
			sdf.setLenient(false);
			Date dCad;
			try {
				dCad = sdf.parse(sCad);
			} catch (ParseException pe) { throw new Exception ("sCadNoValida"); }
			controladorReservarHabitacio.pagament(numTarg, dCad);
			vistaReservarHabitacio.mostraMissatgeFi();
		} catch (Exception e) {
			switch (e.getMessage()) {
				case "faltenDades":
					vistaReservarHabitacio.mostraMissatge("S'han d'introduir totes les dades");
				case "sCadNoValida":
					vistaReservarHabitacio.mostraMissatge("La data de caducitat no és una data vàlida");
				case "serveiNoDisponible":
					vistaReservarHabitacio.mostraMissatge("El servei no esta disponible");
			}
		}
	}
	
	public void PrOKMissatgeFi() {
		vistaReservarHabitacio.tancar();
	}
	
	public void PrCancel() {
		vistaReservarHabitacio.tancar();
	}
	
}
