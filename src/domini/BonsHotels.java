package domini;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import dades.HibernateUtil;

@SuppressWarnings("serial")
public class BonsHotels implements java.io.Serializable {
	
	private static BonsHotels instance = null;
	private Float quotaFixa;
	private Float quotaVariable;
	
	private BonsHotels() {
		
	}
	
	public static BonsHotels getInstance() throws Exception {
		if (instance == null) {
			try {
				Session session = HibernateUtil.getSessionFactory().openSession();
				Transaction transaction = session.beginTransaction();
				instance = (BonsHotels) session.createQuery("from BonsHotels").uniqueResult();
				transaction.commit();
				session.close();
			} catch (HibernateException he) { throw new Exception("BonsHotelsNoExisteix"); }
		}
		return instance;
	}

	public Float getQuotaFixa() {
		return quotaFixa;
	}

	public void setQuotaFixa(Float quotaFixa) {
		this.quotaFixa = quotaFixa;
	}

	public Float getQuotaVariable() {
		return quotaVariable;
	}

	public void setQuotaVariable(Float quotaVariable) {
		this.quotaVariable = quotaVariable;
	}
	
	public String getReservationId() {
		return "123";
	}
	
}
