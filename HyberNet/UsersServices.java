package com.myapp.Services;

import java.util.Date;

import com.myapp.Dao.UserDao;
import com.myapp.model.User;

public class UsersServices {
public static void main(String[] args) {
	User user=new User(102, "Shaurya", new Date() , false);
	UserDao dao=new UserDao();
	System.out.println(dao.saveUser(user));
}
}
