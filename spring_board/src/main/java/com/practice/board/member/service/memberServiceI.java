package com.practice.board.member.service;

import com.practice.board.member.memberVO;

public interface memberServiceI {
	public void join_member(memberVO memberVO) throws Exception;
	public boolean check_same_id(String id) throws Exception;
	public boolean login(memberVO memberVO) throws Exception; 
}
