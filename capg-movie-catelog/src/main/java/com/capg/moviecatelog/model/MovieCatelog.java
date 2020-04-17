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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
		result = prime * result + port;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieCatelog other = (MovieCatelog) obj;
		if (id != other.id)
			return false;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		if (port != other.port)
			return false;
		return true;
	}
	
	
	
}
