package com.practice.board.comment;

import java.util.Date;

public class commentVO {
	int comment_num;
	int post_num;
	String id;
	String comment_content;
	Date date;
	
	public int getComment_num() {
		return comment_num;
	}
	
	public void setComment_num(int comment_num) {
		this.comment_num = comment_num;
	}
	
	public int getPost_num() {
		return post_num;
	}
	
	public void setPost_num(int post_num) {
		this.post_num = post_num;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getComment_content() {
		return comment_content;
	}
	
	public void setComment_content(String comment_content) {
		this.comment_content = comment_content;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
}
