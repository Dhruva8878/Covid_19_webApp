package com.covid.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class PanCard {
	
	@Pattern(regexp = "[A-Z]{5}[0-9]{4}[A-Z]{1}", message="Pancard number is Invalid")
	private String panNo;

}
