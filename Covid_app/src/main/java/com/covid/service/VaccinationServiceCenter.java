package com.covid.service;

import java.util.List;

import com.covid.model.VaccinationCenter;

public interface VaccinationServiceCenter {
	
	public List<VaccinationCenter> getAllCenters();
	
	public VaccinationCenter getVaccineCenter(Integer centerId);
	
	public VaccinationCenter addVaccinationCenter(VaccinationCenter center);

	public VaccinationCenter updateVaccinationCenter(VaccinationCenter center);
	
	public boolean deleteVaccinationCenter(VaccinationCenter center);
	
	
}
