package com.footBallTogether.www.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.footBallTogether.www.dao.FootBallTogetherDAO_LJH;
import com.footBallTogether.www.dto.User;

@Service
public class FootBallTogetherServiceImpl_MHK implements FootBallTogetherService_MHK{

	@Autowired
	private FootBallTogetherDAO_LJH footBallTogetherDAO_LJH; 
	
	@Override
	public User selectUser(User user) {
		return footBallTogetherDAO_LJH.selectUser(user);
	}
	

}
