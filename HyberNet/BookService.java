package com.myapp.Services;

import java.util.ArrayList;
import java.util.Date;

import com.myapp.Dao.BookDao;
import com.myapp.model.Book;
import com.myapp.model.Distributor;
import com.myapp.model.Publisher1;
import com.myapp.model.Publisher2;

public class BookService {

public static void main(String[] args) {

Book book=new Book(101,"My Book","Agamya Mehrotra",new Date());
Book book1=new Book(102,"My Book1","Ishraq",new Date());
Book book2=new Book(103,"My Book2","Shaurya",new Date());

Publisher1 publisher=new Publisher1("1", "ABC publications");
book.setPublisher1(publisher);



Publisher2 publisher2=new Publisher2(13,"COD Publications");
book.setPublisher2(publisher2);

/*ArrayList<Distributor> distList=new ArrayList();
distList.add(new Distributor(1, "JOHN", "Bang"));
distList.add(new Distributor(2, "cena", "Chennai"));*/

//book.setDistList(distList);
BookDao dao=new BookDao();
System.out.println(dao.saveBook(book));

/*BookDao dao=new BookDao();
Book book21= dao.getBook(103);
System.out.println(book21);

ArrayList<Book> books=(ArrayList<Book>)dao.getBooks();

for(Book book12:books){
System.out.println(book12);
}*/
/*BookDao dao=new BookDao();
Book book15=dao.getBook("My Book");
System.out.println(book15);*/
}
}

