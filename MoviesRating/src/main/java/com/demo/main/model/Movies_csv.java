package com.demo.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Movies_csv {

	//@GeneratedValue(strategy = GenerationType.AUTO)

	//@Column(unique = true)
	@Id
	private String tconst;
	private String titleType;
	private String primaryTitle;
	private int runtimeMinutes;
	private String genres;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Ratings_csv rating;

	public String getTconst() {
		return tconst;
	}

	public void setTconst(String tconst) {
		this.tconst = tconst;
	}

	public String getTitleType() {
		return titleType;
	}

	public void setTitleType(String titleType) {
		this.titleType = titleType;
	}

	public String getPrimaryTitle() {
		return primaryTitle;
	}

	public void setPrimaryTitle(String primaryTitle) {
		this.primaryTitle = primaryTitle;
	}

	public int getRuntimeMinutes() {
		return runtimeMinutes;
	}

	public void setRuntimeMinutes(int runtimeMinutes) {
		this.runtimeMinutes = runtimeMinutes;
	}

	

	public String getGenres() {
		return genres;
	}

	public void setGenres(String genres) {
		this.genres = genres;
	}

	public Ratings_csv getRating() {
		return rating;
	}

	public void setRating(Ratings_csv rating) {
		this.rating = rating;
	}
	
	
	@Override
	public String toString() {
		return "Movies_csv [tconst=" + tconst + ", titleType=" + titleType + ", primaryTitle=" + primaryTitle
				+ ", runtimeMinutes=" + runtimeMinutes + ", genres=" + genres + ", rating=" + rating + "]";
	}
	
	
	
}
	
	
	
