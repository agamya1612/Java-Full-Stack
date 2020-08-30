package com.SBA3.MyAttendance;

public class Student {

		protected int sid;
		protected String sname;
		protected int sem;
		
		
		

		public Student() {
			
		}

		public Student(int sid, String sname, int sem) {
			super();
			this.sid = sid;
			this.sname = sname;
			this.sem = sem;
			
		}

		public int getSid() {
			return sid;
		}

		public void setSid(int sid) {
			this.sid = sid;
		}

		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}

		public int getSem() {
			return sem;
		}

		public void setSem(int sem) {
			this.sem = sem;
		}

		@Override
		public String toString() {
			return "Student [sid=" + sid + ", sname=" + sname + ", sem=" + sem + "]";
		}
		
		

	}

