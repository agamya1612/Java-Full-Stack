package com.myapp.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.myapp.model.Book;

public class BookDao {


public String saveBook(Book book)
{
try
{
SessionFactory factory=new Configuration().configure().buildSessionFactory();
Session session= factory.openSession();
Transaction tx=session.beginTransaction();
session.save(book);
tx.commit();
return "book saved";
}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}

return "cannot save book";
}
public Book getBook(int isbn)
{
	SessionFactory factory=null;
	try
{
factory=new Configuration().configure().buildSessionFactory();
Session session= factory.openSession();
Transaction tx=session.beginTransaction();
Book book=session.get(Book.class, isbn);
tx.commit();
return book;
}
catch (Exception e) {
e.printStackTrace();
}
finally {
factory.close();
}

return null;

}
public List<Book> getBooks()
{
	SessionFactory factory=null;
	try

{
	factory=new Configuration().configure().buildSessionFactory();
	Session session= factory.openSession();
Transaction tx=session.beginTransaction();

ArrayList<Book> books=(ArrayList<Book>)session.createQuery("from Book").list();


tx.commit();
return books;
}
catch (Exception e) {
e.printStackTrace();
}
finally {
factory.close();
}

return null;

}

public Book getBook(String title)
{
SessionFactory factory=null;
try
{
factory=new Configuration().configure().buildSessionFactory();
Session session= factory.openSession();
Transaction tx=session.beginTransaction();
Query query=session.createQuery("from Book b where b.title=:titlePram");
query.setParameter("titlePram", title);
Book book=(Book)query.getSingleResult();
tx.commit();
return book;
}
catch (Exception e) {
e.printStackTrace();
}
finally {
factory.close();
}

return null;

}




}