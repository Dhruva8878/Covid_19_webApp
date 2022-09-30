package com.covid.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covid.model.LoginData;
import com.covid.model.SingUp;

@Repository
public interface LoginDataDAO extends JpaRepository<LoginData, String> {

	public SingUp findByMobileNo(String mobileNo);
}
