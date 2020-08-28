package com.honeycom.fbt.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
}
