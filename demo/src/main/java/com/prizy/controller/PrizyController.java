package com.prizy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prizy.model.EmployeeModel;
import com.prizy.service.EmailService;

@RestController
@RequestMapping("/Prizy")
public class PrizyController {

	@Autowired
	EmailService emailService;

	@RequestMapping(value = "/getEmplyee", produces = { "application/json" }, method = RequestMethod.GET)
	public EmployeeModel getContect() {
		
		return emailService.printEmployees(3);
	}
	
	@RequestMapping(value = "/saveEmpDetails", produces = { "application/json" }, method = RequestMethod.POST)
	public String saveContect() {
		
		emailService.saveEmployees();
		return "save records";
	}
}
