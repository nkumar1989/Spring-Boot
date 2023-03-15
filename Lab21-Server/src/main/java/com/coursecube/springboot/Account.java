package com.coursecube.springboot;

import javax.persistence.*;

@Entity
@Table(name = "myaccounts")
public class Account {
	
	@Id
	@Column(name = "cid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accno;
	
	@Column(name = "atype")
	private String atype;
	
	@Column(name = "bcode")
	private String bcode;
	
	@Column(name = "balance")
	private double balance;
	
	

	public Account() {
		super();
	}


	

	public Account(String atype, String bcode, double balance) {
		super();
		this.atype = atype;
		this.bcode = bcode;
		this.balance = balance;
	}




	public Account(int accno, String atype, String bcode, double balance) {
		super();
		this.accno = accno;
		this.atype = atype;
		this.bcode = bcode;
		this.balance = balance;
	}



	public int getAccno() {
		return accno;
	}



	public void setAccno(int accno) {
		this.accno = accno;
	}



	public String getAtype() {
		return atype;
	}



	public void setAtype(String atype) {
		this.atype = atype;
	}



	public String getBcode() {
		return bcode;
	}



	public void setBcode(String bcode) {
		this.bcode = bcode;
	}



	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	@Override
	public String toString() {
		return "Account [accno=" + accno + ", atype=" + atype + ", bcode=" + bcode + ", balance=" + balance + "]";
	}
	
	

}
