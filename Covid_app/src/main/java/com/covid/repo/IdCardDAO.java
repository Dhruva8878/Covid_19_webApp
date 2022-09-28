package com.covid.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.model.Idcard;

public interface IdCardDAO extends JpaRepository<Idcard, Integer> {

}
