package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.models.Students;

public class Main {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Students ahmad = new Students();
		ahmad.setId(2);
		ahmad.setFullName("Ahmad Kabir");
		ahmad.setAge(15);
		ahmad.setGender("male");
		
//		session.save(ahmad);
//		session.update(ahmad);
		
		List<Students> studentsLists = 
				session.createQuery
				("SELECT a FROM Students a", Students.class)
				.getResultList();
		studentsLists.forEach(student -> {
			System.out.println("ID: " + student.getId());
			System.out.println("Fullname: " + student.getFullName());
			System.out.println("Age: " + student.getAge());
			System.out.println("Gender: " + student.getGender());
		});
		
		
		transaction.commit();
//		
		
		session.close();
	}

}
