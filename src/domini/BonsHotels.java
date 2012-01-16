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
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((quotaFixa == null) ? 0 : quotaFixa.hashCode());
		result = prime * result
				+ ((quotaVariable == null) ? 0 : quotaVariable.hashCode());
		
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BonsHotels other = (BonsHotels) obj;
		if (quotaFixa == null) {
			if (other.quotaFixa != null)
				return false;
		} else if (!quotaFixa.equals(other.quotaFixa))
			return false;
		if (quotaVariable== null) {
			if (other.quotaVariable != null)
				return false;
		} else if (!quotaVariable.equals(other.quotaVariable))
			return false;
		
		return true;
	}
}

