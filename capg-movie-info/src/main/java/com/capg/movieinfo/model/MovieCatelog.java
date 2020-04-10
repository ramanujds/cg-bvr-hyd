package com.capg.movieinfo.model;


public class MovieCatelog {

	
	private long id;
	private String movieName;
	public MovieCatelog() {
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public MovieCatelog(Long id, String movieName) {
		super();
		this.id = id;
		this.movieName = movieName;
	}
	
	
}
