package com.covid.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.model.VaccineRegistration;

public interface VaccinationRegistrationDAO extends JpaRepository<VaccineRegistration, Integer>{

}
