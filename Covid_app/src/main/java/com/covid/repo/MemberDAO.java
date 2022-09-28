package com.covid.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.model.Member;

public interface MemberDAO extends JpaRepository<Member, Integer>{

}
