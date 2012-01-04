package domini;

//Stub que simula el comportament de la classe ServiceLocator
public class ServiceLocator {
	
	private static ServiceLocator instance = null;
	
	private ServiceLocator() {
		
	}
	
	public static ServiceLocator getInstance() {
		if (instance == null) instance = new ServiceLocator();
		return instance;
	}
	
	public CreditCardService find(String nom) {
		return new CreditCardService();
	}
	
}
