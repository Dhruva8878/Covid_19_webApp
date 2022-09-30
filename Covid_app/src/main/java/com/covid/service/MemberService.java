package com.covid.service;

import java.util.List;

import com.covid.exception.MemberException;
import com.covid.model.Member;

public interface MemberService {
	
	public List<Member> getAllMembers() throws MemberException;
	
	public Member getMemberById(Integer id) throws MemberException;
	
	public Member getMemberBYAdharNo(Long adrno);
	
	public Member getMemberByPanNo(String pan);
	
	public Member addMember(Member member);
	
	public Member updateMember(Member member);
	
	public boolean deleteMember(Member member);

}
