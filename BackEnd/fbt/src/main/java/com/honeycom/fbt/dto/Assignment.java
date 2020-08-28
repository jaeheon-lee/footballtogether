package com.honeycom.fbt.dto;

public class Assignment {
	private String assignmentId;
	private int teamIdGiver;
	private int teamIdTaker;
	private int teamMemberIdGiver;
	private int teamMemberIdTaker;
	private int assignmentStatus;
	private int matchInfoId;
	
	public Assignment() {
		super();
	}

	public Assignment(String assignmentId, int matchInfoId, int teamIdGiver, int teamIdTaker, int teamMemberIdGiver,
			int teamMemberIdTaker, int assignmentStatus) {
		super();
		this.assignmentId = assignmentId;
		this.matchInfoId = matchInfoId;
		this.teamIdGiver = teamIdGiver;
		this.teamIdTaker = teamIdTaker;
		this.teamMemberIdGiver = teamMemberIdGiver;
		this.teamMemberIdTaker = teamMemberIdTaker;
		this.assignmentStatus = assignmentStatus;
	}

	public Assignment(int matchInfoId, int teamIdGiver, int teamIdTaker, int teamMemberIdGiver, int teamMemberIdTaker,
			int assignmentStatus) {
		super();
		this.matchInfoId = matchInfoId;
		this.teamIdGiver = teamIdGiver;
		this.teamIdTaker = teamIdTaker;
		this.teamMemberIdGiver = teamMemberIdGiver;
		this.teamMemberIdTaker = teamMemberIdTaker;
		this.assignmentStatus = assignmentStatus;
	}

	public String getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(String assignmentId) {
		this.assignmentId = assignmentId;
	}

	public int getMatchInfoId() {
		return matchInfoId;
	}

	public void setMatchInfoId(int matchInfoId) {
		this.matchInfoId = matchInfoId;
	}

	public int getTeamIdGiver() {
		return teamIdGiver;
	}

	public void setTeamIdGiver(int teamIdGiver) {
		this.teamIdGiver = teamIdGiver;
	}

	public int getTeamIdTaker() {
		return teamIdTaker;
	}

	public void setTeamIdTaker(int teamIdTaker) {
		this.teamIdTaker = teamIdTaker;
	}

	public int getTeamMemberIdGiver() {
		return teamMemberIdGiver;
	}

	public void setTeamMemberIdGiver(int teamMemberIdGiver) {
		this.teamMemberIdGiver = teamMemberIdGiver;
	}

	public int getTeamMemberIdTaker() {
		return teamMemberIdTaker;
	}

	public void setTeamMemberIdTaker(int teamMemberIdTaker) {
		this.teamMemberIdTaker = teamMemberIdTaker;
	}

	public int getAssignmentStatus() {
		return assignmentStatus;
	}

	public void setAssignmentStatus(int assignmentStatus) {
		this.assignmentStatus = assignmentStatus;
	}

	@Override
	public String toString() {
		return "Assignment [assignmentId=" + assignmentId + ", matchInfoId=" + matchInfoId + ", teamIdGiver="
				+ teamIdGiver + ", teamIdTaker=" + teamIdTaker + ", teamMemberIdGiver=" + teamMemberIdGiver
				+ ", teamMemberIdTaker=" + teamMemberIdTaker + ", assignmentStatus=" + assignmentStatus + "]";
	}
			
}
