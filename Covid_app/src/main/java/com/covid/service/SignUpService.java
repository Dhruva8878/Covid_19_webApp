package com.covid.service;

import com.covid.exception.SingUpException;
import com.covid.model.SingUp;

public interface SignUpService {
	
	
	public String addSignUpData(SingUp singUp) throws SingUpException;
	
	
	public String UpdateSignUpData(SingUp singUp) throws SingUpException;

}
