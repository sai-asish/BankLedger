package com.bank.account.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name = "ACCOUNT_TRANSACTION")
public class AccountTransaction {
	
	private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ACCOUNT_TRANSACTION_SEQ")
    @SequenceGenerator(sequenceName = "account_transaction_seq", allocationSize = 1, name = "ACCOUNT_TRANSACTION_SEQ")  
    @NotNull
    @Column(name = "id")
    private Long id;
      
    @Size(max = 255)
    @Column(name = "transaction_type")
    private String transactionType;
    
    @Column(name = "amount")
    private Float amount;
    
    @JoinColumn(name = "bank_account_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private BankAccount bankAccount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
    
}
