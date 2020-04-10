package com.capg.moviecatelog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.moviecatelog.model.MovieCatelog;
import com.capg.moviecatelog.service.MovieCatelogService;

@RestController
@RequestMapping("/catelog")
public class MovieCatelogController {

	@Autowired
	MovieCatelogService service;
	@GetMapping("/id/{id}")
	public MovieCatelog getMovieCatelog(@PathVariable long id) {
		return service.getMovieCatelog(id);
	}
	
	@GetMapping("/all")
	public List<MovieCatelog> getAllMovieCatelog(){
		return service.getAllMovieCatelog();
	}
	@PostMapping("/add")
	public MovieCatelog addMovieCatelog(MovieCatelog movie) {
		return service.addMovieCatelog(movie);
	}
	
}
