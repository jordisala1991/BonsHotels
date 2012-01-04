package domini;

import java.util.Date;

public interface IPaymentAdapter {
	
	public abstract boolean pagament(String numTarg, Date dCad, float preuTotal);
	
}
