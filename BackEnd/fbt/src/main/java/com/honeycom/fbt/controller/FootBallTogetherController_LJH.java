package com.honeycom.fbt.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.honeycom.fbt.dto.Employment;
import com.honeycom.fbt.dto.TeamMember;
import com.honeycom.fbt.dto.User;
import com.honeycom.fbt.service.FootBallTogetherService_LJH;

@RestController
//@RequestMapping("footBallTogether")
//@Controller
public class FootBallTogetherController_LJH {

	@Autowired
	private FootBallTogetherService_LJH footBallTogetherService_LJH;

	@GetMapping("user")
	public ResponseEntity<User> login(@RequestBody User user, HttpSession session) throws Exception {
		
		//user
		User rUser = footBallTogetherService_LJH.selectUser(user);
		
		//teamMember
		TeamMember teamMember = new TeamMember();
		teamMember.setEmail(user.getEmail());
		List<TeamMember> teamMembers = footBallTogetherService_LJH.selectTeamMembers(teamMember);
		rUser.setTeamMembers(teamMembers);
		
		//employment
		Employment employment = new Employment();
		employment.setEmail(user.getEmail());
		List<Employment> employments = footBallTogetherService_LJH.selectEmployments(employment);
		rUser.setEmployments(employments);
		
		if (rUser == null)
			return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
		else {
			session.setAttribute("rUser", rUser);
			return new ResponseEntity<User>(rUser, HttpStatus.OK);
		}
			
	}

	/*
	 * @GetMapping("login.do") public String login(User user) { User rUser =
	 * footBallTogetherService_LJH.selectUser(user); System.out.println(rUser);
	 * return "login"; }
	 */
}
