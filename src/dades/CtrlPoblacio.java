package dades;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.Transaction;
import domini.Poblacio;
import domini.ICtrlPoblacio;

public class CtrlPoblacio implements ICtrlPoblacio {

	@SuppressWarnings("unchecked")
	public Set<Poblacio> tots() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Set<Poblacio> poblacions = new HashSet<Poblacio>(session.createQuery("from Poblacio").list());
		transaction.commit();
		return poblacions;
	}

	public Poblacio getPoblacio(String nomPoblacio) throws Exception {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Poblacio poblacio = (Poblacio) session.get(Poblacio.class, nomPoblacio);
		transaction.commit();
		if (poblacio == null) throw new Exception("poblacioNoExisteix");
		return poblacio;
	}

}
