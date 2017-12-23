package org.hbm.simpleCRUD;

import java.util.Date;

import org.hbm.SessionFactoryClass.MainClass;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertOperation {
	
	
	
	
	public static void main(String[] args) {
		


		Session openSession = MainClass.getSession();
		
		
		
		
		
		
		
		Transaction beginTransaction = openSession.beginTransaction();
		for(int i=1; i<=100; i++){
			Student st = new Student();
			st.setfName("Md. Abu Bakkar Siddique_"+i);
			st.setlName("Tushar Islam_"+i);
			st.setDob(new Date(92,8,8));
			st.setsRoll(10115410+i);
			openSession.save(st);
		}
		
		beginTransaction.commit();
		
		
		
		
		
		
		MainClass.closeSession(openSession);
		MainClass.closeFactory();
		
		
		
		
		
		

	}
	
	
	
	
}
