package com.prizy.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.prizy.model.EmployeeModel;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer> {

	@Query("SELECT employeeModel  FROM EmployeeModel employeeModel WHERE employeeModel.empId=:empId")
	public EmployeeModel getemployeeList(@Param("empId") int empId);

}