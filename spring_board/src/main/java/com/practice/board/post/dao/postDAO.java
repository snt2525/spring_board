package com.practice.board.post.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practice.board.post.postVO;

@Repository("postDAO")
public class postDAO implements postDAOI {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<postVO> getBoardList() throws Exception {
		return sqlSession.selectList("com.pratice.board.mapper.boardMapper.getBoardList");
	}

	@Override
	public postVO getBoardPost(int post_num) throws Exception {
		return sqlSession.selectOne("com.pratice.board.mapper.boardMapper.getBoardPost", post_num);
	}

	@Override
	public void insertBoard(postVO postVO) throws Exception {
		sqlSession.insert("com.pratice.board.mapper.boardMapper.initID"); //자동 초기화
		sqlSession.insert("com.pratice.board.mapper.boardMapper.insertBoard",postVO);
	}

	@Override
	public void updateBoard(postVO postVO) throws Exception {
		sqlSession.update("com.pratice.board.mapper.boardMapper.updateBoard", postVO);
	}

	@Override
	public void deleteBorad(int post_num) throws Exception {
		sqlSession.delete("com.pratice.board.mapper.boardMapper.deleteBoard", post_num);
	}
	
}
