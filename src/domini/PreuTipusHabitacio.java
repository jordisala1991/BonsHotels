package domini;

import java.util.Date;

public class PreuTipusHabitacio {
	
	private float preu;
	private ITipusHabPricingStrategy strategy;
	private TipusHabitacio tipusHab;
	
	public PreuTipusHabitacio() {
		
	}
	
	public PreuTipusHabitacio(float preu, ITipusHabPricingStrategy strategy, TipusHabitacio tipusHab) {
		this.preu = preu;
		this.strategy = strategy;
		this.tipusHab = tipusHab;
	}

	public float getPreu() {
		return preu;
	}

	public void setPreu(float preu) {
		this.preu = preu;
	}

	public ITipusHabPricingStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(ITipusHabPricingStrategy strategy) {
		this.strategy = strategy;
	}

	public TipusHabitacio getTipusHab() {
		return this.tipusHab;
	}

	public void setTipusHab(TipusHabitacio tipusHab) {
		this.tipusHab = tipusHab;
	}

	public float obtePreu() {
		return strategy.obtePreuReal(this);
	}
	
	public boolean esDelTipus(String tipusHab) {
		return this.tipusHab.esDelTipus(tipusHab);
	}
	
	public TipusHabInformation obteDisponiblesDelTipus(Date dIni, Date dFi, int numOcup, String nomH) {
		TipusHabInformation thi = this.tipusHab.obteDisponibles(dIni,dFi,numOcup,nomH);
		thi.setPreu(strategy.obtePreuReal(this));
		return thi;
	}
	
	public int obteHabitacio(Date dIni, Date dFi, String nomH) {
		return this.tipusHab.obteHabitacio(dIni, dFi, nomH);
	}
	
}
