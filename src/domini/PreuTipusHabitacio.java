package domini;

import java.util.Date;

public class PreuTipusHabitacio {
	
	private Float preu;
	private ITipusHabPricingStrategy strategy;
	private TipusHabitacio tipusHab;
	
	public PreuTipusHabitacio() {
		tipusHab = new TipusHabitacio();
	}
	
	public PreuTipusHabitacio(Float preu, ITipusHabPricingStrategy strategy, TipusHabitacio tipusHab) {
		this.preu = preu;
		this.strategy = strategy;
		this.tipusHab = tipusHab;
	}

	public Float getPreu() {
		return preu;
	}

	public void setPreu(Float preu) {
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

	public Float obtePreu() {
		return strategy.obtePreuReal(this);
	}
	
	public Boolean esDelTipus(String tipusHab) {
		return this.tipusHab.esDelTipus(tipusHab);
	}
	
	public TipusHabInformation obteDisponiblesDelTipus(Date dIni, Date dFi, Integer numOcup, String nomH) {
		TipusHabInformation thi = this.tipusHab.obteDisponibles(dIni, dFi, numOcup, nomH);
		thi.setPreu(strategy.obtePreuReal(this));
		return thi;
	}
	
	public Integer obteHabitacio(Date dIni, Date dFi, String nomH) {
		return this.tipusHab.obteHabitacio(dIni, dFi, nomH);
	}
	
}
