package com.covid.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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


	public Member(Boolean dose1status, Boolean dose2status, LocalDate dose1date, LocalDate dose2date, Idcard idcard,
			VaccineRegistration vaccineRegistration, List<Appoinment> appoinment, Vaccine vaccine) {
		super();
		this.dose1status = dose1status;
		this.dose2status = dose2status;
		this.dose1date = dose1date;
		this.dose2date = dose2date;
		this.idcard = idcard;
		this.vaccineRegistration = vaccineRegistration;
		this.appoinment = appoinment;
		this.vaccine = vaccine;
	}
	
	
}
