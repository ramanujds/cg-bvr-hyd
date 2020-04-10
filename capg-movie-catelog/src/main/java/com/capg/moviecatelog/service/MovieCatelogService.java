package com.capg.moviecatelog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.moviecatelog.model.MovieCatelog;
import com.capg.moviecatelog.repo.MovieCatelogRepo;

@Service
public class MovieCatelogService {

	@Autowired
	MovieCatelogRepo repo;
	public MovieCatelog getMovieCatelog(long id) {
		return repo.getOne(id);
	}
	public List<MovieCatelog> getAllMovieCatelog() {
		return repo.findAll();
	}
	public MovieCatelog addMovieCatelog(MovieCatelog movie) {
		return repo.save(movie);
	}
}
