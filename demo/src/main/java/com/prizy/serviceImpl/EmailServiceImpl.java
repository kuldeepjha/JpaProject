package com.prizy.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prizy.model.EmailServiceModel;
import com.prizy.model.EmployeeModel;
import com.prizy.repo.EmailRepository;
import com.prizy.repo.EmployeeRepository;
import com.prizy.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	EmailRepository emailRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public EmployeeModel printEmployees(int empId) {
		
		EmployeeModel employees = employeeRepository.getemployeeList(empId);
		
		return employees;
	}

	@Override
	public void saveEmployees() {
		
		EmployeeModel employeeModel = new EmployeeModel("kuldeep");
		List<EmailServiceModel> emailServiceModelList = new ArrayList<>();
		
		emailServiceModelList.add(new EmailServiceModel
				(new Date(),"JPA","save records",72,"kuldeepjha09", employeeModel));
		employeeModel.setEmailServiceModel(emailServiceModelList);
		
		employeeRepository.save(employeeModel);
		
	}

}
