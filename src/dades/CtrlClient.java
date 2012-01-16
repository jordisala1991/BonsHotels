package dades;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import domini.Client;
import domini.ICtrlClient;

public class CtrlClient implements ICtrlClient {

	public Client getClient(String dni) throws Exception {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			Client client = (Client) session.get(Client.class, dni);
			transaction.commit();
			return client;
		} catch (HibernateException he)  { throw new Exception ("ClientNoExisteix"); } 
	}

}
