package com.covid.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covid.model.CurrentUserSession;

@Repository
public interface CurrentUserDAO extends JpaRepository<CurrentUserSession, Integer> {

	public Optional<CurrentUserSession> findByuuid(String uuid);
	
}
