package com.covid.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;


import lombok.Data;

@Entity
public class Member {
	
	
	@Id
    private Integer id;
	
	private Boolean dose1status;
	private Boolean dose2status;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING , pattern = "dd/MM/yyyy")
	private LocalDate dose1date;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING , pattern = "dd/MM/yyyy")
	private LocalDate dose2date;
	
	@OneToOne(cascade = CascadeType.ALL)
	Idcard idcard;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	VaccineRegistration vaccineRegistration;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Appoinment> appoinment;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	Vaccine vaccine;
	
	
}
