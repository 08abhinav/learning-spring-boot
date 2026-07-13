package com.Abhinav;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
//		Student s = new Student();
//		s.setsId(102);
//		s.setsName("Second Entry");
//		s.setsTech("MERN");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// Creating First entry
//		Transaction transaction = session.beginTransaction();
//	
//		session.persist(s);
//		transaction.commit();
		
		// Fetching the entry
		Student s1 = session.find(Student.class, 102);
		System.out.println(s1);
		
		session.close();
		factory.close();
	}
}
