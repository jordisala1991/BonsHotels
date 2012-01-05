package domini;

public class TipusHabInformation {
	
	private String nom;
	private int num;
	private float preu;
	
	public TipusHabInformation() {
		
	}
	
	public TipusHabInformation(String nom, int num, float preu) {
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
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public float getPreu() {
		return preu;
	}
	
	public void setPreu(float preu) {
		this.preu = preu;
	}
	
}
