package com.covid.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Vaccine {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer vaccineId;
	
	@NotNull(message = "Vaccine name is required")
	@NotBlank(message = "Vaccine name is required")
	private String vaccineName;
	
	
	private String description;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "vaccine")
	public Member member;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	public VaccineCount vaccineCount;


	public Vaccine(String vaccineName, String description, Member member, VaccineCount vaccineCount) {
		super();
		this.vaccineName = vaccineName;
		this.description = description;
		this.member = member;
		this.vaccineCount = vaccineCount;
	}
	
	

}
