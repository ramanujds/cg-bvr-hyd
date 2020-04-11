package com.capg.movierating.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
public class MovieRating {
	@Id
	private Long id;
	private double rating;
	@Transient
	private int port;
	
	
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public MovieRating() {
		// TODO Auto-generated constructor stub
	}
	public MovieRating(Long id, double rating) {
		super();
		this.id = id;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "MovieRating [id=" + id + ", rating=" + rating + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
}
