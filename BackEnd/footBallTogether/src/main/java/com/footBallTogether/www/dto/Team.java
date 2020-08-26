package com.footBallTogether.www.dto;

public class Team {
	private int teamId;
	private String teamName;
	private String emblem;
	private String area;
	private String stadiumInfo;
	private String uniformColor;
	private int uniformType;
	private String foundingDate;
	private String teamRegDate;
	private TeamMannerScore teamMannerScore;
	private TeamMember teamMember;
	private Vote vote;
	private MatchSchedule matchSchedule;
	private Assignment assignment;
	private Employment employement;
	private Search search;

	public Team() {
		super();
	}
	public Team(String teamName, String emblem, String area, String stadiumInfo, String uniformColor, int uniformType,
			String foundingDate, String teamRegDate, TeamMannerScore teamMannerScore, TeamMember teamMember, Vote vote,
			MatchSchedule matchSchedule, Assignment assignment, Employment employement, Search search) {
		super();
		this.teamName = teamName;
		this.emblem = emblem;
		this.area = area;
		this.stadiumInfo = stadiumInfo;
		this.uniformColor = uniformColor;
		this.uniformType = uniformType;
		this.foundingDate = foundingDate;
		this.teamRegDate = teamRegDate;
		this.teamMannerScore = teamMannerScore;
		this.teamMember = teamMember;
		this.vote = vote;
		this.matchSchedule = matchSchedule;
		this.assignment = assignment;
		this.employement = employement;
		this.search = search;
	}
	public Team(int teamId, String teamName, String emblem, String area, String stadiumInfo, String uniformColor,
			int uniformType, String foundingDate, String teamRegDate, TeamMannerScore teamMannerScore,
			TeamMember teamMember, Vote vote, MatchSchedule matchSchedule, Assignment assignment,
			Employment employement, Search search) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.emblem = emblem;
		this.area = area;
		this.stadiumInfo = stadiumInfo;
		this.uniformColor = uniformColor;
		this.uniformType = uniformType;
		this.foundingDate = foundingDate;
		this.teamRegDate = teamRegDate;
		this.teamMannerScore = teamMannerScore;
		this.teamMember = teamMember;
		this.vote = vote;
		this.matchSchedule = matchSchedule;
		this.assignment = assignment;
		this.employement = employement;
		this.search = search;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getEmblem() {
		return emblem;
	}
	public void setEmblem(String emblem) {
		this.emblem = emblem;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getStadiumInfo() {
		return stadiumInfo;
	}
	public void setStadiumInfo(String stadiumInfo) {
		this.stadiumInfo = stadiumInfo;
	}
	public String getUniformColor() {
		return uniformColor;
	}
	public void setUniformColor(String uniformColor) {
		this.uniformColor = uniformColor;
	}
	public int getUniformType() {
		return uniformType;
	}
	public void setUniformType(int uniformType) {
		this.uniformType = uniformType;
	}
	public String getFoundingDate() {
		return foundingDate;
	}
	public void setFoundingDate(String foundingDate) {
		this.foundingDate = foundingDate;
	}
	public String getTeamRegDate() {
		return teamRegDate;
	}
	public void setTeamRegDate(String teamRegDate) {
		this.teamRegDate = teamRegDate;
	}
	public TeamMannerScore getTeamMannerScore() {
		return teamMannerScore;
	}
	public void setTeamMannerScore(TeamMannerScore teamMannerScore) {
		this.teamMannerScore = teamMannerScore;
	}
	public TeamMember getTeamMember() {
		return teamMember;
	}
	public void setTeamMember(TeamMember teamMember) {
		this.teamMember = teamMember;
	}
	public Vote getVote() {
		return vote;
	}
	public void setVote(Vote vote) {
		this.vote = vote;
	}
	public MatchSchedule getMatchSchedule() {
		return matchSchedule;
	}
	public void setMatchSchedule(MatchSchedule matchSchedule) {
		this.matchSchedule = matchSchedule;
	}
	public Assignment getAssignment() {
		return assignment;
	}
	public void setAssignment(Assignment assignment) {
		this.assignment = assignment;
	}
	public Employment getEmployement() {
		return employement;
	}
	public void setEmployement(Employment employement) {
		this.employement = employement;
	}
	public Search getSearch() {
		return search;
	}
	public void setSearch(Search search) {
		this.search = search;
	}
	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", emblem=" + emblem + ", area=" + area
				+ ", stadiumInfo=" + stadiumInfo + ", uniformColor=" + uniformColor + ", uniformType=" + uniformType
				+ ", foundingDate=" + foundingDate + ", teamRegDate=" + teamRegDate + ", teamMannerScore="
				+ teamMannerScore + ", vote=" + vote + "]";
	}
}
