package com.myapp.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.myapp.model.User;

public class UserDao {
	public String saveUser(User user)
	{
	try
	{
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	Session session= factory.openSession();
	Transaction tx=session.beginTransaction();
	
	session.save(user);
	tx.commit();
	return "USer saved";
	}
	catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
	}

	return "cannot save user";
	}
}
