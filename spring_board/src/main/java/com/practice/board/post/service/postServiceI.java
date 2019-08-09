package com.practice.board.post.service;

import java.util.List;
import com.practice.board.post.postVO;

public interface postServiceI {
	public List<postVO> getBoardList() throws Exception;		//게시판 리스트 가져오기
	public postVO getBoardPost(int post_num) throws Exception;	//특정 게시판 가져오기
	public void insertBoard(postVO postVO) throws Exception;	//게시글 쓰기
	public void deleteBoard(int post_num) throws Exception;		//게시글 삭제
	public void updateBoard(postVO postVO) throws Exception;	//게시글 수정
}
