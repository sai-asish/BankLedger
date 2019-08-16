package com.bank.account.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "USER_REGISTRATION")
public class UserRegistration implements Serializable {
	
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_REGISTRATION_SEQ")
    @SequenceGenerator(sequenceName = "user_registration_seq", allocationSize = 1, name = "USER_REGISTRATION_SEQ")  
    @NotNull
    @Column(name = "id")
    private Long id;
      
    @Size(max = 255)
    @Column(name = "first_name")
    private String firstName;
    
    @Size(max = 255)
    @Column(name = "last_name")
    private String lastName;
    
    @Size(max = 255)
    @Column(name = "address")
    private String address;
    
    @Column(name = "phnum")
    private Integer phnum;
    
    @Size(max = 255)
    @Column(name = "login_name")
    private String loginName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPhnum() {
		return phnum;
	}

	public void setPhnum(Integer phnum) {
		this.phnum = phnum;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    


}
