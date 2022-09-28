package com.covid.service;

import java.time.LocalDate;
import java.util.List;

import com.covid.model.Vaccine;
import com.covid.model.VaccineInventory;

public class VaccineInventoryServiceImpl implements VaccineInventoryService{

	@Override
	public List<VaccineInventory> getAllInventories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VaccineInventory getVaccineInventoryByCenter(Integer centerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VaccineInventory addVaccineCount(VaccineInventory inv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VaccineInventory updatVaccineInventory(VaccineInventory inv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteVaccineInventory(VaccineInventory inv) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<VaccineInventory> getAllVaccineInventoriesByDate(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VaccineInventory> getAllVaccineInventoriesByVaccine(Vaccine vaccine) {
		// TODO Auto-generated method stub
		return null;
	}

}
