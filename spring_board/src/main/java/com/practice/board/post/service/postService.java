package com.practice.board.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.board.post.postVO;
import com.practice.board.post.dao.postDAO;

@Service
public class postService implements postServiceI{
	@Autowired
	postDAO postDAO;
	
	@Override
	public List<postVO> getBoardList() throws Exception {
		return postDAO.getBoardList();
	}

	@Override
	public postVO getBoardPost(int post_num) throws Exception {		
		return postDAO.getBoardPost(post_num);
	}

	@Override
	public void insertBoard(postVO postVO) throws Exception {
		postDAO.insertBoard(postVO);
	}

	@Override
	public void deleteBoard(int post_num) throws Exception {
		postDAO.deleteBorad(post_num);
	}

	@Override
	public void updateBoard(postVO postVO) throws Exception {
		postDAO.updateBoard(postVO);		
	}

}
