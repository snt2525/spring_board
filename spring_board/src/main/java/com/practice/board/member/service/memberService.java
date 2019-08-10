package com.practice.board.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.board.member.memberVO;
import com.practice.board.member.dao.memberDAO;

@Service
public class memberService implements memberServiceI{

	@Autowired
	memberDAO mem;
	
	@Override
	public void join_member(memberVO memberVO) throws Exception { 
		mem.joinMember(memberVO);	
	}

	@Override
	public boolean check_same_id(String id) throws Exception {
		if(mem.getSameID(id).equals(id)) 
		{
			return true;
		}
		
		return false;
	}

	@Override
	public boolean login(memberVO memberVO) throws Exception {
		if(mem.getUserInfo(memberVO.id).equals(memberVO.pwd))
		{
			return true;
		}
		
		return false;
	}
	
}
