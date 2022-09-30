package com.covid.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.model.Appoinment;

public interface AppoinmentDAO extends JpaRepository<Appoinment, Long> {

}
