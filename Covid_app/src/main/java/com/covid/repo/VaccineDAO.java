package com.covid.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.model.Vaccine;

public interface VaccineDAO extends JpaRepository<Vaccine, Integer> {

}
