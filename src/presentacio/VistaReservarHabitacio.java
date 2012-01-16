package presentacio;

import java.util.Date;
import java.util.Set;
import javax.swing.JFrame;
import domini.HotelInformation;
import domini.ReservaInformation;

public class VistaReservarHabitacio {

	public void mostraPoblacions(Set<String> pb) {
		View1.getWindows()[0].dispose();
		View2 v = new View2(pb);
		v.setVisible(true);
	}
	
	public void mostraHotels(Set<HotelInformation> hotels, String pob, Date dIni, Date dFi, Integer numOcup) {
		View2.getWindows()[0].dispose();
		View3 v = new View3(hotels, pob, dIni, dFi, numOcup);
		v.setVisible(true);	
	}
	
	public void mostraPreu(ReservaInformation res) {
		View3.getWindows()[0].dispose();
		View4 v = new View4(res);
		v.setVisible(true);		
	}
	
	public void mostraDadesClient(ReservaInformation dades) {
		View4.getWindows()[0].dispose();
		View5 v = new View5(dades);
		v.setVisible(true);	
	}
	
	public void mostraMissatgeFi() {
		View5.getWindows()[0].dispose();
		View6 v = new View6();
		v.setVisible(true);	
	}
	
	public void mostraMissatge(String nomView, String text) {
		switch (nomView) {
			case "View1": View1.mostraMissatge(text);
			case "View2": View2.mostraMissatge(text);
			case "View3": View3.mostraMissatge(text);
			case "View4": View4.mostraMissatge(text);
			case "View5": View5.mostraMissatge(text);
		}
	}
	
	public void tancar() {
		System.exit(0);
	}
		
}
