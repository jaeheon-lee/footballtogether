package com.honeycom.fbt.dto;

import java.util.List;

public class MatchSchedule {
	private int matchScheduleId;
	private int teamId;
	private int matchInfoId;
	private List<Attendant> attendants;
	
	public MatchSchedule() {}

	public MatchSchedule(int matchScheduleId, int teamId, int matchInfoId, List<Attendant> attendants) {
		super();
		this.matchScheduleId = matchScheduleId;
		this.teamId = teamId;
		this.matchInfoId = matchInfoId;
		this.attendants = attendants;
	}

	public MatchSchedule(int matchScheduleId) {
		super();
		this.matchScheduleId = matchScheduleId;
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

	public List<Attendant> getAttendants() {
		return attendants;
	}

	public void setAttendants(List<Attendant> attendants) {
		this.attendants = attendants;
	}

	@Override
	public String toString() {
		return "MatchSchedule [matchScheduleId=" + matchScheduleId + ", teamId=" + teamId + ", matchInfoId="
				+ matchInfoId + ", attendants=" + attendants + "]";
	}
}
