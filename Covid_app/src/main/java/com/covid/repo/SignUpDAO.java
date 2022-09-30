package com.covid.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covid.model.SingUp;

@Repository
public interface SignUpDAO  extends JpaRepository<SingUp, Integer>{


}
