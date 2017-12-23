package org.hbm.main;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		
		
		
		UserAddress  userAdd = new UserAddress();
		userAdd.setCity("Rajshahi");
		userAdd.setHomeNo("29-a Shalbagan");
		
		
	 
		
		UserDetails user = new UserDetails();
		user.setUserName("Md Abu Siddique");
		user.setUserAdd(userAdd);
		
		userAdd.setUserDetails(user);
		
		
		Transaction beginTransaction = session.beginTransaction();
		
			session.save(user);
			session.save(userAdd);
			
			
			
		
		beginTransaction.commit();
		session.close();
		sessionFactory.close();
		
		
		
	}
	


}
