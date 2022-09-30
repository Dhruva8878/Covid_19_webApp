package com.covid.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginData {
	
	
	@NotNull(message = "this field is mandatory")
	private String mobileNo;
	
	@NotNull(message = "this field is mandatory")
	private String password;
	
	

}
