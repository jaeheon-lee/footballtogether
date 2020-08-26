package com.footBallTogether.www.dto;

public class Search {
	private int searchId;
	private int matchInfoId;
	private int teamIdGiver;
	private int teamIdTaker;
	private int teamMemberIdGiver;
	private int teamMemberIdTaker;
	private int searchtStatus;
	
	public Search() {
		super();
	}

	public Search(int searchId, int matchInfoId, int teamIdGiver, int teamIdTaker, int teamMemberIdGiver,
			int teamMemberIdTaker, int searchtStatus) {
		super();
		this.searchId = searchId;
		this.matchInfoId = matchInfoId;
		this.teamIdGiver = teamIdGiver;
		this.teamIdTaker = teamIdTaker;
		this.teamMemberIdGiver = teamMemberIdGiver;
		this.teamMemberIdTaker = teamMemberIdTaker;
		this.searchtStatus = searchtStatus;
	}
	
	

	public Search(int matchInfoId, int teamIdGiver, int teamIdTaker, int teamMemberIdGiver, int teamMemberIdTaker,
			int searchtStatus) {
		super();
		this.matchInfoId = matchInfoId;
		this.teamIdGiver = teamIdGiver;
		this.teamIdTaker = teamIdTaker;
		this.teamMemberIdGiver = teamMemberIdGiver;
		this.teamMemberIdTaker = teamMemberIdTaker;
		this.searchtStatus = searchtStatus;
	}

	public int getSearchId() {
		return searchId;
	}

	public int getMatchInfoId() {
		return matchInfoId;
	}

	public int getTeamIdGiver() {
		return teamIdGiver;
	}

	public int getTeamIdTaker() {
		return teamIdTaker;
	}

	public int getTeamMemberIdGiver() {
		return teamMemberIdGiver;
	}

	public int getTeamMemberIdTaker() {
		return teamMemberIdTaker;
	}

	public int getSearchtStatus() {
		return searchtStatus;
	}

	@Override
	public String toString() {
		return "Search [searchId=" + searchId + ", matchInfoId=" + matchInfoId + ", teamIdGiver=" + teamIdGiver
				+ ", teamIdTaker=" + teamIdTaker + ", teamMemberIdGiver=" + teamMemberIdGiver + ", teamMemberIdTaker="
				+ teamMemberIdTaker + ", searchtStatus=" + searchtStatus + "]";
	}
}
