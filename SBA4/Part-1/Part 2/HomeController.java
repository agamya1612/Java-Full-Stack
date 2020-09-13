package com.dxcusers.Task2;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dxcusers.Task2.Dao.DxcUsersDao;
import com.dxcusers.Task2.model.*;

@Controller
public class HomeController {
	@Autowired
	DxcUsersDao dao;
	
@RequestMapping(value="/test")
public String home() {
	System.out.println("service is up buddy!");
	dao.saveUser(new Users(128,"Yaswanth Kumar","Yaswanth@2020","Which is your Favorite food?","Pizza"));
	return "home";
}
@RequestMapping(value="/New User")
public String newUser(Model model)
{
return "NewUser";
}

@RequestMapping(value="/display")
public String display(Model model,@ModelAttribute Users dxcusers)
{
String status=dao.saveUser(dxcusers);
model.addAttribute("status",status);
System.out.println(status);
return "display";
}

@RequestMapping(value="/displayAllUsers")
public String displayAllUsers(Model model)
{
	ArrayList<Users> dxcusers=(ArrayList<Users>)dao.getAllUsers();
	model.addAttribute("DxcUsers",dxcusers);
	System.out.println(dxcusers);
	return "displayAllUsers";
}
@RequestMapping(value="/login")
public String home(Model model)
{
return "LoginPage";
}

int userId=0;
@RequestMapping(value="/validateUser")
public String validateUser(Model model,@RequestParam("userId") String userId,@RequestParam("password") String password )
{
	int dxcuserId=Integer.parseInt(userId);
	this.userId=dxcuserId;
	Users dxcUsers=dao.getUserById(dxcuserId);
	String dxcPassword=dxcUsers.getPassword();
	System.out.println(dxcPassword);
	System.out.println(password);
	System.out.println(dxcUsers);
		
		 if((dxcUsers != null)&&(dxcPassword.equals(password)))
		 {
			 System.out.println("login successful"); 
			 return "LoginSuccess";
		 }
		 else 
	     {
			 System.out.println("failed");
			 return "LoginFailed";
	     }
		}
@RequestMapping(value="/ForgotPassword")
public String forgotPassword(Model model)
{
return "ChangePassword";
}

@RequestMapping(value="/ChangePassword")
public String passwordModification(Model model,@RequestParam("userId") String userId,@RequestParam("security_question") String security_question,@RequestParam("security_answer") String security_answer)
{
	int dxcuserId=Integer.parseInt(userId);
	this.userId=dxcuserId;
	Users dxcUsers=dao.getUserById(dxcuserId);
	String dxcSecurity_question=dxcUsers.getSecurity_question();
	String dxcSecurity_answer=dxcUsers.getSecurity_answer();
	
	System.out.println(dxcSecurity_question);
	System.out.println(dxcSecurity_answer);
	System.out.println(dxcUsers);
		
		 if((dxcUsers != null)&&(dxcSecurity_answer.equalsIgnoreCase(security_answer))&&(dxcSecurity_question.equalsIgnoreCase(security_question)))
		 {
			 System.out.println("login successful"); 
			 return "ForgotPassword";
		 }
		 else 
	     {
			 System.out.println("failed");
			 return "SecurityInvalid";
	     }
		}
Users dxcusers;
@RequestMapping(value="/CheckPassword")
public String CheckPassword(Model model,@RequestParam("userId") String userId,@RequestParam("password") String password,@RequestParam("confirmPassword") String confirmPassword){
	System.out.println(password);
	System.out.println(confirmPassword);
	if(password.equals(confirmPassword)) {
		int dxcuserId=Integer.parseInt(userId);
		this.userId=dxcuserId;
		System.out.println(dxcuserId);
		
		dxcusers=dao.getUserById(dxcuserId);
		
		dxcusers.setUserId(dxcuserId);
	    dxcusers.setUserName(dxcusers.getUserName());
		dxcusers.setSecurity_question(dxcusers.getSecurity_question());
	    dxcusers.setSecurity_answer(dxcusers.getSecurity_answer());
		dxcusers.setPassword(password);	 
		dao.updateUserById(dxcusers);
		System.out.println(dxcusers);
		System.out.println("login successful"); 
		 return"LoginPage";
	}
	else {
		System.out.println("failed");
		 return "CheckPassword";
	}
	
}


}

