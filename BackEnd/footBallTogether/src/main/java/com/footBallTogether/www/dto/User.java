package com.footBallTogether.www.dto;

public class User {
	private String email;
	private String pass;
	private String name;
	private String phone_num;
	private String user_reg_date;
	private String recent_login;
	private String main_foot;
	private String position;
	private int teamMember;
	
	public User() {
		super();
	}

	public User(String email, String pass, String name, String phone_num, String user_reg_date, String recent_login,
			String main_foot, String position) {
		super();
		this.email = email;
		this.pass = pass;
		this.name = name;
		this.phone_num = phone_num;
		this.user_reg_date = user_reg_date;
		this.recent_login = recent_login;
		this.main_foot = main_foot;
		this.position = position;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}

	public String getUser_reg_date() {
		return user_reg_date;
	}

	public void setUser_reg_date(String user_reg_date) {
		this.user_reg_date = user_reg_date;
	}

	public String getRecent_login() {
		return recent_login;
	}

	public void setRecent_login(String recent_login) {
		this.recent_login = recent_login;
	}

	public String getMain_foot() {
		return main_foot;
	}

	public void setMain_foot(String main_foot) {
		this.main_foot = main_foot;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", pass=" + pass + ", name=" + name + ", phone_num=" + phone_num
				+ ", user_reg_date=" + user_reg_date + ", recent_login=" + recent_login + ", main_foot=" + main_foot
				+ ", position=" + position + "]";
	}
	
} 
