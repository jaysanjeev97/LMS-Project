package com.lms_leave;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.lms.lms_connection;

public class showlevdao {

	
	public void insertleave(Showlevbal sb) throws ClassNotFoundException, SQLException {
		
		
		int CAUSAL_LEV_BAL=0;
		int MEDI_LEV_BAL=0;
		int PAID_LEV=0;

		String insertQuery = "insert into leave_bal(emp_id,CAUSAL_LEV_BAL,MEDI_LEV_BAL,PAID_LEV) values(?,?,?,?)";
		Connection con=lms_connection.getConnection();
		PreparedStatement pstmt = con.prepareStatement(insertQuery);
		pstmt.setInt(1,sb.getEmp_id());
		pstmt.setInt(2, sb.getCausal_lev_bal());
		pstmt.setInt(3, sb.getMedi_lev_bal());
		pstmt.setInt(4, sb.getPaid_lev());
		int i = pstmt.executeUpdate();
		System.out.println("leave inserted");
		pstmt.close();
		con.close();
	}
	
		public void showbal() {
			
	    String query="select*from LEAVE_BAL";
	    Connection con;
		try {
			con = lms_connection.getConnection();
			Statement stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while (rs.next()) {
				System.out.format("%-10s%-10s%-10s%-10s%-10s%-10s\n",rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getInt(6));
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
		
		public void updatebal(Showlevbal shw) {
			
//			String query="update LEAVE_BAL set causal_lev"
			
		}
	}
	

