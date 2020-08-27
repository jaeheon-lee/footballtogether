package com.footBallTogether.www;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.footBallTogether.www.dto.User;

public class footBallTogetherTest_MHK {

	@Test
	public void unit() throws Exception {
		Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		SqlSession session = factory.openSession();

		//예시
		// selectUser - 1. 로그인 2. id로 user 찾기
		User vo = new User();
		vo.setEmail("ggapdol2@gmail.com");
		vo.setPass("1234");
		User rvo = session.selectOne("sql.footBAllTogether.mapper1.selectUser", vo);
		System.out.println(rvo);
	}
}
