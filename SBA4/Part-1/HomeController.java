package com.myschoool.student;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	
	@Autowired
	SchoolDao dao;



	private String studid;



	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
	return "home";
	}

	@RequestMapping(value="/savestud")
	public String savestudent(Model model,@RequestParam Map<String,String> data )
	{
		String name=data.get("name");
		int id=Integer.parseInt( data.get("id"));
		
		int phnno=Integer.parseInt( data.get("phnno"));
		
		int age=Integer.parseInt( data.get("age"));
		
		School school=new School(name, id, age, phnno);
		
	String status=dao.saveSchool(school);
	model.addAttribute("status",status);
	return "displayall";
	}
	@RequestMapping(value="/search")
	public String search(Model model,@RequestParam int id)
	{
	List<School> status=dao.getbyId(id);
	//System.out.println(status);
	model.addAttribute("status",status);
	return "displaysearch1";
	}


	@RequestMapping(value="/search1")
	public String search1(Model model,@RequestParam String name)
	{
	List<School> status=dao.getbyname(name);
	//System.out.println(status);
	model.addAttribute("status",status);
	return "displaysearch1";
	}


	


	@RequestMapping(value="/search2")
	public String search3(Model model,@RequestParam int phnno)
	{
	List<School> status=dao.getbyphonenumber(phnno);
	//System.out.println(status);
	model.addAttribute("status",status);
	return "displaysearch1";
	}



	@RequestMapping(value="/search3")
	public String search4(Model model,@RequestParam int age)
	{
	List<School> status=dao.getbyage(age);
	//System.out.println(status);
	model.addAttribute("status",status);
	return "displaysearch1";
	}

	@RequestMapping(value="/updatepage")
	public String update()
	{
	return "searchforupdate";
	}


	@RequestMapping(value="/searchForUpdate")
	public String searchForUpdate(Model model,@RequestParam("id")String id)
	{
	int	studid=Integer.parseInt(id);
	this.studid=id;
	School school=dao.updatingbyId(studid);
	model.addAttribute(school);
	return "searchforupdate";
	}



	@RequestMapping(value="/updateData")
	public String updateData(@ModelAttribute School school)
	{
	int id=0;
	school.setId(id);
	dao.updateSchoolByname(school);
	return "searchforupdate";
	}



	@RequestMapping(value="/delete")
	public String delete(Model model,@RequestParam ("name") String name)
	{
	String status=dao.deletebyname(name);
	model.addAttribute("status",status);

	return "displaysearch1";
	}


	@RequestMapping(value="/delete1")
	public String delete1(Model model,@RequestParam ("id") int id)
	{
	String status=dao.deletebyid(id);
	model.addAttribute("status",status);

	return "displaysearch1";
	}






	}



