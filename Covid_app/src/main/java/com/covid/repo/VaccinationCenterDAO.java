package com.covid.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.model.VaccinationCenter;
import com.covid.service.VaccineService;

public interface VaccinationCenterDAO extends JpaRepository<VaccinationCenter, Integer>{

}
