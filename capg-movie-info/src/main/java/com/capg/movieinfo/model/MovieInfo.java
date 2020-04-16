package com.capg.movieinfo.model;

public class MovieInfo {

	
	private long id;
	private double rating;
	private String movieName;
     private int ratingServicePort;
     private int catelogServicePort;
     

	public MovieInfo() {
		// TODO Auto-generated constructor stub
	}
	

	public int getRatingServicePort() {
		return ratingServicePort;
	}
	public void setRatingServicePort(int ratingServicePort) {
		this.ratingServicePort = ratingServicePort;
	}
	public int getCatelogServicePort() {
		return catelogServicePort;
	}
	public void setCatelogServicePort(int catelogServicePort) {
		this.catelogServicePort = catelogServicePort;
	}
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
