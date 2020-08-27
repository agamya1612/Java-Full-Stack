package mypack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class Playerdao {
	
	public String generatePlayerId(String fname,String lname){
		String playerId="";
		String seqNum="";
		int seqNumber=0;
		try{
		Connection con=  DBConnection.getConnect();
		String sql="select seqplayer.nextval from dual";
		PreparedStatement stat=con.prepareStatement(sql);
		ResultSet rs= stat.executeQuery();
		if(rs.next()){
		seqNumber=rs.getInt(1);
		}
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		if(seqNumber < 100 && seqNumber >=10)
		seqNum="0"+seqNumber;
		else if(seqNumber<10)
		seqNum="00"+seqNumber;
		else
		seqNum=""+seqNumber;

		playerId=fname.substring(0,2)+lname.substring(0,2)+seqNum;

		return playerId;
		}





		public String savePlayer(Player player)
		{

		try
		{
		Connection con=  DBConnection.getConnect();
		String sql="insert into player values(?,?,?,?,?,?)";

		PreparedStatement stat=con.prepareStatement(sql);


		stat.setString(1, generatePlayerId(player.getFname(), player.getLname()));

		stat.setString(2, player.getFname());
		stat.setString(3, player.getLname());
		java.util.Date dob=player.getDob();
		java.sql.Date sqldob=new java.sql.Date(dob.getTime());
		stat.setDate(4, sqldob);
		
		stat.setInt(5, player.getAge());
		stat.setString(6, player.getPlayergame());

		int res= stat.executeUpdate();
		if(res>0)
		return "Player Created";
		else
		return "Player connot be Created";
		}
		catch (Exception e) {
		e.printStackTrace();
		return "Exception "+e;
		}
		}
	}

