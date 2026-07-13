package com.Abhinav;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Student s = new Student();
		s.setsId(101);
		s.setsName("First Entry");
		s.setsTech("Java");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// Creating First entry
		Transaction transaction = session.beginTransaction();
	
		session.persist(s);
		transaction.commit();
		
		
		
		session.close();
		factory.close();
	}
}
