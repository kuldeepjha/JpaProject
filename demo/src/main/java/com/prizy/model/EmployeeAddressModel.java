package com.prizy.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeAddress")
public class EmployeeAddressModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addId;

	private String address1;

	private String address2;

	private int pinCode;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "empId", nullable = false)
	private EmployeeModel employeeModel;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "employeeAddressModel")
	private List<EmailServiceModel> emailServiceModel = new ArrayList<>();

	public EmployeeAddressModel() {

	}

	public EmployeeAddressModel(String address1, String address2, int pinCode) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.pinCode = pinCode;
	}

	public EmployeeAddressModel(String address1, String address2, int pinCode, EmployeeModel employeeModel) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.pinCode = pinCode;
		this.employeeModel = employeeModel;
	}

	public int getAddId() {
		return addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public EmployeeModel getEmployeeModel() {
		return employeeModel;
	}

	public void setEmployeeModel(EmployeeModel employeeModel) {
		this.employeeModel = employeeModel;
	}

	public List<EmailServiceModel> getEmailServiceModel() {
		return emailServiceModel;
	}

	public void setEmailServiceModel(List<EmailServiceModel> emailServiceModel) {
		this.emailServiceModel = emailServiceModel;
	}

	@Override
	public String toString() {
		return "EmployeeAddressModel [addId=" + addId + ", address1=" + address1 + ", address2=" + address2
				+ ", pinCode=" + pinCode + ", employeeModel=" + employeeModel + ", emailServiceModel="
				+ emailServiceModel + "]";
	}

}
