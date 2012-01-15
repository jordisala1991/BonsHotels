package domini;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

public class ControladorReservarHabitacio {
	
	private String poblacio;
	private Date dInici;
	private Date dFinal;
	private String hotel;
	private String tipusHabitacio;
	private Integer numHabitacio;
	private Float preuTotal;
	private String dniClient;
	
	public ControladorReservarHabitacio() {
		
	}
	
	public HashSet<String> obtePoblacions() throws Exception {
		ControladorBuscarHabitacio cbh = new ControladorBuscarHabitacio();
		return cbh.obtePoblacions();
	}
	
	public HashSet<HotelInformation> buscarHabitacio(String pob, Date dIni, Date dFi, Integer numOcup) throws Exception {
		ControladorBuscarHabitacio cbh = new ControladorBuscarHabitacio();
		return cbh.buscarHabitacio(pob, dIni, dFi, numOcup);
	}
	
	public ReservaInformation seleccionarHabitacio(String hotel, String tipusHab) throws Exception {
		ICtrlHotel ch = CtrlDataFactory.getInstance().getHotelController();
		Hotel h = ch.getHotel(hotel);
		ReservaInformation res = h.seleccionarHabitacio(this.dInici, this.dFinal, tipusHab);
		this.hotel = hotel;
		this.tipusHabitacio = tipusHab;
		this.preuTotal = res.getPreuTotal();
		this.numHabitacio = res.getNumHab();
		res.setPob(this.poblacio);
		res.setHotel(hotel);
		res.setdIni(this.dInici);
		res.setdFi(this.dFinal);
		res.setTipusHab(tipusHab);
		res.setPreuTotal(this.preuTotal);
		return res;
	}
	
	public ReservaInformation introduirDni(String dni) throws Exception {
		ReservaInformation res = new ReservaInformation();
		ICtrlClient cc = CtrlDataFactory.getInstance().getClientController();
		Client c = cc.getClient(dni);
		this.dniClient = dni;
		res.setPob(this.poblacio);
		res.setdIni(this.dInici);
		res.setdFi(this.dFinal);
		res.setHotel(this.hotel);
		res.setTipusHab(this.tipusHabitacio);
		res.setDni(dni);
		res.setNomClient(c.getNom());
		res.setCognoms(c.getCognoms());
		res.setEmail(c.getEmail());
		res.setPreuTotal(this.preuTotal);
		return res;
	}
	
	public void pagament(String numTarg, Date dCard) throws Exception {
		IPaymentAdapter pa = ServiceFactory.getInstance().getPaymentAdapter();
		if (pa.pagament(numTarg, dCard, this.preuTotal)) {
			ICtrlHabitacio ch = CtrlDataFactory.getInstance().getHabitacioController();
			ICtrlClient cc = CtrlDataFactory.getInstance().getClientController();
			Habitacio h = ch.getHabitacio(this.hotel, this.numHabitacio);
			Client c = cc.getClient(this.dniClient);
			String id = BonsHotels.getInstance().getReservationId();
			Date today = new Date();
			Reserva r = new Reserva(today, this.dInici, this.dFinal, id, this.preuTotal, c, h);
			r.setClient(c);
			h.afegirReserva(r);
			r.setHabitacio(h);	
		}
	}
}
