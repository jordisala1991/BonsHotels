package domini;

public class AbsoluteDiscountPricingStrategy implements ITipusHabPricingStrategy {

	private float descompte;
	
	public AbsoluteDiscountPricingStrategy() {
		
	}
	
	public AbsoluteDiscountPricingStrategy(float descompte) {
		this.descompte = descompte;
	}

	public float getDescompte() {
		return descompte;
	}

	public void setDescompte(float descompte) {
		this.descompte = descompte;
	}
	
	@Override
	public float obtePreuReal(PreuTipusHabitacio pth) {
		return pth.getPreu()-descompte;
	}

}
