package com.covid.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Idcard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NotNull(message = "Name Should Be not null")
	@NotBlank(message = "Name is mandatory")
	private String name;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING ,pattern = "dd/mm/yyyy")
	private LocalDate dob;
	
	@NotNull(message = "gender should be Mandatory")
	private String gender;
	
	@NotNull(message = "Address shuold be required")
	@Pattern(regexp = "^[A-Z][a-z]*")
	private String address;
	
	@NotNull(message = "city shuold be required")
	private String city;
	
	@NotNull(message = "State shuold be required")
	private String state;
	
	@NotNull(message = "pincode shuold be required")
	@Size(min = 6, max = 8)
	private String pincode;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Member member;
	
	
	@Embedded
	PanCard panCard;
	
	@Embedded
	AdharCard adharCard;
	

}
