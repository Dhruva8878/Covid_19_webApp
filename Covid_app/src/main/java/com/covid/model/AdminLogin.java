package com.covid.model;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminLogin {
	@NotNull(message="Mobile is required")
	private String mobileNo;
	
	@NotNull(message = "Password is required")
	private String password;
}
