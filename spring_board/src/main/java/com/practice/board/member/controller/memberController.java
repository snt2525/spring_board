package com.practice.board.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.practice.board.member.memberVO;
import com.practice.board.member.service.memberService;

@Controller
public class memberController {
	@Autowired
	memberService memS;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() throws Exception {		
	     return "login";
	}	
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String joinMember() throws Exception {		
	     return "join";
	}
	
	@RequestMapping(value = "/join/post_info", method = RequestMethod.POST)
	public String joinMemberInfo(@ModelAttribute("memberVO") memberVO memberVO, 
			RedirectAttributes rttr) throws Exception {		
		memS.join_member(memberVO);
	     return "redirect:/login";
	}	
	
	@RequestMapping(value = "/login/check_same_id", method = RequestMethod.GET)
	public String checkSameID(@ModelAttribute("memberVO") memberVO memberVO) throws Exception {		
		memS.join_member(memberVO);
	     return "redirect:/login";
	}	

	@RequestMapping(value = "/login/member_info", method = RequestMethod.POST)
	public String getMemberData(Model model, @ModelAttribute("memberVO") memberVO memberVO, 
			RedirectAttributes rttr) throws Exception {
	     if(memS.login(memberVO))
	     {
	    	 return "redirect:/getPostList";
	     }
	     else 
	     {
	    	 return "login";
	     }
	}	
	
	
	
}
