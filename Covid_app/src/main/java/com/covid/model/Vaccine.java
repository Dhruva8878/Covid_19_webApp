package com.covid.model;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

public class Vaccine {
	
	private Integer vaccineId;
	private String vaccineName;
	private String description;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "vaccine")
	public Member member;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	public VaccineCount vaccineCount;

}
