package domini;

public class CtrlDataFactory {

	private static CtrlDataFactory instance = null;
	private static CtrlHotel HotelController = null;
	private static CtrlHabitacio HabitacioController = null;
	private static CtrlPoblacio PoblacioController = null;
	private static CtrlClient ClientController = null;

	private CtrlDataFactory() {
		
	}

	public static CtrlDataFactory getInstance() {
		if (instance == null) instance = new CtrlDataFactory();
		return instance;
	}

	public static CtrlHotel getHotelController() {
		if (instance == null) instance = new CtrlDataFactory();
		return HotelController;
	}

	public static CtrlHabitacio getHabitacioController() {
		if (instance == null) instance = new CtrlDataFactory();
		return HabitacioController;
	}

	public static CtrlPoblacio getPoblacioController() {
		if (instance == null) instance = new CtrlDataFactory();
		return PoblacioController;
	}

	public static CtrlClient getClientController() {
		if (instance == null) instance = new CtrlDataFactory();
		return ClientController;
	}
	
}
	