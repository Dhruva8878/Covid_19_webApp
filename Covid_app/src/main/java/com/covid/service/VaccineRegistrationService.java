package com.covid.service;

import java.util.List;

import com.covid.model.Member;
import com.covid.model.VaccineRegistration;

public interface VaccineRegistrationService {

	public List<VaccineRegistration> getAllVaccineRegistrations();
	
	public VaccineRegistration getvaVaccineRegistration(Long mobileno);
	
	public Member getAllMember(Long mobileno);
	
	public VaccineRegistration addVaccineRegistration(VaccineRegistration reg);
	
	public VaccineRegistration updaVaccineRegistration(VaccineRegistration reg);
	
	public boolean deleteVaccineRegistration(VaccineRegistration reg);
}
