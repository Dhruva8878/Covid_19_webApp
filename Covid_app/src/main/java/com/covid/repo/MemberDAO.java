package com.covid.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.covid.model.Member;

public interface MemberDAO extends JpaRepository<Member, Integer>{

	@Query("select * from Member where  ")
	public Member getMemberByAdharNo(Long adrno);
	
	
}
