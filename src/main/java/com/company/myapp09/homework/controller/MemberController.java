package com.company.myapp09.homework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.company.myapp09.homework.service.MemberService;
import com.company.myapp09.homework.vo.Member;


@Controller
@RequestMapping("/")
@SessionAttributes("msg")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@GetMapping
	public String signUp(@RequestParam(value = "msg", required = false) String msg, Model m) {
		System.out.println("msg : " + msg);
		m.addAttribute("msg", msg);
		return "index";
	}
	@PostMapping("/signUp")
	public String signUp(RedirectAttributes redirectAttributes, Member member) {
		System.out.println("member ctrl: "+ member);
		int result = 0;
		try {
			result = memberService.insertMember(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (result == 1) {
			redirectAttributes.addAttribute("msg", "회원가입 성공");
			
		} else if (result == 0) {
			redirectAttributes.addAttribute("msg", "회원가입 실패");
			
		} else {
			redirectAttributes.addAttribute("msg", "회원가입 오류 발생");
			
		}
		return "redirect:/";
	}
	
}
