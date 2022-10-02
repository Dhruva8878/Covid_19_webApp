package com.covid.service;

import com.covid.exception.SigninException;
import com.covid.model.UserSignin;

public interface UserService {
	public UserSignin createUser(UserSignin user) throws SigninException;
	
	public UserSignin updateUser(UserSignin user, String uuid) throws SigninException;
}
