package domini;

import java.util.Set;

public class HotelInformation {
	
	private String nomHotel;
	private String desc;
	private String categoria;
	private Float avaluacio;
	private Set<TipusHabInformation> habs;
	
	public HotelInformation() {
		
	}
	
	public HotelInformation(String nomHotel, String desc, String categoria, Float avaluacio,
			Set<TipusHabInformation> habs) {
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
	
	public Float getAvaluacio() {
		return avaluacio;
	}
	
	public void setAvaluacio(Float avaluacio) {
		this.avaluacio = avaluacio;
	}
	
	public Set<TipusHabInformation> getHabs() {
		return habs;
	}
	
	public void setHabs(Set<TipusHabInformation> habs) {
		this.habs = habs;
	}
}
