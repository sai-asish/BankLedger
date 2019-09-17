package com.bank.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.account.entity.BankAccount;
import com.bank.account.entity.UserRegistration;
import com.bank.account.model.AccountModel;
import com.bank.account.repository.BankAccountRepo;
import com.bank.account.repository.UserRegistrationRepo;

@Service
public class AccountRegistrationService {
	
	@Autowired
	BankAccountRepo accountRegistrationRepo;
	
	@Autowired
	UserRegistrationRepo userRegistrationRepo;
	
	public String createAccount(AccountModel accountModel) {
		
		BankAccount accountRegistration = new BankAccount();
		
		UserRegistration userRegistration = userRegistrationRepo.findByLoginName(accountModel.getLoginName());
		
		accountRegistration.setUserRegistrationId(userRegistration);
		accountRegistration.setName(accountModel.getName());
	    accountRegistration.setNumber(accountModel.getNumber());
		accountRegistration.setCurrency(accountModel.getCurrency());
		
		accountRegistrationRepo.save(accountRegistration);
		
		String status = "Account Registration Successfull";
		
		return status;
	}
	
	
	public List<BankAccount> getAccountsList(String userId){
		
		//UserRegistration userRegistrationId = userRegistrationRepo.findByLoginName(userId);
		
		return accountRegistrationRepo.findByUserRegistrationIdLoginName(userId);
	}
	
	

}
