package com.covid.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class VaccineInventory {

	private Integer vaccineInventoryid;
	
	private LocalDate date;
	
	@OneToOne(cascade = CascadeType.ALL ,mappedBy = "vaccineInventory")
	public VaccinationCenter vaccinationCenter;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "vaccineInventory")
	public List<VaccineCount> vaccineCount;
}
