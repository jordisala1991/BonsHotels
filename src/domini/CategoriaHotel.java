package domini;

public class CategoriaHotel {
	
	private String nom;
	
	CategoriaHotel() {
		
	}
	
	CategoriaHotel(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
