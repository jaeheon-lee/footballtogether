package com.honeycom.fbt;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.honeycom.fbt.dto.User;

public class footBallTogetherTest_MHK {

	@Test
	public void unit() throws Exception {
		Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		SqlSession session = factory.openSession();

		// 예시
		// selectUser - 1. 로그인 2. id로 user 찾기
//		User vo = new User();
//		vo.setEmail("abc@gmail.com");
//		vo.setPass("1234");
//		User rvo = session.selectOne("sql.footBAllTogether.mapper1.selectUser", vo);
//		System.out.println(rvo);

		// userModify
//		User vo1 = new User();
//		vo1.setEmail("abc1@gmail.com");
//		vo1.setName("이재헌");
//		vo1.setPass("1234");
//		vo1.setMainFoot("Right");
//		vo1.setPhoneNum("1234567890");
//		vo1.setPosition("MF");
//		boolean result = session.update("sql.football.mapper2.user-update", vo1) ==1 ? true : false;
//		session.commit();
//		System.out.println(result);

		// team-create
//		Team team1 = new Team();
//		team1.setTeamName("FC답십리");
//		team1.setEmblem("img/1.jpg");
//		team1.setArea("서울시 동대문구");
//		boolean teamInsert = session.insert("sql.football.mapper2.team-create", team1) == 1 ? true : false;
//		session.commit();
//		System.out.println(teamInsert);

		// team-member-create
//		TeamMember tm1 = new TeamMember(); // 매니저
//		tm1.setMemberLevel(1); // 매니저 팀 창단과 동시에 멤버레벨을 세팅(기본값 노노)
//		tm1.setRegStatus(2); // 매니저는 가입 상태도 변환(일반회원은 필요없음)
//		tm1.setTeamId(2);
//		tm1.setEmail("abc1@gmail.com");
//		boolean tmInsert = session.insert("sql.football.mapper2.team-member-create", tm1) == 1 ? true : false;
//		session.commit();
//		System.out.println(tmInsert);
//		
//		TeamMember tm2 = new TeamMember(); // 일반회원
//		tm2.setTeamId(2);
//		tm2.setEmail("abc@gmail.com");
//		boolean tmInsert2 = session.insert("sql.football.mapper2.team-member-create", tm2) == 1 ? true : false;
//		session.commit();
//		System.out.println(tmInsert2);		

		// team-member-reg-update : 팀 가입 수락
//		boolean tmRegUpdate = session.update("sql.football.mapper2.team-member-reg-update", tm2) == 1 ? true : false;
//		session.commit();
//		System.out.println(tmRegUpdate);

		// team-member-reg-delete : 팀 가입 거절
//		boolean tmDelete = session.delete("sql.football.mapper2.team-member-reg-delete", tm2) == 1 ? true : false;
//		session.commit();
//		System.out.println(tmDelete);

		// team-member-quit-update : 팀 탈퇴
//		boolean tmQuitUpdate = session.update("sql.football.mapper2.team-member-quit-update", tm2) == 1 ? true : false;
//		session.commit();
//		System.out.println(tmQuitUpdate);

		// team-member-vice-manager : 부매니저 임명
//		boolean tmViceUpdate = session.update("sql.football.mapper2.team-member-vice-manager", tm2) == 1 ? true : false;
//		session.commit();
//		System.out.println(tmViceUpdate);

		// user-info-update : 회원정보 수정

		User user1 = new User();
		user1.setEmail("1@gmail.com");
		user1.setPass("1234");
		user1.setName("Moon");
		boolean userInfoUpdate = session.update("sql.football.mapper2.user-info-update", user1) == 1 ? true : false;
		session.commit();
		System.out.println(userInfoUpdate);

		// allUser
		List<User> list = session.selectList("sql.football.mapper2.allUser");
		System.out.println(list);

	}
}
