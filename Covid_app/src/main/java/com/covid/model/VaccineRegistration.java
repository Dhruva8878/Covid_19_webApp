package com.covid.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class VaccineRegistration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer regId;
	
	@Size(max=10 , message="Moblie Number length should be 10!")
	private Long mobileNo;
	
    @JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dateofregistration;
	
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "vaccineRegistration")
	private List<Member> members;
	

}
