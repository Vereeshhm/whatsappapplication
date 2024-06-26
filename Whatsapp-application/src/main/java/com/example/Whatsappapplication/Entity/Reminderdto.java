package com.example.Whatsappapplication.Entity;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.constraints.Pattern;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@javax.persistence.Entity
@javax.persistence.Table(name="loandetailss")
public class Reminderdto {

    @Id
	@javax.persistence.GeneratedValue(strategy = GenerationType.AUTO)
	
	private String mobile_no;
	

	private String saswat_loan_number;
	
	
	private String customer_name;

    
	private String emi_date;


	
	
	public String getMobile_no() {
		return mobile_no;
	}


	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}


	public String getSaswat_loan_number() {
		return saswat_loan_number;
	}


	public void setSaswat_loan_number(String saswat_loan_number) {
		this.saswat_loan_number = saswat_loan_number;
	}






	public String getCustomer_name() {
		return customer_name;
	}


	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}


	public String getEmi_date() {
		return emi_date;
	}


	public void setEmi_date(String emi_date) {
		this.emi_date = emi_date;
	}


	@Override
	public String toString() {
		return "Reminderdto [mobile_no=" + mobile_no + ", saswat_loan_number=" + saswat_loan_number + ", customer_name="
				+ customer_name + ", emi_date=" + emi_date + "]";
	}



	
	
	
}
