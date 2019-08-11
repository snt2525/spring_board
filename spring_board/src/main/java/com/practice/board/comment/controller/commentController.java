package com.practice.board.comment.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.practice.board.comment.commentVO;
import com.practice.board.comment.service.commentService;
import com.practice.board.post.postVO;

@Controller
public class commentController {
	@Autowired
	commentService commentService;
	
	@RequestMapping(value = "/getReqlyList", method = RequestMethod.GET)
    public String getContent(Model model, @RequestParam("post_num") int post_num) throws Exception {
		 model.addAttribute("postList", commentService.comment_list(post_num));	   
    	return "show_content";
    }
	
	@RequestMapping(value = "/saveComment", method = RequestMethod.POST)
    public String saveComment(@ModelAttribute("commentVO") commentVO commentVO, RedirectAttributes rttr) throws Exception {
		commentService.save_comment(commentVO);
    	return "redirect:/getContent?post_num=" + Integer.toString(commentVO.getPost_num());
    }
}
