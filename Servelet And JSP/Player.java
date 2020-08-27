package mypack;


import java.util.Date;

public class Player {
	private String playerid;
	private String fname;
	private String lname;
	private Date dob;
	private int age;
	private String playergame;
	
	public String getPlayerid() {
		return playerid;
	}
	public void setPlayerid(String playerid) {
		this.playerid = playerid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlayergame() {
		return playergame;
	}
	public void setPlayergame(String playergame) {
		this.playergame = playergame;
	}
	public Player(String playerid, String fname, String lname, Date dob, int age, String playergame) {
		super();
		this.playerid = playerid;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.age = age;
		this.playergame = playergame;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Player [playerid=" + playerid + ", fname=" + fname + ", lname=" + lname + ", age=" + age
				+ ", playergame=" + playergame + "]";
	}
}
