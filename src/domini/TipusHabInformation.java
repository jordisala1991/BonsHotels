package domini;

public class TipusHabInformation {
	
	private String nom;
	private Integer num;
	private Float preu;
	
	public TipusHabInformation() {
		
	}
	
	public TipusHabInformation(String nom, Integer num, Float preu) {
		this.nom = nom;
		this.num = num;
		this.preu = preu;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Integer getNum() {
		return num;
	}
	
	public void setNum(Integer num) {
		this.num = num;
	}
	
	public Float getPreu() {
		return preu;
	}
	
	public void setPreu(Float preu) {
		this.preu = preu;
	}
	
}
