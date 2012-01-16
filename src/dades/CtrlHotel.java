package dades;

import org.hibernate.Session;
import org.hibernate.Transaction;
import domini.Hotel;
import domini.ICtrlHotel;

public class CtrlHotel implements ICtrlHotel {

	public Hotel getHotel(String nom) throws Exception {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Hotel hotel = (Hotel) session.get(Hotel.class, nom);
		transaction.commit();
		if (hotel == null) throw new Exception("hotelNoExisteix");
		return hotel;
	}

}
