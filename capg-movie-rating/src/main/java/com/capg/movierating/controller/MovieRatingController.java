package com.capg.movierating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.movierating.model.MovieRating;
import com.capg.movierating.model.RatingList;
import com.capg.movierating.service.MovieRatingService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@RestController
@RequestMapping("/rating")
public class MovieRatingController {
	
	@Autowired
	MovieRatingService service;
	@Autowired
	Environment env;
	
	@GetMapping("/id/{id}")
	@HystrixCommand(fallbackMethod = "getMovieRatingFallback")
	public MovieRating getMovieRating(@PathVariable long id) {
		int x=5/0;
		MovieRating movie= service.getMovieRating(id);
		int port=Integer.parseInt(env.getProperty("local.server.port"));
		movie.setPort(port);
		return movie;
	}
	
	@GetMapping("/all")
	public RatingList getAllMovieRating(){
		int port=Integer.parseInt(env.getProperty("local.server.port"));
		RatingList ratingList=new RatingList(service.getAllMovieRating());
		ratingList.setPort(port);
		return ratingList;
		
	}
	@PostMapping("/add")
	public MovieRating addMovieRating(@RequestBody MovieRating movie) {
		
		return service.addMovieRating(movie);
	}
	
	
	public MovieRating getMovieRatingFallback(@PathVariable long id) {
		return new MovieRating(id, 4.8);
	}

}
