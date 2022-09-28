package com.covid.service;

import java.util.List;

import com.covid.model.Vaccine;

public interface VaccineService {

	public List<Vaccine> getAllVaccines();
	
	public Vaccine getVaccineByName(String vaccinename);
	
	public Vaccine getVaccineById(Integer vaccineId);
	
	public Vaccine addvaccine(Vaccine vaccine);
	
	public Vaccine updateVaccine(Vaccine vaccine);
	
	public boolean deleteVaccine(Vaccine vaccine);
}
