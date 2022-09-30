package com.covid.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.covid.model.LoginData;
import com.covid.repo.CurrentUserDAO;
import com.covid.repo.LoginDataDAO;
import com.covid.repo.SignUpDAO;

public class LoginServiceImpl implements LoginService {
	
	@Autowired
	public  CurrentUserDAO currentUserDAO;
	
	@Autowired
	public LoginDataDAO loginDataDAO;
	
	
	@Autowired
	public SignUpDAO signUpDAO;

	@Override
	public String loginAccount(LoginData loginData) {
		
		
		
		
		
		return null;
	}

	@Override
	public String logOutAccount(LoginData loginData, String Uuid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
