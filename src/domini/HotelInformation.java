package domini;

import java.util.HashSet;

public class HotelInformation {
	
	private String nomHotel;
	private String desc;
	private String categoria;
	private float avaluacio;
	private HashSet<TipusHabInformation> habs;
	
	public HotelInformation() {
		
	}
	
	public HotelInformation(String nomHotel, String desc, String categoria, float avaluacio,
			HashSet<TipusHabInformation> habs) {
		this.nomHotel = nomHotel;
		this.desc = desc;
		this.categoria = categoria;
		this.avaluacio = avaluacio;
		this.habs = habs;
	}

	public String getNomHotel() {
		return nomHotel;
	}
	
	public void setNomHotel(String nomHotel) {
		this.nomHotel = nomHotel;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public float getAvaluacio() {
		return avaluacio;
	}
	
	public void setAvaluacio(float avaluacio) {
		this.avaluacio = avaluacio;
	}
	
	public HashSet<TipusHabInformation> getHabs() {
		return habs;
	}
	
	public void setHabs(HashSet<TipusHabInformation> habs) {
		this.habs = habs;
	}
}
