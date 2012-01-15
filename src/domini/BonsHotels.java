package domini;

public class BonsHotels {
	
	private static BonsHotels instance = null;
	private Float quotaFixa;
	private Float quotaVariable;
	
	private BonsHotels() {
		
	}
	
	public static BonsHotels getInstance() {
		if (instance == null) instance = new BonsHotels();
		return instance;
	}

	public Float getQuotaFixa() {
		return quotaFixa;
	}

	public void setQuotaFixa(Float quotaFixa) {
		this.quotaFixa = quotaFixa;
	}

	public Float getQuotaVariable() {
		return quotaVariable;
	}

	public void setQuotaVariable(Float quotaVariable) {
		this.quotaVariable = quotaVariable;
	}
	
	public String getReservationId() {
		return "123";
	}
	
}
