package domini;

import java.util.Date;

public class PaymentAdapter implements IPaymentAdapter {
	
	public PaymentAdapter() {
		
	}

	public boolean pagament(String numTarg, Date dCad, float preuTotal) {
		CreditCardService ccs = ServiceLocator.getInstance().find("Credit Card Service");
		return ccs.autoritza(numTarg, dCad, preuTotal, new Date());
	}

}
