package com.myapp.model;

import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Book {

@Id
private int isbn;
private String title;
private String author;
private Date dob;

@Column(name="book_date")
private Date date;

@Transient
int copiesOfBook;

@AttributeOverrides({
    @AttributeOverride(name="pubId",column=@Column(name="pubId1")),
    @AttributeOverride(name="pubName",column=@Column(name="pubName1"))})
@Embedded
Publisher1 publisher1;

@Embedded
Publisher2 publisher2;

public Publisher1 getPublisher1() {
return publisher1;
}
public void setPublisher1(Publisher1 publisher1) {
this.publisher1 = publisher1;
}
public Publisher2 getPublisher2() {
return publisher2;
}
public void setPublisher2(Publisher2 publisher2) {
this.publisher2 = publisher2;
}


@ElementCollection
List<Distributor> distList;


public List<Distributor> getDistList() {
return distList;
}
public void setDistList(List<Distributor> distList) {
this.distList = distList;
}

public int getCopiesOfBook() {
return copiesOfBook;
}
public void setCopiesOfBook(int copiesOfBook) {
this.copiesOfBook = copiesOfBook;
}
public Date getDate() {
return date;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public int getIsbn() {
return isbn;
}
public void setIsbn(int isbn) {
this.isbn = isbn;
}
public String getTitle() {
return title;
}
public void setTitle(String title) {
this.title = title;
}
public String getAuthor() {
return author;
}
public void setAuthor(String author) {
this.author = author;
}
public Book(int isbn, String title, String author, Date date2) {
super();
this.isbn = isbn;
this.title = title;
this.author = author;
}

public Book() {
// TODO Auto-generated constructor stub
}
@Override
public String toString() {
return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + "]";
}

}

