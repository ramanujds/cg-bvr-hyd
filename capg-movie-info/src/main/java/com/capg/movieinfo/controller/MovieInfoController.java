package com.capg.movieinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capg.movieinfo.model.MovieCatelog;
import com.capg.movieinfo.model.MovieInfo;
import com.capg.movieinfo.model.MovieRating;

@RestController
@RequestMapping("/info")
public class MovieInfoController {

	@Autowired
	RestTemplate rt;
	@GetMapping("/id/{id}")
	public MovieInfo getMovieInfo(@PathVariable long id) {
		
		MovieCatelog catelog=rt.getForObject("http://movie-catelog-service/catelog/id/"+id, MovieCatelog.class);
		MovieRating rating=rt.getForObject("http://movie-rating-service/rating/id/"+id, MovieRating.class);
		
		
		MovieInfo movie=new MovieInfo(id,rating.getRating(),catelog.getMovieName());
		movie.setCatelogServicePort(catelog.getPort());
		movie.setRatingServicePort(rating.getPort());
		return movie;
	}
	
}
