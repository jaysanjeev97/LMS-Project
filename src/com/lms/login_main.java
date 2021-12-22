package com.lms;


import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.leavestatus.lev_status;
import com.leavestatus.lev_statusdao;
import com.lms_leave.Showlevbal;
import com.lms_leave.leave_res;
import com.lms_leave.leave_res_dao;
import com.lms_leave.showlevdao;

public class login_main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		admindao admi = new admindao();
		empdao empy = new empdao();
		leave_res_dao levres=new leave_res_dao();
		lev_statusdao levsts=new lev_statusdao();

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");

		
		
		System.out.println("\t ENTER THE LEAVE MANAGAMENT\t");
		System.out.println("\n 1.resister \n 2.employee login \n 3.admin login  \n 4.exit");
		int choice = Integer.parseInt(sc.nextLine());
		boolean flag = true;
		boolean flag1 = true;

		int emp_id;
		String emp_name;
		String emp_email;
		String emp_password;
		String emp_department;

		switch (choice) {
		case 1:

			String id;

			do {
				System.out.println("Enter your emp_id:");
				id = sc.nextLine();
				if (id.isEmpty()) {
					System.out.println("emp_id is empty");
				} else if (!id.matches("[0-9]{4,}")) {
					System.out.println("invalid emp__id");
				}
			} while (!id.matches("[0-9]{4,}"));
			emp_id = Integer.parseInt(id);

			do {
				System.out.println("Enter your emp_name:");
				emp_name = sc.nextLine();
				if (emp_name.isEmpty()) {
					System.out.println("emp_name is empty");
				} else if (!emp_name.matches("[A-Za-z]{3,}")) {
					System.out.println("invalid user_name");
				}
			} while (!emp_name.matches("[A-Za-z]{1,}"));

			do {
				System.out.println("Enter your emp_email");
				emp_email = sc.nextLine();
				if (emp_email.isEmpty()) {
					System.out.println("emp_email is empty");
				} else if (!emp_email.matches("[a-z]+[a-z0-9]*[@][a-z]+[.][a-z]{2,}")) {
					System.out.println("invalid email");
				}
			} while (!emp_email.matches("[a-z]+[a-z0-9]*[@][a-z]+[.][a-z]{2,}"));

			do {
				System.out.println("Enter emp_password:");
				emp_password = sc.nextLine();
				if (emp_password.isEmpty()) {
					System.out.println("emp_password is empty");
				} else if (!emp_password.matches("[A-Za-z0-9]+[@][A-za-z0-9]*")) {
					System.out
							.println("must be provide 8 characters and use some special characters for safty purpose");
				}
			} while (!emp_password.matches("[A-Za-z0-9]+[@][A-za-z0-9]*"));

			do {
				System.out.println("Enter your emp_department:");
				emp_department = sc.nextLine();
				if (emp_department.isEmpty()) {
					System.out.println("emp_department is empty");
				} else if (!emp_department.matches("[A-Za-z]{4,}")) {
					System.out.println("invalid emp_department");
				}
			} while (!emp_department.matches("[A-Za-z]{1,}"));

			emp_login obj = new emp_login(emp_id, emp_name, emp_department, emp_email, emp_password);
			empy.resister(obj);
			;
			System.out.println("resister successfully");
			break;

		case 2:

			System.out.println("enter the employee login");
			System.out.println("enter emp_name");
			String empn = sc.nextLine();

			System.out.println("enter your emp_password");
			String Emp_password = sc.nextLine();
			emp_login emp = new emp_login(empn, Emp_password);
			empy.login(emp);
			boolean f = empy.login(emp);
			if (f) {
				System.out.println("log in success");

			} else {
				System.out.println("not success");

			}
			System.out.println("do you want apply leave");
			
			System.out.println("enter the apply leave 1.insert\n  2.update\n 3.delete\n 4.insert balleave \nshow balleave");
			int num1=sc.nextInt();
			sc.nextLine();
			switch(num1) {
			case 1:
				System.out.println("enter the emp_id");
				int id1 = Integer.parseInt(sc.nextLine());
				System.out.println("enter the reason");
				String reason = sc.nextLine();
				System.out.println("enter the from_date");
				String tempdate=sc.nextLine();
				 Date date=sdf.parse(tempdate);
				System.out.println("enter the to_date");
				String tempdate1=sc.nextLine();
				Date date1=sdf.parse(tempdate1);
				System.out.println("enter the noofdays");
				int id2 = Integer.parseInt(sc.nextLine());
				leave_res leaveres=new leave_res(id1, reason, date, date1, id2);
				levres.applyLeave(leaveres);
				break;
			
			case 2:
				System.out.println("enter the emp_id");
				int id3 = Integer.parseInt(sc.nextLine());
				System.out.println("enter the from_date");
				String temp=sc.nextLine();
				Date dat=sdf.parse(temp);
				System.out.println("enter the to_date");
				String temp1=sc.nextLine();
				Date dat1=sdf.parse(temp1);
				System.out.println("enter the noofdays");
				int no = Integer.parseInt(sc.nextLine());
				
				leave_res leaveres1=new leave_res(id3, dat, dat1, no);
				levres.updatelev(leaveres1);
				break;
				
			case 3:
				System.out.println("enter the request_id");
				int id4= Integer.parseInt(sc.nextLine());
				leave_res leaveres2=new leave_res(id4);
				levres.deleteuser(leaveres2);
				break;
			case 4:
				
				Showlevbal sb = new Showlevbal(2930,12,10,2);
				showlevdao sl = new showlevdao();
				sl.insertleave(sb);
			}

		case 3:
			System.out.println("enter the admin login");
			System.out.println("enter manager_id");
			int man = Integer.parseInt(sc.nextLine());

			System.out.println("enter your manager_password");
			String manager_password = sc.nextLine();
			admin adm = new admin(man, manager_password);
			admi.adminlogin(adm);
			boolean f1 = admi.adminlogin(adm);
			if (f1) {
				System.out.println("log in success");

			} else {
				System.out.println("not success");

			}
			System.out.println("leave request form");
			
			System.out.println(" 1.show leave request\n 2.show leave balance\n 3.update\n 4.delete\n ");
			int no=sc.nextInt();
			sc.nextLine();
			switch(no) {
			case 1:
				System.out.println("show leave request");
				levsts.showLevres();
				break;
			case 2:
				System.out.println("show leave balance");
				
				
				
				
				break;
			case 3:
				System.out.println("update the leave request ");
				System.out.println("enter the request_id");
				int res1= Integer.parseInt(sc.nextLine()); 
				System.out.println("enter the status ");
				String status=sc.nextLine();
				lev_status sts=new lev_status(res1, status);
				levsts. updatelevs(sts);
				break;
				
			case 4:
				System.out.println("delete the leave request");
				System.out.println("enter the leave request_id");
				int res2=Integer.parseInt(sc.nextLine());
				lev_status s1=new lev_status(res2);
				levsts.deletelev(s1);
				break;
			
			}
			
            System.out.println("Admin add new employee");
			System.out.println(" 1.insert\n 2.update\n 3.delete \n 0.Exit");
			int num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:
				System.out.println("enter the emp_id");
				int empid = Integer.parseInt(sc.nextLine());
				System.out.println("enter the emp_name");
				String name = sc.nextLine();
				System.out.println("enter the emp_department ");
				String dep = sc.nextLine();
				System.out.println("enter the emp_email ");
				String email = sc.nextLine();
				System.out.println("enter the emp_password ");
				String password = sc.nextLine();

				emp_login empLog = new emp_login(empid, name, dep, email, password);
				admi.insertUser(empLog);
				break;
			case 2:
				System.out.println("update employee details");
				System.out.println("enter the emp_id");
				int id1 = Integer.parseInt(sc.nextLine());
				System.out.println("enter the emp_department ");
				String dep1 = sc.nextLine();
				emp_login empLog1 = new emp_login(id1, dep1);
				admi.updateuser(empLog1);
				break;

			case 3:
				System.out.println("delete for employee");
				System.out.println("enter the emp_id");
				int empid2 = Integer.parseInt(sc.nextLine());
				emp_login emplog2 = new emp_login(empid2);
				admi.deleteuser(emplog2);
				break;
				

			}
		}

	}
}
