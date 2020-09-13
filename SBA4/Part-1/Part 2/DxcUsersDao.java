package com.dxcusers.Task2.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dxcusers.Task2.model.*;

@Component
@Transactional
public class DxcUsersDao {
	
    @Autowired
	SessionFactory sessionFactor;
    public String saveUser(Users users) {
    	try {
    	Session session=sessionFactor.getCurrentSession();
    	session.save(users);
    	return "user created";
    	}
    	catch (Exception e) {
			// TODO: handle exception
    		e.printStackTrace();
		}
    	return "cannot create user";
    }
    
    public List<Users> getAllUsers()
	{
	try
	{
		Session session=sessionFactor.getCurrentSession();
		Query query=session.createQuery("select a from DxcUsers a");
	    System.out.println(query);
	ArrayList<Users> dxcusers=(ArrayList<Users>)query.list();
	return dxcusers ;
	}
	catch (Exception e) {
	e.printStackTrace();
	}
	return null;
	}
    
	public Users getUserById(int userId){
		try{
			Session session=sessionFactor.getCurrentSession();
		Users users=(Users)session.get(Users.class,userId);
		return users;
		}
		catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		}
		return null;
		}
	public String updateUserById(Users dxcUsers){
		try{
		Session session=sessionFactor.getCurrentSession();
		System.out.println("dxcUsers"+dxcUsers);
		session.update("DxcUsers",dxcUsers);
		return "Password Updated";
		}
		catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		}
		return "Cannot Update Password";
		}
	
    
}
