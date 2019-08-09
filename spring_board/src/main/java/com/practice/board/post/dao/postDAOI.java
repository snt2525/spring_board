package com.practice.board.post.dao;

import java.util.List;


import org.springframework.stereotype.Repository;
import com.practice.board.post.postVO;

public interface postDAOI {
	public List<postVO> getBoardList() throws Exception;
	public postVO getBoardPost(int post_num) throws Exception;
	public void insertBoard(postVO postVO) throws Exception;
	public void updateBoard(postVO postVO) throws Exception;
	public void deleteBorad(int post_num) throws Exception;
}
