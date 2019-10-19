package com.prizy.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class EmployeeModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;

	private String name;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "employeeModel")
	private List<EmployeeAddressModel> employeeAddressModel = new ArrayList<>();

	public EmployeeModel() {

	}

	public EmployeeModel(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<EmployeeAddressModel> getEmployeeAddressModel() {
		return employeeAddressModel;
	}

	public void setEmployeeAddressModel(List<EmployeeAddressModel> employeeAddressModel) {
		this.employeeAddressModel = employeeAddressModel;
	}

	@Override
	public String toString() {
		return "EmployeeModel [empId=" + empId + ", name=" + name + ", employeeAddressModel=" + employeeAddressModel
				+ "]";
	}

}
