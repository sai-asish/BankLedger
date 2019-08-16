package com.bank.account.model;

import java.util.List;

public class UserModel {
	
    private String firstName;
    private String lastName;
    private String address;
    private List<Integer> phnnum;
    private String loginName;
    
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
	public List<Integer> getPhnnum() {
		return phnnum;
	}
	public void setPhnnum(List<Integer> phnnum) {
		this.phnnum = phnnum;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	@Override
	public String toString() {
		return "UserModel [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", phnnum="
				+ phnnum + ", loginName=" + loginName + "]";
	}
    
    
    
    
    
    
	
}
