package com.practice.board.comment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.practice.board.comment.service.commentService;

@Controller
public class commentController {
	@Autowired
	commentService commentService;
}
