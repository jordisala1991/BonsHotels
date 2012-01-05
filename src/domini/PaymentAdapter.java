package domini;

import java.util.Date;

public class PaymentAdapter implements IPaymentAdapter {
	
	public PaymentAdapter() {
		
	}

	public boolean pagament(String numTarg, Date dCad, float preuTotal) throws Exception {
		CreditCardService ccs = ServiceLocator.getInstance().find("Credit Card Service");
		boolean res = ccs.autoritza(numTarg, dCad, preuTotal, new Date());
		if (!res) throw new Exception("serveiNoDisponible");
		return res;
	}

}
