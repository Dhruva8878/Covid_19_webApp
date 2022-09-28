package com.covid.service;

import com.covid.model.Idcard;

public interface IdCardService {

	public Idcard getPanCardByNumber(String panNo);
	
	public Idcard getAdharCardByNumber(Long adrno);
	
	public Idcard addIdcard(Idcard  idcard);
}
