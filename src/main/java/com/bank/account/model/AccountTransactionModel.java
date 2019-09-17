package com.bank.account.model;

public class AccountTransactionModel {

	private Long bankAccountId;
	private String transactionType;
	private Float amount;
	
	public Long getBankAccountId() {
		return bankAccountId;
	}
	public void setBankAccountId(Long bankAccountId) {
		this.bankAccountId = bankAccountId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}	
}
