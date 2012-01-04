package domini;

public class PercentDiscountPricingStrategy implements ITipusHabPricingStrategy {

	private float percentatge;
	
	public PercentDiscountPricingStrategy() {
		
	}
	
	public PercentDiscountPricingStrategy(float percentatge) {
		this.percentatge = percentatge;
	}
	
	public float getPercentatge() {
		return percentatge;
	}

	public void setPercentatge(float percentatge) {
		this.percentatge = percentatge;
	}
	
	@Override
	public float obtePreuReal(PreuTipusHabitacio pth) {
		return pth.getPreu()*(1-percentatge);
	}
	
}
