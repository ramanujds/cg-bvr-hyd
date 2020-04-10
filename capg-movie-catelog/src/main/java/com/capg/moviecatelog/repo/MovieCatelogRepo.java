package com.capg.moviecatelog.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.moviecatelog.model.MovieCatelog;

public interface MovieCatelogRepo extends JpaRepository<MovieCatelog, Long> {

}
