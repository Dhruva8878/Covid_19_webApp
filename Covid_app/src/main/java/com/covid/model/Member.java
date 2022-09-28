package com.covid.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {
	
	
	@Id
    private Integer id;
	private Boolean dose1status;
	private Boolean dose2status;
	private LocalDate dose1date;
	private LocalDate dose2date;
	
	
	
}
