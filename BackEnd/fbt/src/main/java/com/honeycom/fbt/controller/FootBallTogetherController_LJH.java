package com.honeycom.fbt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.honeycom.fbt.dto.User;
import com.honeycom.fbt.service.FootBallTogetherService_LJH;

@RestController
//@RequestMapping("footBallTogether")
//@Controller
public class FootBallTogetherController_LJH {

	@Autowired
	private FootBallTogetherService_LJH footBallTogetherService_LJH;

	@GetMapping("user")
	public ResponseEntity<User> login() throws Exception {
		System.out.println("실행1");
		User user = new User();
		user.setEmail("ggapdol2@gmail.com");
		user.setPass("1234");
		User rUser = footBallTogetherService_LJH.selectUser(user);
		if (rUser == null)
			return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
		else
			return new ResponseEntity<User>(rUser, HttpStatus.OK);
	}

	/*
	 * @GetMapping("login.do") public String login(User user) { User rUser =
	 * footBallTogetherService_LJH.selectUser(user); System.out.println(rUser);
	 * return "login"; }
	 */
}
