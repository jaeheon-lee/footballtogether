package com.footBallTogether.www.dto;

import java.util.List;

public class MatchInfo {
	private int matchInfoId;
	private String schedule;
	private int awayId;
	private String stadium;
	private String stadiumType;

	private List<Vote> votes;
	private List<Assignment> assignments;
	private List<Employment> employeements;
	private List<Search> searchs;
	private MatchSchedule matchSchedule;
	

	public MatchInfo() {
		super();
	}

	public int getMatchInfoId() {
		return matchInfoId;
	}

	public void setMatchInfoId(int matchInfoId) {
		this.matchInfoId = matchInfoId;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public int getAwayId() {
		return awayId;
	}

	public void setAwayId(int awayId) {
		this.awayId = awayId;
	}

	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

	public String getStadiumType() {
		return stadiumType;
	}

	public void setStadiumType(String stadiumType) {
		this.stadiumType = stadiumType;
	}


	public List<Vote> getVotes() {
		return votes;
	}

	public void setVotes(List<Vote> votes) {
		this.votes = votes;
	}

	public List<Assignment> getAssignments() {
		return assignments;
	}

	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}

	public List<Employment> getEmployeements() {
		return employeements;
	}

	public void setEmployeements(List<Employment> employeements) {
		this.employeements = employeements;
	}

	public List<Search> getSearchs() {
		return searchs;
	}

	public void setSearchs(List<Search> searchs) {
		this.searchs = searchs;
	}

	public MatchSchedule getMatchSchedule() {
		return matchSchedule;
	}

	public void setMatchSchedule(MatchSchedule matchSchedule) {
		this.matchSchedule = matchSchedule;
	}

	public MatchInfo(String schedule, int awayId, String stadium, String stadiumType, List<Vote> votes,
			List<Assignment> assignments, List<Employment> employeements, List<Search> searchs,
			MatchSchedule matchSchedule) {
		super();
		this.schedule = schedule;
		this.awayId = awayId;
		this.stadium = stadium;
		this.stadiumType = stadiumType;
		this.votes = votes;
		this.assignments = assignments;
		this.employeements = employeements;
		this.searchs = searchs;
		this.matchSchedule = matchSchedule;
	}

	@Override
	public String toString() {
		return "MatchInfo [matchInfoId=" + matchInfoId + ", schedule=" + schedule + ", awayId=" + awayId + ", stadium="
				+ stadium + ", stadiumType=" + stadiumType + ", votes=" + votes + ", assignments=" + assignments
				+ ", employeements=" + employeements + ", searchs=" + searchs + ", matchSchedule=" + matchSchedule
				+ "]";
	}
}
