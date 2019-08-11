package com.practice.board.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
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
	
	@RequestMapping(value = "/check_same_id", method = RequestMethod.GET)
	public  String checkSameID(@RequestParam("check_id") String check_id, Model model) throws Exception {	
		System.out.print("asdasdasdasdasasdasdasd");
		if(memS.check_same_id(check_id)) {
			model.addAttribute("msg", "중복된 아이디 입니다.");
			model.addAttribute("check", "0");
		}else {	
			model.addAttribute("msg", "생성 가능한 아이디 입니다.");
			model.addAttribute("check", "1");
		}
		
	    return "redirect:/login";
	}	

	@RequestMapping(value = "/login/member_info", method = RequestMethod.POST)
	public String getMemberData(Model model, @ModelAttribute("memberVO") memberVO memberVO, 
			RedirectAttributes rttr, HttpSession session) throws Exception {
	     if(memS.login(memberVO))
	     {	    	 
	    	 session.setAttribute("loginId", memberVO.id);
	    	 return "redirect:/getPostList";
	     }

    	 return "redirect:/login";	     
	}	
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model, HttpSession session) {
		session.invalidate();		
		return "login";
	}
}
