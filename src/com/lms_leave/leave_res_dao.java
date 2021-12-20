package com.lms_leave;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.lms.emp_login;
import com.lms.lms_connection;

public class leave_res_dao {
	
	public void applyLeave(leave_res lev ) throws ClassNotFoundException, SQLException {
		
		String insertQuery="insert into LEAVE_RES values(?,?,?,?,?)";
		Connection con=lms_connection.getConnection();
		PreparedStatement pstmt= con.prepareStatement(insertQuery);
		
		pstmt.setInt(1, lev.getRequest_id());
		pstmt.setInt(2, lev.getEmp_id());
		pstmt.setString(3, lev.getReason());
		pstmt.setDate(4, new java.sql.Date( lev.getFrom_date().getTime()));
		pstmt.setDate(4, (Date) lev.getTo_date());
		int i=pstmt.executeUpdate();
		System.out.println(i+ "inserted");
		


	}

}
