package com.capg.movieinfo.model;

public class MovieInfo {

	
	private long id;
	private double rating;
	private String movieName;

	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public MovieInfo(long id, double rating, String movieName) {
		super();
		this.id = id;
		this.rating = rating;
		this.movieName = movieName;
	}
	
	
	
}
