package com.honeycom.fbt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.honeycom.fbt.dao.FootBallTogetherDAO_LJH;
import com.honeycom.fbt.dto.Employment;
import com.honeycom.fbt.dto.TeamMember;
import com.honeycom.fbt.dto.User;

@Service
public class FootBallTogetherServiceImpl_LJH implements FootBallTogetherService_LJH{

	@Autowired
	private FootBallTogetherDAO_LJH footBallTogetherDAO_LJH; 
	
	@Override
	public User selectUser(User user) {
		return footBallTogetherDAO_LJH.selectUser(user);
	}

	@Override
	public List<Employment> selectEmployments(Employment employment) {
		return footBallTogetherDAO_LJH.selectEmployments(employment);
	}

	@Override
	public List<TeamMember> selectTeamMembers(TeamMember teamMember) {
		return footBallTogetherDAO_LJH.selectTeamMembers(teamMember);
	}

}
