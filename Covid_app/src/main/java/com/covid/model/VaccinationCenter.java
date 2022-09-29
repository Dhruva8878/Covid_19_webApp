package com.covid.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class VaccinationCenter {

	private Integer code;
	private String centername;
	private String address;
	private String city;
	private String state;
	private String pincode;
	
	@OneToOne(cascade = CascadeType.ALL)
	public VaccineInventory vaccineInventory;
	
	@OneToMany(cascade = CascadeType.ALL ,mappedBy = "vaccinationCenter")
	public List<Appoinment> appoinments;
	
}
