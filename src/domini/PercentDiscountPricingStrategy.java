package domini;

public class PercentDiscountPricingStrategy implements ITipusHabPricingStrategy {

	private Float percentatge;
	
	public PercentDiscountPricingStrategy() {
		
	}
	
	public PercentDiscountPricingStrategy(Float percentatge) {
		this.percentatge = percentatge;
	}
	
	public Float getPercentatge() {
		return percentatge;
	}

	public void setPercentatge(Float percentatge) {
		this.percentatge = percentatge;
	}
	
	@Override
	public Float obtePreuReal(PreuTipusHabitacio pth) {
		return pth.getPreu()*(1-percentatge);
	}
	
}
