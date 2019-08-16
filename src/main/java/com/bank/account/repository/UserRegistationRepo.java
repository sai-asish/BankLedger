package com.bank.account.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.account.entity.UserRegistration;

@Repository
public interface UserRegistationRepo extends JpaRepository<UserRegistration, Long>{
	
	UserRegistration findByLoginName(String userId);
}
