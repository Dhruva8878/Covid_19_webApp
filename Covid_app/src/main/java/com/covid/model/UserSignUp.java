package com.covid.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserSignUp {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	
	@NotNull(message = "Name is Required")
	private String name;
	

	@Pattern(regexp = "^[6-9]{1}[0-9]{9}$", message = "Mobile number is invalid")
	private String mobileNo;
	
	@Email(message="Enter your Email Properly")
	@NotNull(message = "Email is required")
	private String email;
	
	@NotNull(message = "Password is required")
	private String password;
}
