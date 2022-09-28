package com.covid.service;

import java.util.List;

import com.covid.model.Member;

public interface MemberService {
	
	public List<Member> getAllMembers();
	
	public Member getMemberById(Integer id);
	
	public Member getMemberBYAdharNo(Long adrno);
	
	public Member getMemberByPanNo(String pan);
	
	public Member addMember(Member member);
	
	public Member updateMember(Member member);
	
	public boolean deleteMember(Member member);

}
