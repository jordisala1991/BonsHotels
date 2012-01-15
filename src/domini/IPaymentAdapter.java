package domini;

import java.util.Date;

public interface IPaymentAdapter {
	
	public abstract Boolean pagament(String numTarg, Date dCad, Float preuTotal) throws Exception;
	
}
