package domini;

import java.util.Date;

public class PaymentAdapter implements IPaymentAdapter {
	
	public PaymentAdapter() {
		
	}

	public Boolean pagament(String numTarg, Date dCad, Float preuTotal) throws Exception {
		CreditCardService ccs = ServiceLocator.getInstance().find("Credit Card Service");
		Boolean res = ccs.autoritza(numTarg, dCad, preuTotal, new Date());
		if (!res) throw new Exception("serveiNoDisponible");
		return res;
	}

}
