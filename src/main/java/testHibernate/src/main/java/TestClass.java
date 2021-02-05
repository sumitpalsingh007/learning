import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;



public class TestClass {
	
	public static void main(String args[]){
		
		/*Session session=null;
		SessionFactory sessionFactory=new Configuration().configure("E:\\practicePrograms\\testHibernate\\src\\main\\webapp\\hibernate.cfg.xml").buildSessionFactory();
		session = sessionFactory.openSession();*/
		Session session= HibernateUtil.getSessionFactory().openSession();
		/*Orders temp=(Orders) session.load(Orders.class,"1");
		System.out.println(temp.getorder_No()+" "+temp.getOredrId()+" "+temp.getpId());
		List temp1= (List) session.createCriteria(Orders.class).list();
		System.out.println(temp1.size());
		*/
		/*Persons temp2=(Persons) session.createCriteria(Persons.class).add(Restrictions.eq("FirstName", "Kari" ) ).uniqueResult();//load(Persons.class,"1");
		System.out.println(temp2. getFirstName()+" "+temp2.getLastName()+" "+temp2.getPId()+"  "+temp2.getCity());
		 List<Orders> temp3 = (List<Orders>)temp2.getOrders();
		 System.out.println("Orders---"+temp3.toString());
		 System.out.println("Orders Details---"+temp3.get(0).getorder_No()+temp3.get(1).getorder_No());*/
		 
		// RuntimeException
		 Orders o = new Orders();
		 o.setorder_No("500");
		// o.setOredrId("123");
		// o.setpId("9");
		 Persons p =(Persons) session.get(Persons.class, "17");//new Persons();
		// p.setPId("17");
		// p.setAddress("b14");
		 //p.setFirstName("pappu1");
		// p.setLastName("cant dance");
		 //p.setPId("10");
		// p.setPId("79");
		 Set orders = new HashSet();
		 orders.add(o);
		 p.setOrders(orders);
		 Set<Orders> temp =p.getOrders();
		 for (Orders r : temp)
			 System.out.println(r.getOredrId()+" "+r.getpId()+" "+r.getorder_No());
		 System.out.println("p  contains ----"+p.getOrders().toString());
		 
		 /*Transaction t=session.beginTransaction();
		 session.merge(p);
		 t.commit();*/
		// session.c
	}
}
