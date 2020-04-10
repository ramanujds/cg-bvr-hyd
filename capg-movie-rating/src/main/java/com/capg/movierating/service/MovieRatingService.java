package com.capg.movierating.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.movierating.model.MovieRating;
import com.capg.movierating.repository.MovieRatingRepo;

@Service
public class MovieRatingService {
	@Autowired
	MovieRatingRepo repo;
	public MovieRating getMovieRating(long id) {
		return repo.getOne(id);
	}
	public List<MovieRating> getAllMovieRating() {
		return repo.findAll();
	}
	public MovieRating addMovieRating(MovieRating movie) {
		return repo.save(movie);
	}
}
