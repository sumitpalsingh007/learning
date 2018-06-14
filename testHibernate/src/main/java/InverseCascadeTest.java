import java.util.Set;

import org.hibernate.Session;


public class InverseCascadeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session= HibernateUtil.getSessionFactory().openSession();
		
		//Persons p =(Persons)session.get(Persons.class, "2");
		session.get(Persons.class, "1");
		System.out.println("test");
		//Set<Orders> o =p.getOrders();
		//Orders i =o.iterator().next();
		//Department d=i.getDepartments().iterator().next();
		//d.getCustomer().iterator().next();
	}

}
