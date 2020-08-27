package com.footBallTogether.www.dto;

public class Search {
	private int searchId;
	private int teamIdGiver;
	private int teamIdTaker;
	private int teamMemberIdGiver;
	private int teamMemberIdTaker;
	private int searchStatus;
	private int matchInfoId;
	public Search() {
		super();
	}

	public Search(int searchId, int matchInfoId, int teamIdGiver, int teamIdTaker, int teamMemberIdGiver,
			int teamMemberIdTaker, int searchStatus) {
		super();
		this.searchId = searchId;
		this.matchInfoId = matchInfoId;
		this.teamIdGiver = teamIdGiver;
		this.teamIdTaker = teamIdTaker;
		this.teamMemberIdGiver = teamMemberIdGiver;
		this.teamMemberIdTaker = teamMemberIdTaker;
		this.searchStatus = searchStatus;
	}
	
	

	public Search(int matchInfoId, int teamIdGiver, int teamIdTaker, int teamMemberIdGiver, int teamMemberIdTaker,
			int searchStatus) {
		super();
		this.matchInfoId = matchInfoId;
		this.teamIdGiver = teamIdGiver;
		this.teamIdTaker = teamIdTaker;
		this.teamMemberIdGiver = teamMemberIdGiver;
		this.teamMemberIdTaker = teamMemberIdTaker;
		this.searchStatus = searchStatus;
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

	public int getsearchStatus() {
		return searchStatus;
	}

	@Override
	public String toString() {
		return "Search [searchId=" + searchId + ", matchInfoId=" + matchInfoId + ", teamIdGiver=" + teamIdGiver
				+ ", teamIdTaker=" + teamIdTaker + ", teamMemberIdGiver=" + teamMemberIdGiver + ", teamMemberIdTaker="
				+ teamMemberIdTaker + ", searchStatus=" + searchStatus + "]";
	}
}
