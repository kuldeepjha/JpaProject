package com.prizy.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EmailService")
public class EmailServiceModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private Date date;

	private String subject;

	private String messgae;

	private int phoneNo;

	private String mailId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "empId", nullable = false)
	private EmployeeModel employeeModel;

	public EmailServiceModel() {

	}

	public EmailServiceModel(Date date, String subject, String messgae, int phoneNo, String mailId) {
		this.date = date;
		this.subject = subject;
		this.messgae = messgae;
		this.phoneNo = phoneNo;
		this.mailId = mailId;
	}

	public EmailServiceModel(Date date, String subject, String messgae, int phoneNo, String mailId,
			EmployeeModel employeeModel) {
		this.date = date;
		this.subject = subject;
		this.messgae = messgae;
		this.phoneNo = phoneNo;
		this.mailId = mailId;
		this.employeeModel = employeeModel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessgae() {
		return messgae;
	}

	public void setMessgae(String messgae) {
		this.messgae = messgae;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public EmployeeModel getEmployeeModel() {
		return employeeModel;
	}

	public void setEmployeeModel(EmployeeModel employeeModel) {
		this.employeeModel = employeeModel;
	}

	@Override
	public String toString() {
		return "EmailServiceModel [id=" + id + ", date=" + date + ", subject=" + subject + ", messgae=" + messgae
				+ ", phoneNo=" + phoneNo + ", mailId=" + mailId + ", employeeModel=" + employeeModel + "]";
	}

}
