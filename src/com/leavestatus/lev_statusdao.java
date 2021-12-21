package com.leavestatus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.lms.lms_connection;
import com.lms_leave.leave_res;

public class lev_statusdao {
	
	public void insertLev(lev_status s1) throws ClassNotFoundException, SQLException{
		
		String insertquery="insert into lev_status values (?,?) ";
		
		Connection con=lms_connection.getConnection();
		PreparedStatement pstmt= con.prepareStatement(insertquery);
		
		pstmt.setInt(1,s1.getManager_id());
		pstmt.setInt(2, s1.getEmp_id());
		 int i =pstmt.executeUpdate();
		 System.out.println(i +"inserted");
		 
		
	}
	
//update
	public void updatelevs(lev_status s2) throws ClassNotFoundException, SQLException {
		String insertQuery="update lev_status set  status=? where request_id=?";
		Connection con=lms_connection.getConnection();
		PreparedStatement pstmt= con.prepareStatement(insertQuery);
		pstmt.setInt(1, s2.getRequest_id());
		pstmt.setString(2, s2.getStatus());
	}
		
//delete
		public void deletelev(lev_status s3) throws ClassNotFoundException, SQLException {
			String insertQuery="delete from lev_status where request_id=?";
			Connection con=lms_connection.getConnection();
			PreparedStatement pstmt= con.prepareStatement(insertQuery);
			pstmt.setInt(1, s3.getRequest_id());
			int i=pstmt.executeUpdate();
			System.out.println(i+ "deleted");
		

}
}
