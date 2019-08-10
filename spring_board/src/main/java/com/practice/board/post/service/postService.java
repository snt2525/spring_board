package com.practice.board.post.service;

import java.text.SimpleDateFormat;
import java.util.Date;
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
		List<postVO>list = postDAO.getBoardList();
		for(int i = 0;i < list.size();i++) {
			String currentDate = new SimpleDateFormat("yyyy.MM.dd").format(list.get(i).getRegdate());
			list.get(i).setDate(currentDate);
		}
		return list;
	}

	@Override
	public postVO getBoardPost(int post_num) throws Exception {		
		postVO post = postDAO.getBoardPost(post_num);
		String currentDate = new SimpleDateFormat("yyyy.MM.dd").format(post.getRegdate());
		post.setDate(currentDate);
		return post;
	}

	@Override
	public void insertBoard(postVO postVO) throws Exception {
		//System.out.print(postVO.id);  
    	//System.out.print(postVO.title);
    	//System.out.print(postVO.content); 
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
