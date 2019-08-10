package com.practice.board.post.controller;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	    
	    @RequestMapping(value = "/savePost", method = RequestMethod.POST)
	    public String getBoardNewPost_insert(@ModelAttribute("postVO") postVO postVO, RedirectAttributes rttr) throws Exception {	    
	    	postService.insertBoard(postVO);  		    	
	    	return "redirect:/getPostList";
	    }	    
	    
	    @RequestMapping(value = "/getContent", method = RequestMethod.GET)
	    public String getContent(Model model, @RequestParam("post_num") int post_num) throws Exception {
	    	model.addAttribute("boardContent", postService.getBoardPost(post_num));
	    	return "show_content";
	    }
	    
	    @RequestMapping(value = "/updatePost", method = RequestMethod.POST)
	    public String updatePost(@ModelAttribute("postVO") postVO postVO, RedirectAttributes rttr) throws Exception {	    
	    	postService.updateBoard(postVO); 		    	
	    	return "redirect:/show_content";
	    }
	    
	    @RequestMapping(value = "/deletePost", method = RequestMethod.GET)
	    public String deletePost(@RequestParam("post_num") int post_num) throws Exception {	 
	 		postService.deleteBoard(post_num);
	    	return "redirect:/getPostList";
	    }
}
