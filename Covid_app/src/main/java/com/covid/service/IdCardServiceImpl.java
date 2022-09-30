package com.covid.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.covid.exception.IdCardException;
import com.covid.model.CurrentUserSession;
import com.covid.model.Idcard;
import com.covid.repo.IdCardDAO;
import com.covid.repo.MemberDAO;

public class IdCardServiceImpl implements IdCardService {
	
	@Autowired
	public MemberDAO memberDAO;
	
	@Autowired
	public CurrentUserSession currentUserSession;

	@Autowired
	public IdCardDAO idCardDAO;
	
	
	@Override
	public Idcard getPanCardByNumber(String panNo, String Uuid) throws IdCardException {
		
	
		
		Optional<Idcard> idCard= idCardDAO.findBypanNo(panNo);  
		
		if(idCard.isPresent()) {
			return idCard.get();
		}
		else {
			throw new IdCardException("IdCard is not available by panNo :"+panNo);
		}
	}

	@Override
	public Idcard getAdharCardByNumber(Long adrno) throws IdCardException {
		
		Optional<Idcard> idc=idCardDAO.findByadharNo(adrno);
		
		if(idc.isPresent()) {
			return idc.get();
		}
		else {
			throw new IdCardException("No Idcard Availbale with this adhrNo :"+adrno);
		}
		
	}

	@Override
	public Idcard addIdcard(Idcard idcard) throws IdCardException {
		
		Optional<Idcard> idc=idCardDAO.findById(idcard.getId());
		
		if(idc.isPresent()) {
			throw new IdCardException("User has already Registered");
		}
		else {
			
			return idCardDAO.save(idcard);
		}
	}

}
