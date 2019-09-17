package com.bank.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bank.account.model.AccountTransactionModel;
import com.bank.account.service.AccountTransactionService;

@RestController
@RequestMapping(value="transaction")
public class AccountTransactionController {
	@Autowired
	AccountTransactionService accountTransactionService;

	@RequestMapping(value="/create", method=RequestMethod.POST)
	public ResponseEntity<String> createTransaction(@RequestBody AccountTransactionModel accountTransactionModel ) {
		
		String status = accountTransactionService.createTransaction(accountTransactionModel);

		return new ResponseEntity<String>(status, HttpStatus.OK);
	}

}
