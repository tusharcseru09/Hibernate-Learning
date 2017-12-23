package org.hbmHQL.formClause;



import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HqlQuery {

	public static void main(String[] args) {
		
		
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();	
		Session session = sessionFactory.openSession();
		
		Company comp = new Company();
		comp.setCompName("BJIT_LTD" );
		comp.setCompLocation("Baridhara,Dhaka");
		
		Employee emp = new Employee();
		emp.setEmpName("Abu Siddique");
		emp.setCompany(comp);
		
		Employee emp2 = new Employee();
		emp2.setEmpName("Tushar");
		emp2.setCompany(comp);
		
		comp.getEmpList().add(emp);
		comp.getEmpList().add(emp2);
		
		
		Transaction transaction = session.beginTransaction();
		
		session.save(comp);
		session.save(emp);
		session.save(emp2);
		
		
		/*for(int i=1; i<=15; i++){
			Company comp = new Company();
			comp.setCompName("BJIT_LTD" + i);
			comp.setCompLocation("Baridhara,Dhaka" + i);
			
			Employee emp = new Employee();
			emp.setEmpName("Abu Siddique"+ i);
			
			session.save(comp);
			session.save(emp);
		}*/
			
			
		

		
		transaction.commit();
		session.close();

	}

}


/*for(int i=1; i<=10; i++){
	Company comp = new Company();
	comp.setCompName("BJIT "+i);
	comp.setCompLocation("Baridhara "+i);
	session.save(comp);
	}
}

*
Query query = session.createQuery("from Company company");
		
		int items = 5;
		
		int i = 1;
		while(true){
			
			System.out.print("Page Number (Exit = 0): ");
			i= sc.nextInt();

			if (i <= 0) break;
			query.setFirstResult( (i-1)*items );
			query.setMaxResults(items);
			
			System.out.println("--- Page "+ i + " ---");
			
			List<Company> compList = (List<Company>)query.list();
			for (Company company : compList) {
				System.out.println(company.getCompId() + "\t" + company.getCompName() + "\t" +  company.getCompLocation());
			}
			

		}
*
*/
