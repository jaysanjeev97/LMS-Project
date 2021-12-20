package com.lms_leave;

import java.util.Date;

public class leave_res {
	
	private int request_id;
	private int emp_id;
	private String reason;
	private Date from_date;
	private Date to_date;
	public int getRequest_id() {
		return request_id;
	}
	public void setRequest_id(int request_id) {
		this.request_id = request_id;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Date getFrom_date() {
		return from_date;
	}
	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}
	public Date getTo_date() {
		return to_date;
	}
	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}
	public leave_res() {
		super();
		// TODO Auto-generated constructor stub
	}
	public leave_res(int request_id, int emp_id, String reason, Date from_date, Date to_date) {
		super();
		this.request_id = request_id;
		this.emp_id = emp_id;
		this.reason = reason;
		this.from_date = from_date;
		this.to_date = to_date;
	}
	
	

}
