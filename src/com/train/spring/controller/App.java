package com.train.spring.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.train.spring.model.Users;

public class App {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Users.class)
									.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
/*			//Create object of entity class type
			//Users users = new Users("name", "email");
			Users users = new Users();			
			//Start transaction
			session.beginTransaction();			
			//Perform operation
			users = session.get(Users.class, 9);
//			users.setName("AAA");
//			session.save(users);
			session.delete(users);
			//Commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Row added!");
			System.out.println(users);*/
			
			//HQL
			//select
/*			session.beginTransaction();
			List<Users> users = session.createQuery("select o from users as o where o.id=2").getResultList();
			for(Users user:users) {
				System.out.println(user.getName()+" "+user.getEmail());
				System.out.println(user);
			}*/
			
			//update
/*			session.beginTransaction();
			session.createQuery("update users set email='AAAA' where userId=2").executeUpdate();
			session.getTransaction().commit();*/
			
			//Delete
			session.beginTransaction();
			session.createQuery("delete from users where userId=2").executeUpdate();
			
		} finally {
			session.close();
			factory.close();
		}
	}
}
