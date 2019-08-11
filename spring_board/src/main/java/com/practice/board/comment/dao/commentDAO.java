package com.practice.board.comment.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practice.board.comment.commentVO;

@Repository("commentDAO")
public class commentDAO implements commentDAOI {

	@Autowired 
	private SqlSession sqlSession;
	
	@Override
	public void write_comment(commentVO commentVO) throws Exception {
		sqlSession.insert("com.pratice.board.mapper.commentMapper.insertComment", commentVO);		
	}

	@Override
	public void delete_comment(int comment_num) throws Exception {
		sqlSession.delete("com.pratice.board.mapper.commentMapper.deleteComment", comment_num);			
	}

	@Override
	public List<commentVO> get_list(int post_num) throws Exception {
		return sqlSession.selectList("com.pratice.board.mapper.commentMapper.getReplyList");
	}

}
