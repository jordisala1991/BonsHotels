package domini;

public class AbsoluteDiscountPricingStrategy implements ITipusHabPricingStrategy {

	private Float descompte;
	
	public AbsoluteDiscountPricingStrategy() {
		
	}
	
	public AbsoluteDiscountPricingStrategy(Float descompte) {
		this.descompte = descompte;
	}

	public Float getDescompte() {
		return descompte;
	}

	public void setDescompte(Float descompte) {
		this.descompte = descompte;
	}
	
	@Override
	public Float obtePreuReal(PreuTipusHabitacio pth) {
		return pth.getPreu()-descompte;
	}

}
