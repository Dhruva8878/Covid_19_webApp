package com.covid.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.covid.exception.MemberException;
import com.covid.model.Member;
import com.covid.repo.IdCardDAO;
import com.covid.repo.MemberDAO;

public class MemberServiceImpl implements MemberService{

	@Autowired
	public MemberDAO memberDAO;
	
	@Autowired
	public IdCardDAO idCardDAO;
	
	
	
	@Override
	public List<Member> getAllMembers() throws MemberException {
		
		List<Member> members=memberDAO.findAll();
		
		if(members.size()>0) {
			return members;
		}
		else {
			throw new MemberException("No such a member is found");
		}
		
	}

	@Override
	public Member getMemberById(Integer id) throws MemberException {
		
		Optional<Member> member=memberDAO.findById(id);
		
		if(member.isPresent()) {
			return member.get();
		}
		else {
			throw new MemberException("No such a member is found with this Id :"+id);
		}
	}

	@Override
	public Member getMemberBYAdharNo(Long adrno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member getMemberByPanNo(String pan) {
		
		
		
		return null;
	}

	@Override
	public Member addMember(Member member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member updateMember(Member member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteMember(Member member) {
		// TODO Auto-generated method stub
		return false;
	}

}
