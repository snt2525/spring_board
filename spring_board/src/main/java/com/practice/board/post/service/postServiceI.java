package com.practice.board.post.service;

import java.util.List;
import com.practice.board.post.postVO;

public interface postServiceI {
	public List<postVO> getBoardList() throws Exception;		//寃뚯떆�뙋 由ъ뒪�듃 媛��졇�삤湲�
	public postVO getBoardPost(int post_num) throws Exception;	//�듅�젙 寃뚯떆�뙋 媛��졇�삤湲�
	public void insertBoard(postVO postVO) throws Exception;	//寃뚯떆湲� �벐湲�
	public void deleteBoard(int post_num) throws Exception;		//寃뚯떆湲� �궘�젣
	public void updateBoard(postVO postVO) throws Exception;	//寃뚯떆湲� �닔�젙
}
