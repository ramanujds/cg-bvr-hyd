package com.capg.movieinfo.model;

import java.util.List;

public class RatingList {
	private List<MovieRating> movieRatingList;
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
