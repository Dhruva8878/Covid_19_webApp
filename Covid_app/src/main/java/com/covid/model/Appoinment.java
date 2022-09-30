package com.covid.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.covid.enums.Slot;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appoinment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bookingId;
	
	@Pattern(regexp = "^[6-9]{1}[0-9]{9}$" ,message = "Please Enter valid Mobile Number")
	private Long mobileNo;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	@NotNull
	private LocalDate dateofbooking;
	
	@NotNull
	private Boolean bookingstatus;
	
	@NotNull
	private Slot slot;
	
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "appoinment")
	public Member member;
	
	@ManyToOne(cascade = CascadeType.ALL)
	public VaccinationCenter vaccinationCenter;
    
}
