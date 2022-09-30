package com.covid.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VaccineInventory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer vaccineInventoryid;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	@NotNull(message="Date is required")
	private LocalDate date;
	
	@OneToOne(cascade = CascadeType.ALL ,mappedBy = "vaccineInventory")
	public VaccinationCenter vaccinationCenter;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "vaccineInventory")
	public List<VaccineCount> vaccineCount;
}
