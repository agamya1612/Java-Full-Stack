package com.myschoool.student;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class School {
String name;
@Id
@Column (name="roolno")
int id;
int age;
int phnno;

public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}




public int getPhnno() {
	return phnno;
}
public void setPhnno(int phnno) {
	this.phnno = phnno;
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
public School() {
super();
// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "School [name=" + name + ", id=" + id + ", age=" + age + ", phnno=" + phnno + "]";
}
public School(String name, int id, int age, int phnno) {
	super();
	this.name = name;
	this.id = id;
	this.age = age;
	this.phnno = phnno;
}




}


