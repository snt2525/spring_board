package com.practice.board.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practice.board.member.memberVO;

@Repository("memberDAO")
public class memberDAO implements memberDAOI {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public String getUserInfo(String id) throws Exception {
		System.out.print(id + "#########################################");
		return sqlSession.selectOne("com.pratice.board.mapper.memberMapper.getUserInfo", id);
	}

	@Override
	public String getSameID(String id) throws Exception {
		return sqlSession.selectOne("com.pratice.board.mapper.memberMapper.getSameID", id);
	}

	@Override
	public void joinMember(memberVO memberVO) throws Exception {
		sqlSession.insert("com.pratice.board.mapper.memberMapper.joinMember", memberVO);		
	}
}
