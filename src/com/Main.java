package com;

import org.hibernate.Session;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.close();
	}

}
