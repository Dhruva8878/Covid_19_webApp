package com.covid.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SingUp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	
	@NotNull(message = "Name should not be null")
	@Pattern(regexp = "[A-Za-z]")
	private String name;
	
	@NotNull(message = "password should not be null")
	@Pattern(regexp = "[A-Za-z0-9]")
	@Size(min = 6,max=12)
	private String password;
	
	@NotNull(message = "mobileNo should not be null")
	@Pattern(regexp = "[0-9]{10}")
	private String mobileNo;
	
	@Email
	@NotNull(message = "email should not be null")
	private String email;
	

}
