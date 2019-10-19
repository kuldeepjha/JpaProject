package com.prizy.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prizy.model.EmailServiceModel;
import com.prizy.model.EmployeeAddressModel;
import com.prizy.model.EmployeeModel;
import com.prizy.repo.EmailRepository;
import com.prizy.repo.EmployeeAddressRepository;
import com.prizy.repo.EmployeeRepository;
import com.prizy.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	EmailRepository emailRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	EmployeeAddressRepository employeeAddressRepository;
	
	@Override
	public EmployeeModel printEmployees(int empId) {
		
		EmployeeModel employees = employeeRepository.getemployeeList(empId);
		
		return employees;
	}

	@Override
	public void saveEmployees() {
		
		
		
		
		EmployeeModel employeeModel = new EmployeeModel("kuldeep");
				
		List<EmployeeAddressModel> employeeAddressModelList = new ArrayList<>();
		
		EmployeeAddressModel employeeAddressModel = new EmployeeAddressModel();
		employeeAddressModel.setAddress1("new delhi");
		employeeAddressModel.setAddress2("varanasi");
		employeeAddressModel.setPinCode(221002);
		employeeAddressModel.setEmployeeModel(employeeModel);
		
		List<EmailServiceModel> emailServiceModelList = new ArrayList<>();
		EmailServiceModel emailServiceModel = new EmailServiceModel();
		emailServiceModel.setDate(new Date());
		emailServiceModel.setMailId("kuldeepjha09@gmail.com");
		emailServiceModel.setMessgae("1 2 many and many 2 1 relationship");
		emailServiceModel.setPhoneNo(7218);
		emailServiceModel.setSubject("JAP relationship");
		emailServiceModel.setEmployeeAddressModel(employeeAddressModel);
		emailServiceModelList.add(emailServiceModel);
		
		employeeAddressModel.setEmailServiceModel(emailServiceModelList);
		employeeAddressModelList.add(employeeAddressModel);
		
		employeeModel.setEmployeeAddressModel(employeeAddressModelList);
		employeeRepository.save(employeeModel);
		
		
	}

}
