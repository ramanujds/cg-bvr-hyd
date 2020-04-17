package com.capg.moviecatelog.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;



@Entity

public class MovieCatelog {

	@Id
	private long id;
	private String movieName;
	@Transient
	public int port;
	
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public MovieCatelog() {
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public MovieCatelog(Long id, String movieName) {
		super();
		this.id = id;
		this.movieName = movieName;
	}
	
	
}
