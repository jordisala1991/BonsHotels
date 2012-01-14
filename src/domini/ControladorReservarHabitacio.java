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
	private float preuTotal;
	private String dniClient;
	
	public ControladorReservarHabitacio() {
		
	}
	
	public HashSet<String> obtePoblacions() throws Exception {
		ControladorBuscarHabitacio cbh = new ControladorBuscarHabitacio();
		return cbh.obtePoblacions();
	}
	
	public HashSet<HotelInformation> buscarHabitacio(String pob, Date dIni, Date dFi, int numOcup) throws Exception {
		ControladorBuscarHabitacio cbh = new ControladorBuscarHabitacio();
		return cbh.buscarHabitacio(pob, dIni, dFi, numOcup);
	}
	
	public ReservaInformation seleccionarHabitacio(String hotel, String tipusHab) {
		CtrlHotel ch = CtrlDataFactory.getInstance().getHotelController();
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
	
	public ReservaInformation introduirDni(String dni) {
		ReservaInformation res = new ReservaInformation();
		CtrlClient cc = CtrlDataFactory.getInstance().getClientController();
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
			CtrlHabitacio ch = CtrlDataFactory.getInstance().getHabitacioController();
			CtrlClient cc = CtrlDataFactory.getInstance().getClientController();
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