package dades;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import domini.Hotel;

public class CtrlHotel implements domini.CtrlHotel {

	public Hotel getHotel(String nom) throws Exception {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			Hotel hotel = (Hotel) session.get(Hotel.class, nom);
			transaction.commit();
			return hotel;
		} catch (HibernateException he)  { throw new Exception ("HotelNoExisteix"); } 
	}

}
