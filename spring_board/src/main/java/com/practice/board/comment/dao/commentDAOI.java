package com.practice.board.comment.dao;

import java.util.List;
import com.practice.board.comment.commentVO;

public interface commentDAOI {
	public List<commentVO> get_list(int post_num) throws Exception;  	             //��� ����Ʈ
	public void write_comment(commentVO commentVO) throws Exception;     //��� ����
	public void delete_comment(int comment_num) throws Exception;        //��� ����
}
