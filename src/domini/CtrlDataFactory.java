package domini;

public class CtrlDataFactory {

	private static CtrlDataFactory instance = null;
	private ICtrlHotel HotelController = null;
	private ICtrlHabitacio HabitacioController = null;
	private ICtrlPoblacio PoblacioController = null;
	private ICtrlClient ClientController = null;

	private CtrlDataFactory() {
		
	}

	public static CtrlDataFactory getInstance() {
		if (instance == null) instance = new CtrlDataFactory();
		return instance;
	}

	public ICtrlHotel getCtrlHotel() {
		if (instance == null) instance = new CtrlDataFactory();
		return HotelController;
	}

	public ICtrlHabitacio getCtrlHabitacio() {
		if (instance == null) instance = new CtrlDataFactory();
		return HabitacioController;
	}

	public ICtrlPoblacio getCtrlPoblacio() {
		if (instance == null) instance = new CtrlDataFactory();
		return PoblacioController;
	}

	public ICtrlClient getCtrlClient() {
		if (instance == null) instance = new CtrlDataFactory();
		return ClientController;
	}
	
}
	