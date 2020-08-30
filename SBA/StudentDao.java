package com.SBA3.MyAttendance;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;;

public class StudentDao {
public static int saveStudent(Attendance  std)throws SQLException {
        
	List<Student> listStudent = new ArrayList<>();
        int noOfRowsAff = 0;
        try {
        	Connection con=DBConnection.getConnect();
            String sql = "insert into attendance values(?,?,?,?,?)";
            PreparedStatement stat=con.prepareStatement(sql);
            
            stat.setInt(1, std.getStudentid());
            stat.setString(2, std.getStudentName());
            stat.setDate(3,   (java.sql.Date) std.getAttdate());
            stat.setInt(4, std.getSem());
            stat.setNString(5, std.getAttendance());
            
            noOfRowsAff = stat.executeUpdate();
             
        } 
        	catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
        }      
         
        
		return noOfRowsAff;
    }

}
