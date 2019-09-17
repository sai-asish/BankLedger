package com.bank.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.account.entity.UserRegistration;

@Repository
	public interface UserRegistrationRepo extends JpaRepository<UserRegistration, Long>{
		
		UserRegistration findByLoginName(String loginName);
	
	}

