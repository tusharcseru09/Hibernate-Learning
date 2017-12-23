package org.hbm.simpleCRUD;

import java.util.List;

import org.hbm.SessionFactoryClass.MainClass;
import org.hibernate.Query;
import org.hibernate.Session;

public class RetrieveOperation {

	public static void main(String[] args) {
		
		Session session = MainClass.getSession();
		
		
		
/*		
		//Retrieve all data from a single class
		String query = "from Student";
		List<?> list = session.createQuery(query).list();
		for(int i=0; i  < list.size(); i++) {
			Student st = (Student)list.get(i);
			System.out.println("First Name: " + st.getfName());
		}		
		
		
		//Select an single field from a table
		String query = "select student.Id from Student student";
		Query createQuery = session.createQuery(query);
		List<Object> list = createQuery.list();
		for (Object objects : list) {
			System.out.println((Integer)objects);
		}
	
		
		
		//Select Two field field from a table
		String query = "select student.Id, student.fName from Student student";
		Query createQuery = session.createQuery(query);
		List<Object[]> list = createQuery.list();
		for (Object[] objects : list) {
			System.out.println((Integer)objects[0] + " - " + (String)objects[1] );
		}
		
			
		
		//Where clause
		String query = "select student.Id, student.fName from Student student where student.Id > 90 and student.Id < 100";
		Query createQuery = session.createQuery(query);
		List<Object[]> list = createQuery.list();
		for (Object[] objects : list) {
			System.out.println((Integer)objects[0] + " - " + (String)objects[1] );
		}
		
*/	
		//Where clause with order by	
		String query = 	" select student.Id, student.fName from Student student "+
						" where student.Id > :lbound and student.Id < :uperbound " +
						" order by student.Id desc";
		Query createQuery = session.createQuery(query);
		createQuery.setParameter("lbound", 40);
		createQuery.setParameter("uperbound", 55);
		List<Object[]> list = createQuery.list();
		for (Object[] objects : list) {
			System.out.println((Integer)objects[0] + " - " + (String)objects[1] );
		}
		
		
		
		MainClass.closeSession(session);
		MainClass.closeFactory();
		
		
	}

}
