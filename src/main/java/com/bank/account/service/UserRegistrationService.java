package com.bank.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.account.entity.UserRegistration;
import com.bank.account.model.UserModel;
import com.bank.account.repository.UserRegistationRepo;

@Service
public class UserRegistrationService {
	
	@Autowired
	UserRegistationRepo userRegistrationRepo;
	
	public String createUser(UserModel userModel) {
		
		UserRegistration userRegistration = new UserRegistration();
		
		userRegistration.setFirstName(userModel.getFirstName());
		userRegistration.setLastName(userModel.getLastName());
		userRegistration.setAddress(userModel.getAddress());
		userRegistration.setPhnum(userModel.getPhnnum().get(0));
		userRegistration.setLoginName(userModel.getLoginName());
		
		userRegistrationRepo.save(userRegistration);
		
		String status = "user registration successful1";
		
		return status;
	}
	
	public UserRegistration getUserDetail(String userId) {
		UserRegistration userRegistration = userRegistrationRepo.findByLoginName(userId);
		
		return userRegistration;
	}
	
	
	
}
