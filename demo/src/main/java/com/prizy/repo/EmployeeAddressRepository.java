package com.prizy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prizy.model.EmployeeAddressModel;

@Repository
public interface EmployeeAddressRepository extends JpaRepository<EmployeeAddressModel, Integer> {

	
}