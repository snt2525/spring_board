package com.practice.board.member.dao;

import com.practice.board.member.memberVO;

public interface memberDAOI {
	public String getUserInfo(String id) throws Exception;
	public String getSameID(String id) throws Exception;
	public void joinMember(memberVO memberVO) throws Exception;
}
