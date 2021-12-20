package com.lms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class empdao {
	
public void resister(emp_login log) throws ClassNotFoundException, SQLException {
		
		
		String insertQuery="insert into LMS_EMPLOYEE values(?,?,?,?,?)";
		
		
		Connection con=lms_connection.getConnection();
		PreparedStatement pstmt= con.prepareStatement(insertQuery);
		
		pstmt.setInt(1, log.getEmp_id());
		pstmt.setString(2, log.getEmp_name());
		pstmt.setString(3, log.getEmp_department());
		pstmt.setString(4, log.getEmp_email());
		pstmt.setString(5, log.getEmp_password());
		int i=pstmt.executeUpdate();
		System.out.println(i+ "inserted");
		
		}
		



public boolean login(emp_login user) throws ClassNotFoundException, SQLException {
	
	String insertQuery2="select *from LMS_EMPLOYEE where emp_id=? and emp_password=?";

	Connection con=lms_connection.getConnection();
	PreparedStatement pstmt= con.prepareStatement(insertQuery2);
	
	pstmt.setInt(1, user.getEmp_id());
	pstmt.setString(2, user.getEmp_password());
	
	ResultSet rs=pstmt.executeQuery();
	if(rs.next()) {
		
	return true;
	}
	 
	
	return false;
}




}


