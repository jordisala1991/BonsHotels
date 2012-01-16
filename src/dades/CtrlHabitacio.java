package dades;

import org.hibernate.Session;
import org.hibernate.Transaction;
import domini.Habitacio;
import domini.ICtrlHabitacio;

public class CtrlHabitacio implements ICtrlHabitacio {

	public Habitacio getHabitacio(String nomH, Integer numero) throws Exception {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			Habitacio habitacio = (Habitacio) session.get(Habitacio.class, new HabitacioId(nomH, numero));
			transaction.commit();
			if (habitacio == null) throw new Exception("habitacioNoExisteix");
			return habitacio;
	}

}
