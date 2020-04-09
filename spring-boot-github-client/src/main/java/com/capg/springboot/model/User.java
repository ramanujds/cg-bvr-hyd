package com.capg.springboot.model;

public class User {

	private long id;
	private String login;
	private int public_repos;
	private String avatar_url;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}


	public User(long id, String login, int public_repos, String avatar_url) {
		super();
		this.id = id;
		this.login = login;
		this.public_repos = public_repos;
		this.avatar_url = avatar_url;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public int getPublic_repos() {
		return public_repos;
	}


	public void setPublic_repos(int public_repos) {
		this.public_repos = public_repos;
	}


	public String getAvatar_url() {
		return avatar_url;
	}


	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", login=" + login + ", public_repos=" + public_repos + ", avatar_url=" + avatar_url
				+ "]";
	}
	
	
}
