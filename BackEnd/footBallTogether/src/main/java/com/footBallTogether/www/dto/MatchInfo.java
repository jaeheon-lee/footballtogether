package com.footBallTogether.www.dto;

public class MatchInfo {
	private int matchInfoId;
	private String schedule;
	private int away_id;
	private String stadium;
	private String stadium_type;

	private Vote vote;
	private Assignment assignment;
	private Employeement employeement;
	private Search search;
	private matchSchedule matchSchedule;
	
	
	public MatchInfo() {
		super();
	}

	public MatchInfo(String schedule, int away_id, String stadium, String stadium_type, Vote vote,
			Assignment assignment, Employeement employeement, Search search,
			com.footBallTogether.www.dto.matchSchedule matchSchedule) {
		super();
		this.schedule = schedule;
		this.away_id = away_id;
		this.stadium = stadium;
		this.stadium_type = stadium_type;
		this.vote = vote;
		this.assignment = assignment;
		this.employeement = employeement;
		this.search = search;
		this.matchSchedule = matchSchedule;
	}

	public MatchInfo(int matchInfoId, String schedule, int away_id, String stadium, String stadium_type, Vote vote,
			Assignment assignment, Employeement employeement, Search search,
			com.footBallTogether.www.dto.matchSchedule matchSchedule) {
		super();
		this.matchInfoId = matchInfoId;
		this.schedule = schedule;
		this.away_id = away_id;
		this.stadium = stadium;
		this.stadium_type = stadium_type;
		this.vote = vote;
		this.assignment = assignment;
		this.employeement = employeement;
		this.search = search;
		this.matchSchedule = matchSchedule;
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

	public int getAway_id() {
		return away_id;
	}

	public void setAway_id(int away_id) {
		this.away_id = away_id;
	}

	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

	public String getStadium_type() {
		return stadium_type;
	}

	public void setStadium_type(String stadium_type) {
		this.stadium_type = stadium_type;
	}

	@Override
	public String toString() {
		return "MatchInfo [matchInfoId=" + matchInfoId + ", schedule=" + schedule + ", away_id=" + away_id
				+ ", stadium=" + stadium + ", stadium_type=" + stadium_type + "]";
	}	
	
}
