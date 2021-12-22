package com.lms_leave;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.lms.lms_connection;

public class leave_res_dao {
	
	public void applyLeave(leave_res lev ) throws ClassNotFoundException, SQLException {
		
		String insertQuery="insert into LEAVE_RES(emp_id,reason,from_date,to_date,no_ofdays) values(?,?,?,?,?)";
		Connection con=lms_connection.getConnection();
		PreparedStatement pstmt= con.prepareStatement(insertQuery);
		
		
		pstmt.setInt(1, lev.getEmp_id());
		pstmt.setString(2, lev.getReason());
		pstmt.setDate(3, new java.sql.Date( lev.getFrom_date().getTime()));
		pstmt.setDate(4, new java.sql.Date( lev.getTo_date().getTime()));
		pstmt.setInt(5, lev.getNo_ofdays());
		int i=pstmt.executeUpdate();
		System.out.println(i+ "inserted");
	}
		
		//UPDATE:
	public void updatelev(leave_res resq) throws ClassNotFoundException, SQLException {
				String insertQuery="update leave_res set  from_date=?,  to_date =? ,no_ofdays=? where emp_id=?";
				Connection con=lms_connection.getConnection();
				PreparedStatement pstmt= con.prepareStatement(insertQuery);
				pstmt.setDate(1, new java.sql.Date( resq.getFrom_date().getTime()));
				pstmt.setDate(2, new java.sql.Date( resq.getTo_date().getTime()));
				pstmt.setInt(3,resq.getNo_ofdays());
				pstmt.setInt(4, resq.getEmp_id());

				int i=pstmt.executeUpdate();
				System.out.println(i+ "updated");
			}
			//delete
			public void deleteuser(leave_res res) throws ClassNotFoundException, SQLException {
				String insertQuery="delete from leave_res where request_id=?";
				Connection con=lms_connection.getConnection();
				PreparedStatement pstmt= con.prepareStatement(insertQuery);
				pstmt.setInt(1, res.getRequest_id());
				int i=pstmt.executeUpdate();
				System.out.println(i+ "deleted");
			}

		


	}


