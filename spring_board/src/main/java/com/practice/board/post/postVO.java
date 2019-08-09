package com.practice.board.post;

import java.util.Date;

public class postVO {
	public String id;
	public int post_num;
	public String title;
	public String content;
	public Date regdate;
	public Date timestamp;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public int getPost_num() {
		return post_num;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public Date getRegdate() {
		return regdate;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	
}
