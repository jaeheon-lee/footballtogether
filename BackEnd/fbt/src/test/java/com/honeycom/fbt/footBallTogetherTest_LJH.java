package com.honeycom.fbt;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.honeycom.fbt.dto.MatchSchedule;
import com.honeycom.fbt.dto.Search;

public class footBallTogetherTest_LJH {

	@Test
	public void unit() throws Exception {
		Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		SqlSession session = factory.openSession();

		/*
		 * // selectUser 1. 로그인 2. id로 user 찾기 User uVo = new User();
		 * uVo.setEmail("ggapdol2@gmail.com"); uVo.setPass("1234"); User List<User> rVo
		 * = session.selectList("sql.footBAllTogether.mapper1.selectUser", uVo);
		 * System.out.println(rVo);
		 */

		/*
		 * //selectEmployments 1. teamIdGiver의 team아이디로 찾기 2.
		 * teamMemberIdGiver의teamemberId로 찾기 3. employmentStatus 찾기 4. email로 찾기 5.
		 * matchInfoId로 찾기 Employment eVo = new Employment();
		 * //eVo.setEmail("ggapdol2@gmail.com"); //eVo.setEmploymentStatus(1);
		 * //eVo.setMatchInfoId(1); //eVo.setTeamIdGiver(1);
		 * //eVo.setTeamMemberIdGiver(1); List<Employment> rVo =
		 * session.selectList("sql.footBAllTogether.mapper1.selectEmployments", eVo);
		 * System.out.println(rVo);
		 */

		/*
		 * //selectTeamMembers 1. teamMemberId아이디로 찾기 2. memberLevel로 찾기 3. regStatus로
		 * 찾기 4. teamId로 찾기 TeamMember tVo = new TeamMember(); tVo.setTeamMemberId(1);
		 * //tVo.setMemberLevel(1); //tVo.setRegStatus(2); //tVo.setTeamId(1);
		 * List<TeamMember> rVo =
		 * session.selectList("sql.footBAllTogether.mapper1.selectTeamMembers", tVo);
		 * System.out.println(rVo);
		 */

		/*
		 * // selectAttendants 1. attendantId 2. matchScheduleId 3. teamMemberId
		 * 4.attendance Attendant aVo = new Attendant(); aVo.setAttendantId(1);
		 * //aVo.setMatchScheduleId(1); //aVo.setTeamMemberId(1);
		 * //aVo.setAttendance(1); List<Attendant> rVo =
		 * session.selectList("sql.footBAllTogether.mapper1.selectAttendants", aVo);
		 * System.out.println(rVo);
		 */

		/*
		 * // selectMatchReviews // 1. attendantId로 찾기 MatchReview mVo = new
		 * MatchReview(); mVo.setAttendantId(1); List<MatchReview> rVo =
		 * session.selectList("sql.footBAllTogether.mapper1.selectMatchReviews", mVo);
		 * System.out.println(rVo);
		 */

		/*
		 * // selectAssignment // // 1. attendantId로 찾기 Assignment asVo = new
		 * Assignment(); //asVo.setAssignmentId(1); //asVo.setTeamIdGiver(1);
		 * //asVo.setTeamMemberIdGiver(1); //asVo.setAssignmentStatus(2);
		 * //asVo.setMatchInfoId(1); List<Assignment> rVo =
		 * session.selectList("sql.footBAllTogether.mapper1.selectAssignment", asVo);
		 * System.out.println(rVo);
		 */

		/*
		 * // selectSearch // // 1. searchId로 찾기 Search sVo = new Search();
		 * //sVo.setSearchId(1); //sVo.setTeamIdGiver(1); //sVo.setTeamMemberIdGiver(1);
		 * //sVo.setSearchStatus(2); //sVo.setMatchInfoId(1); List<Search> rVo =
		 * session.selectList("sql.footBAllTogether.mapper1.selectSearch", sVo);
		 * System.out.println(rVo);
		 */

		// selectMatchSchedule // 
		//1. matchScheduleId 2. teamId 3. matchInfoId
		MatchSchedule msVo = new MatchSchedule();
		//msVo.setMatchScheduleId(1); 
		//msVo.setTeamId(1); 
		msVo.setMatchInfoId(1);
		List<MatchSchedule> rVo =	session.selectList("sql.footBAllTogether.mapper1.selectMatchSchedule", msVo);
		System.out.println(rVo);

	}
}
