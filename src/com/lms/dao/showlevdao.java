package com.lms.dao;


import com.lms.connection.*;
import com.lms.model.*;
import com.lms.dao.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class showlevdao {

	public void insertleave(Showlevbal sb)  {

		int CAUSAL_LEV_BAL = 0;
		int MEDI_LEV_BAL = 0;
		int PAID_LEV = 0;

		String insertQuery = "insert into leave_bal(emp_id,CAUSAL_LEV_BAL,MEDI_LEV_BAL,PAID_LEV) values(?,?,?,?)";
		Connection con;
		try {
			con = lms_connection.getConnection();
			PreparedStatement pstmt = con.prepareStatement(insertQuery);
			pstmt.setInt(1, sb.getEmp_id());
			pstmt.setInt(2, sb.getCausal_lev_bal());
			pstmt.setInt(3, sb.getMedi_lev_bal());
			pstmt.setInt(4, sb.getPaid_lev());
			int i = pstmt.executeUpdate();
			System.out.println("leave inserted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	// update

	public void updatebal(Showlevbal shw) {

	//	String query = "update leave_bal set causal_lev_bal=(SELECT causal_lev_bal from leave_bal where emp_id=? )+ where emp_id=?";
		String query="update leave_bal set causal_lev_bal=causal_lev - ? where emp_id=?";
		Connection con;
		try {
			con = lms_connection.getConnection();
			PreparedStatement pre = con.prepareStatement(query);
			pre.setInt(1, shw.getCausal_lev());
			pre.setInt(2, shw.getEmp_id());
			int i = pre.executeUpdate();
			System.out.println(i+"inserted");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	public void updatebal1(Showlevbal shw1) {

	//	String query = "update leave_bal set causal_lev_bal=(SELECT causal_lev_bal from leave_bal where emp_id=? )+ where emp_id=?";
		String query="update leave_bal set medi_lev_bal=medical_lev - ? where emp_id=?";
		Connection con;
		try {
			con = lms_connection.getConnection();
			PreparedStatement pre = con.prepareStatement(query);
			pre.setInt(1, shw1.getMedical_lev());
			pre.setInt(2, shw1.getEmp_id());
			int i = pre.executeUpdate();
			System.out.println(i+"inserted");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public void updatebal2(Showlevbal shw2) {

		//	String query = "update leave_bal set causal_lev_bal=(SELECT causal_lev_bal from leave_bal where emp_id=? )+ where emp_id=?";
			String query="update leave_bal set paid_lev=paid_lev + ? where emp_id=?";
			Connection con;
			try {
				con = lms_connection.getConnection();
				PreparedStatement pre = con.prepareStatement(query);
				pre.setInt(1, shw2.getPaid_lev());
				pre.setInt(2, shw2.getEmp_id());
				int i = pre.executeUpdate();
				System.out.println(i+"inserted");
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	public void showbal(Showlevbal sh3) {

		String query1 = "select * from LEAVE_BAL where emp_id=? ";
		Connection con;
		try {
			con = lms_connection.getConnection();
			PreparedStatement stmt = con.prepareStatement(query1);
			stmt.setInt(1, sh3.getEmp_id());
			
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.format("%-10s%-10s%-10s%-10s%-10s%-10s\n", rs.getInt(1), rs.getInt(2), rs.getInt(3),
						rs.getInt(4), rs.getInt(5), rs.getInt(6));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
