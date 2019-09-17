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
@Table(name = "BANK_ACCOUNT")
public class BankAccount {
	
	private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_REGISTRATION_SEQ")
    @SequenceGenerator(sequenceName = "user_registration_seq", allocationSize = 1, name = "USER_REGISTRATION_SEQ")  
    @NotNull
    @Column(name = "id")
    private Long id;
      
    @Size(max = 255)
    @Column(name = "name")
    private String Name;
    
    @Column(name = "number")
    private Integer Number;
    
    @Size(max = 3)
    @Column(name = "Currency")
    private String Currency;
    
    @JoinColumn(name = "user_registration_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private UserRegistration userRegistrationId;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getNumber() {
		return Number;
	}

	public void setNumber(Integer number) {
		Number = number;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}



	public UserRegistration getUserRegistrationId() {
		return userRegistrationId;
	}

	public void setUserRegistrationId(UserRegistration userRegistrationId) {
		this.userRegistrationId = userRegistrationId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
    
    
    
}
