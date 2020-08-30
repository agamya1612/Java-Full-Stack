package com.SBA3.MyAttendance;

import java.util.Date;

public class Attendance {
	private int Studentid;
	private String StudentName;
	Date attdate;
	private int sem;
	private String attendance;
	
	public int getStudentid() {
		return Studentid;
	}
	public void setStudentid(int studentid) {
		Studentid = studentid;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public Date getAttdate() {
		return attdate;
	}
	public void setAttdate(Date attdate) {
		this.attdate = attdate;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public String getAttendance() {
		return attendance;
	}
	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}
	public Attendance(int studentid, String studentName, int sem, Date attdate, String attendance) {
		super();
		Studentid = studentid;
		StudentName = studentName;
		this.attdate = attdate;
		this.sem = sem;
		this.attendance = attendance;
	}
	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Attendance [Studentid=" + Studentid + ", StudentName=" + StudentName + ", attdate=" + attdate + ", sem="
				+ sem + ", attendance=" + attendance + "]";
	} 
	
	
}
