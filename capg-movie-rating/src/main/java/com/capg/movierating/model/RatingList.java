package com.capg.movierating.model;

import java.util.List;

public class RatingList {
	private List<MovieRating> movieRatingList;
	private int port;
	
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public RatingList() {
		// TODO Auto-generated constructor stub
	}
	public List<MovieRating> getMovieRatingList() {
		return movieRatingList;
	}
	public void setMovieRatingList(List<MovieRating> movieRatingList) {
		this.movieRatingList = movieRatingList;
	}
	public RatingList(List<MovieRating> movieRatingList) {
		super();
		this.movieRatingList = movieRatingList;
	}
	
	
}
