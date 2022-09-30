package com.covid.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
public class VaccinationCenter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer code;
	
	@NotNull(message = "Vaccination Center name is required")
	@NotBlank(message = "Vaccination Center name is required")
	private String centername;
	
	@NotNull(message="Address is required")
	@NotBlank(message="Address is required")
	private String address;
	
	@NotNull(message = "City is required")
	@NotBlank(message = "City is required")
	private String city;
	
	@NotNull(message = "State is required")
	@NotBlank(message = "State is required")
	private String state;
	
	@NotNull(message = "Pincode is required")
	@NotBlank(message = "Pincode is required")
	@Size(min=6,max=6)
	private String pincode;
	
	@OneToOne(cascade = CascadeType.ALL)
	public VaccineInventory vaccineInventory;
	
	@OneToMany(cascade = CascadeType.ALL ,mappedBy = "vaccinationCenter")
	public List<Appoinment> appoinments;

	public VaccinationCenter(String centername, String address, String city, String state, String pincode,
			VaccineInventory vaccineInventory, List<Appoinment> appoinments) {
		super();
		this.centername = centername;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.vaccineInventory = vaccineInventory;
		this.appoinments = appoinments;
	}
	
	
}
