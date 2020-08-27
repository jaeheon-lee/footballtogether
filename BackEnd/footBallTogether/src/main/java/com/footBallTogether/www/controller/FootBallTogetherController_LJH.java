package com.footBallTogether.www.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.footBallTogether.www.dto.User;
import com.footBallTogether.www.service.FootBallTogetherService_LJH;

@Controller
public class FootBallTogetherController_LJH {
	
	@Autowired
	private FootBallTogetherService_LJH footBallTogetherService_LJH;
	
	
	@GetMapping("login.do")
	public String login(User user) {
		User rUser = footBallTogetherService_LJH.selectUser(user);
		System.out.println(rUser);
		return "login";
	}
	/*
	 * @GetMapping("user") public User login(){//@RequestBody User user
	 * System.out.println("실행1");
	 * 
	 * return null; }
	 */
}
