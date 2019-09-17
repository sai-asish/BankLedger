package com.bank.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bank.account.entity.BankAccount;
import com.bank.account.model.AccountModel;
import com.bank.account.service.AccountRegistrationService;

@RestController
@RequestMapping(value="account")
public class BankAccountController {
	@Autowired
	AccountRegistrationService accountRegistrationService;

	@RequestMapping(value="/registration", method=RequestMethod.POST)
	public ResponseEntity<String> accountRegistration(@RequestBody AccountModel accountModel ) {
		
		String status = accountRegistrationService.createAccount(accountModel);
			
			return new ResponseEntity<String>(status, HttpStatus.OK);
	}
	
	@RequestMapping(value="{userId}/list", method=RequestMethod.GET)
	public ResponseEntity<List<BankAccount>> getAccountsList(@PathVariable String userId ) {
		
		 List<BankAccount> bankAccountList = accountRegistrationService.getAccountsList(userId);
			
			return new ResponseEntity<List<BankAccount>>(bankAccountList, HttpStatus.OK);
	}

}
