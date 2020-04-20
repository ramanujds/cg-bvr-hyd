package com.capg.movieinfo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capg.movieinfo.model.CatelogList;
import com.capg.movieinfo.model.MovieCatelog;
import com.capg.movieinfo.model.MovieInfo;
import com.capg.movieinfo.model.MovieRating;
import com.capg.movieinfo.model.RatingList;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/info")
@CrossOrigin(origins = "http://localhost:4200")
public class MovieInfoController {

	@Autowired
	RestTemplate rt;
	@GetMapping("/id/{id}")
	//@HystrixCommand(fallbackMethod = "getMovieInfoFallback")
	public MovieInfo getMovieInfo(@PathVariable long id) {
		
		MovieCatelog catelog=rt.getForObject("http://movie-catelog-service/catelog/id/"+id, MovieCatelog.class);
		MovieRating rating=rt.getForObject("http://movie-rating-service/rating/id/"+id, MovieRating.class);
		
		
		MovieInfo movie=new MovieInfo(id,rating.getRating(),catelog.getMovieName());
		movie.setCatelogServicePort(catelog.getPort());
		movie.setRatingServicePort(rating.getPort());
		return movie;
	}
	
	@PostMapping("/add")
	public MovieInfo addMovie(@RequestBody MovieInfo movie) {
		MovieCatelog catelog=new MovieCatelog(movie.getId(),movie.getMovieName());
		MovieRating rating=new MovieRating(movie.getId(),movie.getRating());
		rt.postForObject("http://movie-catelog-service/catelog/add", catelog,MovieCatelog.class);
		rt.postForObject("http://movie-rating-service/rating/add", rating, MovieRating.class);
		return movie;
		
	}
	
	@GetMapping("/all")
	public List<MovieInfo> getAllMovies(){
		CatelogList catelogList=rt.getForObject("http://movie-catelog-service/catelog/all", CatelogList.class);
		RatingList ratingList=rt.getForObject("http://movie-rating-service/rating/all", RatingList.class);
		
		List<MovieInfo>movies=new ArrayList<MovieInfo>();
		int total=catelogList.getListOfMovie().size();
		
		
		for(int n=0;n<total;n++) {
			
			MovieCatelog catelog=catelogList.getListOfMovie().get(n);
			MovieRating rating=ratingList.getMovieRatingList().get(n);
			MovieInfo movieInfo=new MovieInfo(
					catelog.getId(),rating.getRating(),catelog.getMovieName()
					);
			movies.add(movieInfo);
			
		}
		return movies;
		
	
	}
	
	
	public MovieInfo getMovieInfoFallback(@PathVariable long id){
		MovieInfo movie=new MovieInfo(id, 4.5, "KGF 2");
		return movie;
		
	}
	
}
