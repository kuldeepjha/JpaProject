package com.prizy.service;

import org.springframework.stereotype.Service;

import com.prizy.model.EmployeeModel;

@Service
public interface EmailService {
    
    public EmployeeModel printEmployees(int empId) ;
    
    public void saveEmployees() ;
}
