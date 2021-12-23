package com.leavestatus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lms.lms_connection;
import com.lms_leave.leave_res;

public class lev_statusdao {
	
	public void showLevres1() {
		
		String show="select*from LEAVE_RES";
		Connection con;
		try {
			con = lms_connection.getConnection();
			Statement stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery(show);
			while (rs.next()) {
			System.out.format("%-10s%-10s%-10s%-13s%-15s%-5s%-4s\n",rs.getInt(1),rs.getInt(2),rs.getString(3),
						rs.getDate(4),rs.getDate(5),rs.getInt(6),rs.getString(7));
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	
//update
	public void updatelevs( String status,int request_id) throws ClassNotFoundException, SQLException {
		String insertQuery="update lev_status set  status=? where request_id=?";
		Connection con=lms_connection.getConnection();
		PreparedStatement pstmt= con.prepareStatement(insertQuery);
		pstmt.setString(1, status);
		pstmt.setInt(2, request_id);
	
	
	    int  i=pstmt.executeUpdate();
		System.out.println(i+ "updated");
	
	}
		
//delete
		public void deletelev(lev_status s1) throws ClassNotFoundException, SQLException {
			String insertQuery="delete from lev_status where request_id=?";
			Connection con=lms_connection.getConnection();
			PreparedStatement pstmt= con.prepareStatement(insertQuery);
			pstmt.setInt(1, s1.getRequest_id());
			int i=pstmt.executeUpdate();
			System.out.println(i+ "deleted");
		

}
		
		public void insertLeaveStatus(int man,int emp_id,int request_id) throws ClassNotFoundException, SQLException {
			
			String insertQuery="insert into lev_status(manager_id,emp_id,request_id) values(?,?,?)";
			Connection con=lms_connection.getConnection();
			PreparedStatement pstmt= con.prepareStatement(insertQuery);
			
			
			pstmt.setInt(1, man);
			pstmt.setInt(2, emp_id);
			pstmt.setInt(3,request_id);
			int i=pstmt.executeUpdate();
			System.out.println(i+ "inserted");
		}
}
