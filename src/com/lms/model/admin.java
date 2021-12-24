package com.lms.model;

public class admin {

	private  int manager_id;
	private String manager_name;
	private String manager_email;
	private String manager_password;
	private String manager_department;
	
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public String getManager_name() {
		return manager_name;
	}
	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}
	public String getManager_email() {
		return manager_email;
	}
	public void setManager_email(String manager_email) {
		this.manager_email = manager_email;
	}
	public String getManager_password() {
		return manager_password;
	}
	public void setManager_password(String manager_password) {
		this.manager_password = manager_password;
	}
	
	
	public String getManager_department() {
		return manager_department;
	}
	public void setManager_department(String manager_department) {
		this.manager_department = manager_department;
	}
	public admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public admin(int manager_id, String manager_name, String manager_email, String manager_password,
			String manager_department) {
		super();
		this.manager_id = manager_id;
		this.manager_name = manager_name;
		this.manager_email = manager_email;
		this.manager_password = manager_password;
		this.manager_department = manager_department;
	}
	public admin(int manager_id, String manager_password) {
		super();
		this.manager_id = manager_id;
		this.manager_password = manager_password;
	}


	
	
}
