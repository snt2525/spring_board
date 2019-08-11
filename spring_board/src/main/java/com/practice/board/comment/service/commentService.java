package com.practice.board.comment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.board.comment.commentVO;
import com.practice.board.comment.dao.commentDAO;

@Service
public class commentService implements commentServiceI{

	@Autowired
	commentDAO commentDAO;
	
	@Override
	public void save_comment(commentVO commentVO) throws Exception {
		commentDAO.write_comment(commentVO);
	}

	@Override
	public void delete_comment(int comment_num) throws Exception {
		commentDAO.delete_comment(comment_num);
	}

	@Override
	public List<commentVO> comment_list(int post_num) throws Exception {
		return commentDAO.get_list(post_num);
	}	
}
