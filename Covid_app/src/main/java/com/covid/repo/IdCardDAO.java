package com.covid.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.model.AdharCard;
import com.covid.model.Idcard;
import com.covid.model.PanCard;

public interface IdCardDAO extends JpaRepository<Idcard, Integer> {

	public Optional<Idcard> findByadharNo(Long  adhrNo);
	
	public Optional<Idcard> findBypanNo(String panNo);
}
