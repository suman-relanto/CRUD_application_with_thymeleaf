package com.springboot.application.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long eId;

	@Column(name = "employee_first_name", nullable = false)
	private String employeeFirstName;

	@Column(name = "employee_last_name", nullable = false)
	private String employeeLastName;

	@Column(name = "employee_emailId", nullable = false)
	private String emailId;

	@Column(name = "employee_mobileNumber", nullable = false)
	private String mobileNumber;

	public long geteId() {
		return eId;
	}

	public void seteId(long eId) {
		this.eId = eId;
	}

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Employee(long eId, String employeeFirstName, String employeeLastName, String emailId, String mobileNumber) {
		super();
		this.eId = eId;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
