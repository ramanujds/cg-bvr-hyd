package com.capg.movierating.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.movierating.model.MovieRating;

public interface MovieRatingRepo extends JpaRepository<MovieRating, Long>{

}
