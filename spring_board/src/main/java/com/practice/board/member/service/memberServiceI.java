package com.practice.board.member.service;

import com.practice.board.member.memberVO;

public interface memberServiceI {
	//회원 가입
	public void join_member(memberVO memberVO) throws Exception;
	//id가 존재하는지 확인
	public boolean check_same_id(String id) throws Exception;
	//아이디와 비밀번호가 존재하고, 비밀번호도 맞는 지?
	public boolean login() throws Exception;
}
