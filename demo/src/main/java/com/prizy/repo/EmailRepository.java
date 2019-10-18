package com.prizy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prizy.model.EmailServiceModel;

@Repository
public interface EmailRepository extends JpaRepository<EmailServiceModel, Integer> {
	
}
