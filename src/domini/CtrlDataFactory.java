package domini;

import dades.CtrlHabitacio;
import dades.CtrlHotel;
import dades.CtrlPoblacio;
import dades.CtrlClient;

public class CtrlDataFactory {

	private static CtrlDataFactory instance = null;
	private ICtrlHotel hotelController = null;
	private ICtrlHabitacio habitacioController = null;
	private ICtrlPoblacio poblacioController = null;
	private ICtrlClient clientController = null;

	private CtrlDataFactory() {
		
	}

	public static CtrlDataFactory getInstance() {
		if (instance == null) instance = new CtrlDataFactory();
		return instance;
	}

	public ICtrlHotel getCtrlHotel() {
		if (hotelController == null) hotelController = new CtrlHotel();
		return hotelController;
	}

	public ICtrlHabitacio getCtrlHabitacio() {
		if (habitacioController == null) habitacioController = new CtrlHabitacio();
		return habitacioController;
	}

	public ICtrlPoblacio getCtrlPoblacio() {
		if (poblacioController == null) poblacioController = new CtrlPoblacio();
		return poblacioController;
	}

	public ICtrlClient getCtrlClient() {
		if (clientController == null) clientController = new CtrlClient();
		return clientController;
	}
	
}
	