package com.lms.model;

public class Showlevbal {
	
	private int lev;
	private int emp_id;
	private int causal_lev;
	private int medical_lev;
	private int causal_lev_bal;
	

	private int medi_lev_bal;
	private int paid_lev;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public int getCausal_lev() {
		return causal_lev;
	}
	public void setCausal_lev(int causal_lev) {
		this.causal_lev = causal_lev;
	}
	public int getMedical_lev() {
		return medical_lev;
	}
	public void setMedical_lev(int medical_lev) {
		this.medical_lev = medical_lev;
	}
	public int getCausal_lev_bal() {
		return causal_lev_bal;
	}
	public void setCausal_lev_bal(int causal_lev_bal) {
		this.causal_lev_bal = causal_lev_bal;
	}
	public int getMedi_lev_bal() {
		return medi_lev_bal;
	}
	public void setMedi_lev_bal(int medi_lev_bal) {
		this.medi_lev_bal = medi_lev_bal;
	}
	public int getPaid_lev() {
		return paid_lev;
	}
	public void setPaid_lev(int paid_lev) {
		this.paid_lev = paid_lev;
	}
	public Showlevbal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Showlevbal(int emp_id, int causal_lev, int medical_lev, int causal_lev_bal, int medi_lev_bal, int paid_lev) {
		super();
		this.emp_id = emp_id;
		this.causal_lev = causal_lev;
		this.medical_lev = medical_lev;
		this.causal_lev_bal = causal_lev_bal;
		this.medi_lev_bal = medi_lev_bal;
		this.paid_lev = paid_lev;
	}
	public Showlevbal(int emp_id,  int causal_lev_bal, int medi_lev_bal, int paid_lev) {
		
		this.emp_id = emp_id;
		
		this.causal_lev_bal = causal_lev_bal;
		this.medi_lev_bal = medi_lev_bal;
		this.paid_lev = paid_lev;
	}
	
	public Showlevbal( int causal_lev,int emp_id ) {
		super();
		this.emp_id = emp_id;
		this.causal_lev = causal_lev;
	}
	public Showlevbal( int medical_lev,int emp_id , int medi_lev_bal) {
		super();
		this.emp_id = emp_id;
		this.medical_lev = medical_lev;
		this.medi_lev_bal = medi_lev_bal;
	}
	public Showlevbal(int emp_id, int causal_lev, int medical_lev, int medi_lev_bal, int paid_lev) {
		super();
		this.emp_id = emp_id;
		this.causal_lev = causal_lev;
		this.medical_lev = medical_lev;
		this.medi_lev_bal = medi_lev_bal;
		this.paid_lev = paid_lev;
	}
	public Showlevbal(int emp_id) {
		super();
		this.emp_id = emp_id;
	}
	
	
	
	
	}
	

 