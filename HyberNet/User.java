package com.myapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="Users")
public class User {
	@Id
	@Column(name="UserID")
	private int uid;
	private String Uname;
	private Date dob;
	@Type(type="yes_no")
	private Boolean isactive;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Boolean getIsactive() {
		return isactive;
	}
	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}
	public User(int uid, String uname, Date dob, Boolean isactive) {
		super();
		this.uid = uid;
		Uname = uname;
		this.dob = dob;
		this.isactive = isactive;
	}
	@Override
	public String toString() {
		return "Users [uid=" + uid + ", Uname=" + Uname + ", dob=" + dob + ", isactive=" + isactive + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
