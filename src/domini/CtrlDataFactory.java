package domini;

public class CtrlDataFactory {

	private static CtrlDataFactory instance = null;
	private static ICtrlHotel HotelController = null;
	private static ICtrlHabitacio HabitacioController = null;
	private static ICtrlPoblacio PoblacioController = null;
	private static ICtrlClient ClientController = null;

	private CtrlDataFactory() {
		
	}

	public static CtrlDataFactory getInstance() {
		if (instance == null) instance = new CtrlDataFactory();
		return instance;
	}

	public static ICtrlHotel getHotelController() {
		if (instance == null) instance = new CtrlDataFactory();
		return HotelController;
	}

	public static ICtrlHabitacio getHabitacioController() {
		if (instance == null) instance = new CtrlDataFactory();
		return HabitacioController;
	}

	public static ICtrlPoblacio getPoblacioController() {
		if (instance == null) instance = new CtrlDataFactory();
		return PoblacioController;
	}

	public static ICtrlClient getClientController() {
		if (instance == null) instance = new CtrlDataFactory();
		return ClientController;
	}
	
}
	