package domini;

import java.util.Date;

public class Reserva {
	
	private Date dataReserva;
	private Date dataInici;
	private Date dataFi;
	private String idReserva;
	private float preuTotal;
	
	public Reserva() {
		
	}
	
	public Reserva(Date dataReserva, Date dataInici, Date dataFi,
			String idReserva, float preuTotal) {
		super();
		this.dataReserva = dataReserva;
		this.dataInici = dataInici;
		this.dataFi = dataFi;
		this.idReserva = idReserva;
		this.preuTotal = preuTotal;
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
	
	public float getPreuTotal() {
		return preuTotal;
	}
	
	public void setPreuTotal(float preuTotal) {
		this.preuTotal = preuTotal;
	}
	
	public boolean EstaEntre(Date dIni, Date dFi) {
		return (dIni.before(this.dataInici) && dFi.after(this.dataInici) && dFi.before(this.dataFi)) ||
			   (dIni.after(this.dataInici) && dIni.before(this.dataFi) && dFi.after(this.dataFi)) ||
			   (dIni.before(this.dataInici) && dFi.after(this.dataFi));
	}
}
