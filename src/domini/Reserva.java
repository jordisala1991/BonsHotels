package domini;

import java.util.Date;

public class Reserva {
	
	private Date dataReserva;
	private Date dataInici;
	private Date dataFi;
	private String idReserva;
	private Float preuTotal;
	private Client client;
	private Habitacio habitacio;
	
	public Reserva() {
		
	}
	
	public Reserva(Date dataReserva, Date dataInici, Date dataFi, String idReserva,
			Float preuTotal, Client client, Habitacio habitacio) {
		this.dataReserva = dataReserva;
		this.dataInici = dataInici;
		this.dataFi = dataFi;
		this.idReserva = idReserva;
		this.preuTotal = preuTotal;
		this.client = client;
		habitacio.afegirReserva(this);
		this.habitacio = habitacio;
	}

	public Date getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}

	public Date getDataInici() {
		return dataInici;
	}

	public void setDataInici(Date dataInici) {
		this.dataInici = dataInici;
	}

	public Date getDataFi() {
		return dataFi;
	}

	public void setDataFi(Date dataFi) {
		this.dataFi = dataFi;
	}

	public String getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(String idReserva) {
		this.idReserva = idReserva;
	}

	public Float getPreuTotal() {
		return preuTotal;
	}

	public void setPreuTotal(Float preuTotal) {
		this.preuTotal = preuTotal;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Habitacio getHabitacio() {
		return habitacio;
	}

	public void setHabitacio(Habitacio habitacio) {
		this.habitacio = habitacio;
	}

	public Boolean EstaEntre(Date dIni, Date dFi) {
		return (dIni.before(this.dataInici) && dFi.after(this.dataInici) && dFi.before(this.dataFi)) ||
			   (dIni.after(this.dataInici)  && dIni.before(this.dataFi)  && dFi.after(this.dataFi))  ||
			   (dIni.before(this.dataInici) && dFi.after(this.dataFi));
	}
}
