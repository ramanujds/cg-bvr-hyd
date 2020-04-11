package com.capg.moviecatelog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.moviecatelog.model.MovieCatelog;
import com.capg.moviecatelog.service.MovieCatelogService;

@RestController
@RequestMapping("/catelog")
public class MovieCatelogController {

	@Autowired
	MovieCatelogService service;
	@Autowired
	Environment env;
	
	@GetMapping("/id/{id}")
	public MovieCatelog getMovieCatelog(@PathVariable long id) {
		MovieCatelog movie= service.getMovieCatelog(id);
		int port=Integer.parseInt(env.getProperty("local.server.port"));
		movie.setPort(port);
		return movie;
	}
	
	@GetMapping("/all")
	public List<MovieCatelog> getAllMovieCatelog(){
		return service.getAllMovieCatelog();
	}
	@PostMapping("/add")
	public MovieCatelog addMovieCatelog(@RequestBody MovieCatelog movie) {
		return service.addMovieCatelog(movie);
	}
	
}
