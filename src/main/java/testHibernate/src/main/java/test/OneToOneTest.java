package test;

import org.hibernate.Session;

import entity.Order;

public class OneToOneTest {

	public static void main(String[] args) {
		Session session= HibernateUtil.getSessionFactory().openSession();

		Order order = (Order)session.get(Order.class, 111);
		//em.close();
		//entityManagerFactory.close();
		System.out.println("order : " + order);

	}
}
