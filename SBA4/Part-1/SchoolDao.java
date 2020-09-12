package com.myschoool.student;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class SchoolDao {


@Autowired
SessionFactory factory;


public SchoolDao() {
// TODO Auto-generated constructor stub
}


public SchoolDao(SessionFactory factory) {
super();
this.factory = factory;
}


public String saveSchool(School school){
try{
Session session=factory.getCurrentSession();
session.save(school);
return "Successfully inserted details!!!!!!!!!";
}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}

return "Sorry , cannot enter details!!!!";
}



public List<School> getbyId(int id) {

try{
Session session=factory.getCurrentSession();
Criteria crit = session.createCriteria(School.class);
Query query=session.createQuery("from School a where a.id=:id");
query.setParameter("id", id);
ArrayList<School> byid=(ArrayList<School>) query.list();
return byid;

}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}
return null;
}






public List<School> getbyname(String name) {

try{
Session session=factory.getCurrentSession();
Criteria crit = session.createCriteria(School.class);
Query query=session.createQuery("from School b where b.name=:name");
query.setParameter("name", name);
ArrayList<School> byname=(ArrayList<School>) query.list();
return byname;

}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}
return null;
}




public List<School> getbyphonenumber(int phnno) {

try{
Session session=factory.getCurrentSession();
Criteria crit = session.createCriteria(School.class);
Query query=session.createQuery("from School d where d.phnno=:phnno");
query.setParameter("phnno",phnno);
ArrayList<School> byphnno=(ArrayList<School>) query.list();
return byphnno;

}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}
return null;
}



public List<School> getbyage(int age) {

try{
Session session=factory.getCurrentSession();
Criteria crit = session.createCriteria(School.class);
Query query=session.createQuery("from School e where e.age=:age");
query.setParameter("age",age);
ArrayList<School> byage=(ArrayList<School>) query.list();
return byage;

}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}
return null;
}

public School updatingbyId(int id){
try{
Session session=factory.getCurrentSession();
School school=(School)session.get(School.class,id);
return school;
}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}

return null;
}



public String updateSchoolByname(School school){
try{
Session session=factory.getCurrentSession();

System.out.println("school "+school);
session.update("school",school);
return "Successfully Student Details updated";
}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}

return "Sorry could not update Student Details";
}



public String deletebyname(String name){
try
{

String hql="delete from School f where f.name = :name";
Session session= factory.openSession();
Query query=(Query) session.createSQLQuery(hql);
query.setParameter("name",name);
    int res=query.executeUpdate();
if(res>0)
return "Record is Successfully deleted!!!!";
}


catch (Exception e) {
e.printStackTrace();

}

return "Sorry could not delete !!!!!!";
}




public String deletebyid(int id){
try
{

String hql="delete from School g where g.id = :id";
Session session= factory.openSession();
Query query=(Query) session.createSQLQuery(hql);
query.setParameter("id",id);
    int res=query.executeUpdate();
if(res>0)
return "Record is Successfully deleted!!!!";
}


catch (Exception e) {
e.printStackTrace();

}

return "Sorry could not delete !!!!!!";
}
}

