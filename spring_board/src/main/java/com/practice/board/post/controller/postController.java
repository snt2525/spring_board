package com.practice.board.post.controller;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.practice.board.post.postVO;
import com.practice.board.post.service.postService;

@Controller
public class postController {
	
	    @Autowired
	    private postService postService;
	    
	    @RequestMapping(value = "/getPostList", method = RequestMethod.GET)
	    public String getBoardList(Model model) throws Exception {
	        model.addAttribute("postList", postService.getBoardList());
	       
	        return "board_list";
	    }	    
	    
	    @RequestMapping(value = "/newPost", method = RequestMethod.GET)
	    public String getBoardNewPost(Model model) throws Exception {
	        
	    	return "board_new_post";
	    }
	    
	    @RequestMapping(value = "/getPostList", method = RequestMethod.POST)
	    public String getBoardNewPost_insert(Model model,postVO postVO) throws Exception {
	    	postService.insertBoard(postVO);		    	
	        return "board_list";
	    }	    
	    
	    
}
