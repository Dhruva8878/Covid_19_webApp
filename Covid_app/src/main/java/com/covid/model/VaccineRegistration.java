package com.covid.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
public class VaccineRegistration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer regId;
	
	@Size(max=10 , message="Moblie Number length should be 10!")
	@Pattern(regexp = "^[6-9]{1}[0-9]{9}$", message = "Mobile number is invalid")
	private Long mobileNo;
	
    @JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dateofregistration;
	
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "vaccineRegistration")
	private List<Member> members;
	

}
