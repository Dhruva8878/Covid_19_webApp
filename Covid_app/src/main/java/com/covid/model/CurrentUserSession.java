package com.covid.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrentUserSession {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id; 
	
	@Column(unique = true)
	private Integer userId;
	
	@NotNull
	private LocalDateTime localDateTime;
	
	@NotNull
	private String uuid;

	public CurrentUserSession(Integer userId, LocalDateTime localDateTime, String uuid) {
		super();
		this.userId = userId;
		this.localDateTime = localDateTime;
		this.uuid = uuid;
	}
	
	

}
