package com.footBallTogether.www.dto;

public class MatchSchedule {
	private int matchScheduleId;
	private int teamId;
	private int matchInfoId;
	private Attendant attendant;
	
	public MatchSchedule() {}

	public MatchSchedule(int teamId, int matchInfoId, Attendant attendant) {
		super();
		this.teamId = teamId;
		this.matchInfoId = matchInfoId;
		this.attendant = attendant;
	}

	public MatchSchedule(int matchScheduleId, int teamId, int matchInfoId, Attendant attendant) {
		super();
		this.matchScheduleId = matchScheduleId;
		this.teamId = teamId;
		this.matchInfoId = matchInfoId;
		this.attendant = attendant;
	}

	public int getMatchScheduleId() {
		return matchScheduleId;
	}

	public void setMatchScheduleId(int matchScheduleId) {
		this.matchScheduleId = matchScheduleId;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public int getMatchInfoId() {
		return matchInfoId;
	}

	public void setMatchInfoId(int matchInfoId) {
		this.matchInfoId = matchInfoId;
	}

	public Attendant getAttendant() {
		return attendant;
	}

	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}

	@Override
	public String toString() {
		return "MatchSchedule [matchScheduleId=" + matchScheduleId + ", teamId=" + teamId + ", matchInfoId="
				+ matchInfoId + "]";
	}
}
