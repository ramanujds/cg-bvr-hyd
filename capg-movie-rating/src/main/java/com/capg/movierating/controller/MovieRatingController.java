package com.capg.movierating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.movierating.model.MovieRating;
import com.capg.movierating.service.MovieRatingService;


@RestController
@RequestMapping("/rating")
public class MovieRatingController {
	
	@Autowired
	MovieRatingService service;
	@GetMapping("/id/{id}")
	public MovieRating getMovieRating(@PathVariable long id) {
		return service.getMovieRating(id);
	}
	
	@GetMapping("/all")
	public List<MovieRating> getAllMovieRating(){
		return service.getAllMovieRating();
	}
	@PostMapping("/add")
	public MovieRating addMovieRating(@RequestBody MovieRating movie) {
		System.out.println(movie);
		return service.addMovieRating(movie);
	}

}
