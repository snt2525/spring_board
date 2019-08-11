package com.practice.board.comment.service;

import java.util.List;

import com.practice.board.comment.commentVO;

public interface commentServiceI {
	public List<commentVO> comment_list(int post_num) throws Exception;  	         //¥Ò±€ ∏ÆΩ∫∆Æ
	public void write_comment(commentVO commentVO) throws Exception;     //¥Ò±€ æ≤±‚
	public void delete_comment(int comment_num) throws Exception;        //¥Ò±€ ªË¡¶
}
