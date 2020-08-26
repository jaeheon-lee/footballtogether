package com.footBallTogether.www.dto;

import java.util.List;

public class Vote {
	private int voteId;
	private String contents;
	private String dueDate;
	private String voteRegDate;
	private String writer;
	private int voteStatus;
	private int teamId;
	private int matchInfo;
	
	private List<VoteResult> voteResults;
	
	public Vote() {}
	

	public Vote(String contents, String dueDate, String voteRegDate, String writer, int voteStatus, int teamId,
			int matchInfo, List<VoteResult> voteResults) {
		super();
		this.contents = contents;
		this.dueDate = dueDate;
		this.voteRegDate = voteRegDate;
		this.writer = writer;
		this.voteStatus = voteStatus;
		this.teamId = teamId;
		this.matchInfo = matchInfo;
		this.voteResults = voteResults;
	}


	public Vote(int voteId, String contents, String dueDate, String voteRegDate, String writer, int voteStatus,
			int teamId, int matchInfo, List<VoteResult> voteResults) {
		super();
		this.voteId = voteId;
		this.contents = contents;
		this.dueDate = dueDate;
		this.voteRegDate = voteRegDate;
		this.writer = writer;
		this.voteStatus = voteStatus;
		this.teamId = teamId;
		this.matchInfo = matchInfo;
		this.voteResults = voteResults;
	}


	public int getVoteId() {
		return voteId;
	}


	public void setVoteId(int voteId) {
		this.voteId = voteId;
	}


	public String getContents() {
		return contents;
	}


	public void setContents(String contents) {
		this.contents = contents;
	}


	public String getDueDate() {
		return dueDate;
	}


	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}


	public String getVoteRegDate() {
		return voteRegDate;
	}


	public void setVoteRegDate(String voteRegDate) {
		this.voteRegDate = voteRegDate;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public int getVoteStatus() {
		return voteStatus;
	}


	public void setVoteStatus(int voteStatus) {
		this.voteStatus = voteStatus;
	}


	public int getTeamId() {
		return teamId;
	}


	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}


	public int getMatchInfo() {
		return matchInfo;
	}


	public void setMatchInfo(int matchInfo) {
		this.matchInfo = matchInfo;
	}


	public List<VoteResult> getVoteResults() {
		return voteResults;
	}


	public void setVoteResults(List<VoteResult> voteResults) {
		this.voteResults = voteResults;
	}


	@Override
	public String toString() {
		return "Vote [voteId=" + voteId + ", contents=" + contents + ", dueDate=" + dueDate + ", voteRegDate="
				+ voteRegDate + ", writer=" + writer + ", voteStatus=" + voteStatus + ", teamId=" + teamId
				+ ", matchInfo=" + matchInfo + ", voteResults=" + voteResults + "]";
	}
	
	
	
}
