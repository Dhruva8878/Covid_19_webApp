package com.covid.service;

import java.time.LocalDate;
import java.util.List;

import com.covid.model.Vaccine;
import com.covid.model.VaccineCount;
import com.covid.model.VaccineInventory;

public interface VaccineInventoryService {
	
	
	public List<VaccineInventory> getAllInventories();
	
	public VaccineInventory getVaccineInventoryByCenter(Integer centerId);
	
	public VaccineInventory addVaccineCount(VaccineInventory inv);
	
	public VaccineInventory updatVaccineInventory(VaccineInventory inv);
	
	public boolean deleteVaccineInventory(VaccineInventory inv);
	
	public List<VaccineInventory> getAllVaccineInventoriesByDate(LocalDate date);
	
	public List<VaccineInventory> getAllVaccineInventoriesByVaccine(Vaccine vaccine);
	

}
