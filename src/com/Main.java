package com;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.models.Students;

public class Main {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Students ahmad = new Students();
		ahmad.setFullName("Ahmad Muhammad");
		ahmad.setAge(20);
		ahmad.setGender("male");
		
		session.save(ahmad);
		transaction.commit();
		
		session.close();
	}

}
