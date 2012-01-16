package dades;

import org.hibernate.Session;
import org.hibernate.Transaction;
import domini.Client;
import domini.ICtrlClient;

public class CtrlClient implements ICtrlClient {

	public Client getClient(String dni) throws Exception {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Client client = (Client) session.get(Client.class, dni);
		transaction.commit();
		if (client == null) throw new Exception("clientNoExisteix");
		return client;
	}

}
