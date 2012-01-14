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

	public float getQuotaFixa() {
		return quotaFixa;
	}

	public void setQuotaFixa(float quotaFixa) {
		this.quotaFixa = quotaFixa;
	}

	public float getQuotaVariable() {
		return quotaVariable;
	}

	public void setQuotaVariable(float quotaVariable) {
		this.quotaVariable = quotaVariable;
	}
	
	public String getReservationId() {
		return "123";
	}
	
}
