package com.honeycom.fbt.dao;

import java.util.List;

import com.honeycom.fbt.dto.Employment;
import com.honeycom.fbt.dto.TeamMember;
import com.honeycom.fbt.dto.User;

public interface FootBallTogetherDAO_LJH {
	public User selectUser(User user);

	public List<Employment> selectEmployments(Employment employment);
	public List<TeamMember> selectTeamMembers(TeamMember teamMember);
}
