package com.covid.model;

import javax.persistence.Entity;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class AdharCard {
	
	
//	@Size(max = 14, message = "Addhar card number length is maximum 12!")
	@Pattern(regexp = "^[2-9]{1}[0-9]{3}[0-9]{4}[0-9]{4}$", message = "Adhar card Number is Invalid!")
	private Long adharNo;
	
	private String fingerPrint;
	private String irisScan;
	

}
