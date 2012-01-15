package dades;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import domini.Habitacio;
import domini.ICtrlHabitacio;

public class CtrlHabitacio implements ICtrlHabitacio {

	public Habitacio getHabitacio(String nomH, int numero) throws Exception {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			Habitacio habitacio = (Habitacio) session.get(Habitacio.class, new HabitacioId(nomH, numero));
			transaction.commit();
			return habitacio;
		} catch (HibernateException he)  { throw new Exception ("HabitacioNoExisteix"); }
	}

}
