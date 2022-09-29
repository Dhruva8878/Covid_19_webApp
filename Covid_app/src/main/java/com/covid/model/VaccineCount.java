package com.covid.model;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class VaccineCount {

	private Integer quantity;
	private Double price;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "vaccineCount")
	public Vaccine vaccine;
	
	@ManyToOne(cascade = CascadeType.ALL)
	public VaccineInventory vaccineInventory;
    
}
