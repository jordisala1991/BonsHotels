package domini;

public class ServiceFactory {

	private static ServiceFactory instance = null;
	private static IPaymentAdapter paymentAdapter = null;

	private ServiceFactory() {
		
	}
	
	public static ServiceFactory getInstance() {
		if (instance == null) instance = new ServiceFactory();
		return instance;
	}
	
	public IPaymentAdapter getPaymentAdapter() {
		if (paymentAdapter == null) paymentAdapter = new PaymentAdapter();
		return paymentAdapter;
	}
	
}
