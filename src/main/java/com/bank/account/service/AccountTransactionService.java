package com.bank.account.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.account.entity.AccountTransaction;
import com.bank.account.entity.BankAccount;
import com.bank.account.model.AccountTransactionModel;
import com.bank.account.repository.AccountTransactionRepo;
import com.bank.account.repository.BankAccountRepo;

@Service
public class AccountTransactionService {
	
	@Autowired
	AccountTransactionRepo accountTransactionRepo;
	
	@Autowired
	BankAccountRepo bankAccountRepo;
	
	public String createTransaction( AccountTransactionModel accountTransactionModel) {
		
		Optional<BankAccount> bankAccount = bankAccountRepo.findById(accountTransactionModel.getBankAccountId());
		
		AccountTransaction accountTransaction = new AccountTransaction();
		accountTransaction.setTransactionType(accountTransactionModel.getTransactionType());
		accountTransaction.setAmount(accountTransactionModel.getAmount());
		accountTransaction.setBankAccount(bankAccount.get());
		
		
		accountTransactionRepo.save(accountTransaction);
		
		return "Creation Successful";
	}
	

}
