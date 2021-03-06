package presentacio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import domini.ControladorReservarHabitacio;
import domini.ReservaInformation;
import domini.HotelInformation;

public class ControladorVistaReservarHabitacio {
	
	private static ControladorReservarHabitacio controladorReservarHabitacio;
	private VistaReservarHabitacio vistaReservarHabitacio;
	
	public ControladorVistaReservarHabitacio() {
		if (controladorReservarHabitacio == null) 
			controladorReservarHabitacio = new ControladorReservarHabitacio();
		vistaReservarHabitacio = new VistaReservarHabitacio();
	}
	
	public void PrReservarHabitacio() {
		try {
			Set<String> pb = controladorReservarHabitacio.obtePoblacions();
			vistaReservarHabitacio.mostraPoblacions(pb);
		} catch (Exception e) {
			if (e.getMessage().equals("noHiHaPoblacions")) 
				vistaReservarHabitacio.mostraMissatge("View1", "No hi ha poblacions");
		}
	}
	
	public void PrOKObteHotels(String pob, String sIni, String sFi, String sNumOcup) {
		try {
			if (pob == null || sIni.equals("") || sFi.equals("") || sNumOcup.equals("")) 
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
			Integer numOcup;
			try {
				numOcup = Integer.parseInt(sNumOcup);
			} catch (NumberFormatException nfe) { throw new Exception ("sNumOcupNoValid"); }
			if (numOcup <= 0) throw new Exception ("numOcupNoOk");
			Set<HotelInformation> hotels = controladorReservarHabitacio.buscarHabitacio(pob, dIni, dFi, numOcup);
			vistaReservarHabitacio.mostraHotels(hotels, pob, dIni, dFi, numOcup);
		} catch (Exception e) {
			if (e.getMessage().equals("faltenDades"))
				vistaReservarHabitacio.mostraMissatge("View2", "S'han d'introduir totes les dades");
			else if (e.getMessage().equals("sIniNoValida"))
				vistaReservarHabitacio.mostraMissatge("View2", "La data inici no és una data vàlida");
			else if (e.getMessage().equals("sFiNoValida"))
				vistaReservarHabitacio.mostraMissatge("View2", "El data fi no és una data vàlida");
			else if (e.getMessage().equals("dIniNoPosteriorAvui"))
				vistaReservarHabitacio.mostraMissatge("View2", "La data inici no és posterior a la data d'avui");
			else if (e.getMessage().equals("dFiNoPosteriordIni"))
				vistaReservarHabitacio.mostraMissatge("View2", "La data fi no és posterior a la data inici");
			else if (e.getMessage().equals("sNumOcupNoValid"))
				vistaReservarHabitacio.mostraMissatge("View2", "El nombre d'ocupants ha de ser un número");
			else if (e.getMessage().equals("numOcupNoOk"))
				vistaReservarHabitacio.mostraMissatge("View2", "El nombre d'ocupants ha de ser superior a 0");
			else if (e.getMessage().equals("hotelsNoDisp"))
				vistaReservarHabitacio.mostraMissatge("View2", "No hi ha cap hotel disponible");
		}
	}
	
	public void PrOKSeleccionarHabitacio(String hotel, String tipusHab) {
		try {
			if (hotel == null || tipusHab == null) throw new Exception ("faltenDades");
			ReservaInformation res = controladorReservarHabitacio.seleccionarHabitacio(hotel, tipusHab);
			vistaReservarHabitacio.mostraPreu(res);
		} catch (Exception e) {
			if (e.getMessage().equals("faltenDades")) 
				vistaReservarHabitacio.mostraMissatge("View3", "S'han d'introduir totes les dades");
		}
	}
	
	public void PrOKObteDadesClient(String dni) {
		try {
			if (dni.equals("")) throw new Exception ("faltenDades");
			ReservaInformation dades = controladorReservarHabitacio.introduirDni(dni);
			vistaReservarHabitacio.mostraDadesClient(dades);
		} catch (Exception e) {
			if (e.getMessage().equals("faltenDades"))
				vistaReservarHabitacio.mostraMissatge("View4", "S'han d'introduir totes les dades");
			else if (e.getMessage().equals("clientNoExisteix"))
				vistaReservarHabitacio.mostraMissatge("View4", "El client no existeix");
		}
	}
	
	public void PrOKReservaCreada(String numTarg, String cCad) {
		try {
			if (numTarg.equals("") || cCad.equals("")) throw new Exception ("faltenDades");
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
			sdf.setLenient(false);
			Date dCad;
			try {
				dCad = sdf.parse(cCad);
			} catch (ParseException pe) { throw new Exception ("sCadNoValida"); }
			controladorReservarHabitacio.pagament(numTarg, dCad);
			vistaReservarHabitacio.mostraMissatgeFi();
		} catch (Exception e) {
			if (e.getMessage().equals("faltenDades"))
				vistaReservarHabitacio.mostraMissatge("View5", "S'han d'introduir totes les dades");
			else if (e.getMessage().equals("sCadNoValida"))
				vistaReservarHabitacio.mostraMissatge("View5", "La data de caducitat no és una data vàlida");
			else if (e.getMessage().equals("serveiNoDisponible"))
				vistaReservarHabitacio.mostraMissatge("View5", "El servei no esta disponible");
		}
	}
	
	public void PrOKMissatgeFi() {
		vistaReservarHabitacio.tancar();
	}
	
	public void PrCancel() {
		vistaReservarHabitacio.tancar();
	}
	
}
