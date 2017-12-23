package org.hbm.SessionFactoryClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

	
	private static SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	private MainClass(){}
	
	public static Session getSession(){
		return factory.openSession() ;
	}
	
	
	public static  void closeSession(Session session){
		session.close();
	}
	
	
	public static  void closeFactory(){
		factory.close();
	}
	

}
