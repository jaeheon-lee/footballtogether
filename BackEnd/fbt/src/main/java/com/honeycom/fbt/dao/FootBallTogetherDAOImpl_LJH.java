package com.honeycom.fbt.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.honeycom.fbt.dto.Employment;
import com.honeycom.fbt.dto.TeamMember;
import com.honeycom.fbt.dto.User;

@Repository
public class FootBallTogetherDAOImpl_LJH implements FootBallTogetherDAO_LJH{
	
	@Autowired
	private SqlSession sqlSession;
	private final String NS = "sql.footBAllTogether.mapper1." ;
	
	@Override
	public User selectUser(User user) {
		return sqlSession.selectOne(NS+"selectUser", user);
	}

	@Override
	public List<Employment> selectEmployments(Employment employment) {
		return sqlSession.selectList(NS+"selectEmployments", employment);
	}

	@Override
	public List<TeamMember> selectTeamMembers(TeamMember teamMember) {
		return sqlSession.selectList(NS+"selectTeamMembers", teamMember);
	}
}
