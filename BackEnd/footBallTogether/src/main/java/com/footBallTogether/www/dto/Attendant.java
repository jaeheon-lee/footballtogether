package com.footBallTogether.www.dto;

public class Attendant {
	private int matchScheduleId;
	private int teamMemberId;
	private int matchReviewId;
	private int attendance;
	private MatchReview matchReview;
	
	public Attendant() {}

	public Attendant(int matchScheduleId, int teamMemberId, int matchReviewId, int attendance,
			MatchReview matchReview) {
		super();
		this.matchScheduleId = matchScheduleId;
		this.teamMemberId = teamMemberId;
		this.matchReviewId = matchReviewId;
		this.attendance = attendance;
		this.matchReview = matchReview;
	}

	public int getMatchScheduleId() {
		return matchScheduleId;
	}

	public void setMatchScheduleId(int matchScheduleId) {
		this.matchScheduleId = matchScheduleId;
	}

	public int getTeamMemberId() {
		return teamMemberId;
	}

	public void setTeamMemberId(int teamMemberId) {
		this.teamMemberId = teamMemberId;
	}

	public int getMatchReviewId() {
		return matchReviewId;
	}

	public void setMatchReviewId(int matchReviewId) {
		this.matchReviewId = matchReviewId;
	}

	public int getAttendance() {
		return attendance;
	}

	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}

	public MatchReview getMatchReview() {
		return matchReview;
	}

	public void setMatchReview(MatchReview matchReview) {
		this.matchReview = matchReview;
	}

	@Override
	public String toString() {
		return "Attendant [matchScheduleId=" + matchScheduleId + ", teamMemberId=" + teamMemberId + ", matchReviewId="
				+ matchReviewId + ", attendance=" + attendance + ", matchReview=" + matchReview + "]";
	}
}
