package com.footBallTogether.www.dto;

public class TeamMember {
	private int teamMemberId;
	private String memberRegDate;
	private int memberLevel;
	private int participationCount;
	private int regStatus;
	private int team_id;
	private String email;
	
	
	public TeamMember() {
		super();
	}


	public TeamMember(int teamMemberId, String memberRegDate, int memberLevel, int participationCount, int regStatus,
			int team_id, String email) {
		super();
		this.teamMemberId = teamMemberId;
		this.memberRegDate = memberRegDate;
		this.memberLevel = memberLevel;
		this.participationCount = participationCount;
		this.regStatus = regStatus;
		this.team_id = team_id;
		this.email = email;
	}


	public int getTeamMemberId() {
		return teamMemberId;
	}


	public void setTeamMemberId(int teamMemberId) {
		this.teamMemberId = teamMemberId;
	}


	public String getMemberRegDate() {
		return memberRegDate;
	}


	public void setMemberRegDate(String memberRegDate) {
		this.memberRegDate = memberRegDate;
	}


	public int getMemberLevel() {
		return memberLevel;
	}


	public void setMemberLevel(int memberLevel) {
		this.memberLevel = memberLevel;
	}


	public int getParticipationCount() {
		return participationCount;
	}


	public void setParticipationCount(int participationCount) {
		this.participationCount = participationCount;
	}


	public int getRegStatus() {
		return regStatus;
	}


	public void setRegStatus(int regStatus) {
		this.regStatus = regStatus;
	}


	public int getTeam_id() {
		return team_id;
	}


	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "TeamMember [teamMemberId=" + teamMemberId + ", memberRegDate=" + memberRegDate + ", memberLevel="
				+ memberLevel + ", participationCount=" + participationCount + ", regStatus=" + regStatus + ", team_id="
				+ team_id + ", email=" + email + "]";
	}
}
