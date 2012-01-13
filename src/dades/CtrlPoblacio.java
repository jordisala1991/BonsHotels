package dades;

import java.util.HashSet;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import domini.Poblacio;

public class CtrlPoblacio implements domini.CtrlPoblacio {

	public HashSet<Poblacio> tots() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		return new HashSet<Poblacio>(session.createQuery("from Poblacio").list());
	}

	public Poblacio getPoblacio(String nomPoblacio) throws Exception {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			Poblacio poblacio = (Poblacio) session.get(Poblacio.class, nomPoblacio);
			transaction.commit();
			return poblacio;
		} catch (HibernateException he)  { throw new Exception ("PoblacioNoExisteix"); }
	}

}
