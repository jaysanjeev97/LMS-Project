package com.lms;

import java.sql.SQLException;
import java.util.Scanner;





public class login_main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		admindao admi=new admindao();
		empdao empy=new empdao();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\t ENTER THE LEAVE MANAGAMENT\t");
		System.out.println("\n 1.resister \n 2.employee login \n 3.admin login  \n 4.exit");
		int choice=Integer.parseInt(sc.nextLine());
		boolean flag=true;
		boolean flag1=true;
		
		int emp_id ;
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
			 emp_id=Integer.parseInt(id);
			
			

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
				emp_email= sc.nextLine();
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
					System.out.println("must be provide 8 characters and use some special characters for safty purpose");
				}
			} while (!emp_password.matches("[A-Za-z0-9]+[@][A-za-z0-9]*"));
			
			do {
				System.out.println("Enter your emp_department:");
				emp_department= sc.nextLine();
				if (emp_department.isEmpty()) {
					System.out.println("emp_department is empty");
				} else if (!emp_department.matches("[A-Za-z]{4,}")) {
					System.out.println("invalid emp_department");
				}
			} while (!emp_department.matches("[A-Za-z]{1,}"));
			
			
			
			emp_login obj=new emp_login(emp_id, emp_name, emp_department, emp_email, emp_password);
			empy.resister(obj);;
			System.out.println("resister successfully");
			break;
    	
    case 2:
    	
        System.out.println("enter the employee login");
    	System.out.println("enter emp_id");
    	  int ep=Integer.parseInt(sc.nextLine());
    	
    	System.out.println("enter your emp_password");
    	String Emp_password=sc.nextLine();
    	emp_login emp=new emp_login(ep, Emp_password);
    	empy.login(emp);
    	boolean  f=empy.login(emp);
    	if (f) {
    		System.out.println("log in success");
    		
    	}else {
    		System.out.println("not success");
    		
    	}
    	break;
    	
    case 3:
    	System.out.println("enter the admin login");
     	System.out.println("enter manager_id");
     	  int man=Integer.parseInt(sc.nextLine());
     	
     	System.out.println("enter your manager_password");
     	String manager_password=sc.nextLine();
     	admin  adm =new admin(man, manager_password);
     	admi.adminlogin(adm);
     	boolean f1= admi.adminlogin(adm);
     	if (f1) {
     		System.out.println("log in success");
     		
     	}else {
     		System.out.println("not success");
     		
     	}
     
     	
        System.out.println("enter your choice 1.insert\n 2.update\n 3.delete \n 0.Exit");
		int num= sc.nextInt();
		sc.nextLine();
		switch(num) {
		case 1:
			System.out.println("enter the emp_id");
			int empid=Integer.parseInt(sc.nextLine());
			System.out.println("enter the emp_name");
			String name=sc.nextLine();
			System.out.println("enter the emp_department ");
			String dep=sc.nextLine();
			System.out.println("enter the emp_email ");
			String email=sc.nextLine();
			System.out.println("enter the emp_password ");
			String password=sc.nextLine();
			
			emp_login empLog= new emp_login(empid, name, dep, email, password);
			admi.insertUser(empLog);
			break;
		case 2:
			System.out.println("update employee details");
			System.out.println("enter the emp_name");
			String name1=sc.nextLine();
			System.out.println("enter the emp_department ");
			String dep1=sc.nextLine();
			emp_login empLog1= new emp_login( name1, dep1);
			admi.updateuser(empLog1);
			break;
			
		case 3:
			System.out.println("delete for employee");
			System.out.println("enter the emp_id");
			int empid2=Integer.parseInt(sc.nextLine());
			emp_login emplog2=new emp_login(empid2);
			admi.deleteuser(emplog2);
			break;
		
		}
	}

}}
