package com.covid.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.covid.exception.LoginException;
import com.covid.exception.SingUpException;
import com.covid.model.SingUp;
import com.covid.repo.SignUpDAO;

public class SignUpServiceIpml  implements SignUpService{
	
	@Autowired
	public  SignUpDAO signUpDAO;

	@Override
	public String addSignUpData(SingUp singUp) throws SingUpException {
	
		Optional<SingUp> data=signUpDAO.findById(singUp.getUserId());
		
		if(data.isPresent()) {
			throw new SingUpException("User already registerd with this account");
		}
		else {
			signUpDAO.save(singUp);
			
			return "SignUp Successfull";
		}
	}

	@Override
	public String UpdateSignUpData(SingUp singUp) throws SingUpException {
		
     Optional<SingUp> data=signUpDAO.findById(singUp.getUserId());
		
     if(data.isPresent()) {
    	 signUpDAO.save(singUp);
    	 return "Update Successfull";
     }
     else {
    	 signUpDAO.save(singUp);
    	 return "SignUp successfull";
     }
        
		
		

	}
	
	

}
