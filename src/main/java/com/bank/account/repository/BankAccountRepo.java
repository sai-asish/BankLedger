package com.bank.account.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.account.entity.BankAccount;
import com.bank.account.entity.UserRegistration;

@Repository
public interface BankAccountRepo extends JpaRepository<BankAccount, Long>{
	
	Optional<BankAccount> findById(Long id);
	List<BankAccount> findByUserRegistrationIdLoginName(String userId);
	
}

