package com.footBallTogether.www.dto;

public class Employeement {
	private int employeementId;
	private int match_info_id;
	private int team_id_giver;
	private int team_member_id_giver;
	private int employeement_status;
	private String email;
	
	
	public Employeement() {
		super();
	}

	public Employeement(int employeementId, int match_info_id, int team_id_giver, int team_member_id_giver,
			int employeement_status, String email) {
		super();
		this.employeementId = employeementId;
		this.match_info_id = match_info_id;
		this.team_id_giver = team_id_giver;
		this.team_member_id_giver = team_member_id_giver;
		this.employeement_status = employeement_status;
		this.email = email;
	}

	public int getEmployeementId() {
		return employeementId;
	}

	public void setEmployeementId(int employeementId) {
		this.employeementId = employeementId;
	}

	public int getMatch_info_id() {
		return match_info_id;
	}

	public void setMatch_info_id(int match_info_id) {
		this.match_info_id = match_info_id;
	}

	public int getTeam_id_giver() {
		return team_id_giver;
	}

	public void setTeam_id_giver(int team_id_giver) {
		this.team_id_giver = team_id_giver;
	}

	public int getTeam_member_id_giver() {
		return team_member_id_giver;
	}

	public void setTeam_member_id_giver(int team_member_id_giver) {
		this.team_member_id_giver = team_member_id_giver;
	}

	public int getEmployeement_status() {
		return employeement_status;
	}

	public void setEmployeement_status(int employeement_status) {
		this.employeement_status = employeement_status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employeement [employeementId=" + employeementId + ", match_info_id=" + match_info_id
				+ ", team_id_giver=" + team_id_giver + ", team_member_id_giver=" + team_member_id_giver
				+ ", employeement_status=" + employeement_status + ", email=" + email + "]";
	}	
}
