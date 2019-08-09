package com.practice.board.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.board.member.memberVO;

@Service
public class memberService implements memberServiceI{
	
	@Autowired
	memberVO memberVO;

	@Override
	public void join_member(com.practice.board.member.memberVO memberVO) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean check_same_id(String id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean login() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
}
