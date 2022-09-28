package com.covid.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.model.VaccineInventory;

public interface VaccinationinventoryDAO extends JpaRepository<VaccineInventory,Integer >{

}
