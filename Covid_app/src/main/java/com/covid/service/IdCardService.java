package com.covid.service;

import com.covid.exception.IdCardException;
import com.covid.model.Idcard;

public interface IdCardService {

	public Idcard getPanCardByNumber(String panNo,String Uuid) throws IdCardException;
	
	public Idcard getAdharCardByNumber(Long adrno) throws IdCardException;
	
	public Idcard addIdcard(Idcard  idcard) throws IdCardException;
}
