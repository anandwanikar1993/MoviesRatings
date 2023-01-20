package com.demo.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ratings_csv {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private double avaerageRating;
	private long numVotes;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAvaerageRating() {
		return avaerageRating;
	}
	public void setAvaerageRating(double avaerageRating) {
		this.avaerageRating = avaerageRating;
	}
	public long getNumVotes() {
		return numVotes;
	}
	public void setNumVotes(long numVotes) {
		this.numVotes = numVotes;
	}
	@Override
	public String toString() {
		return "ratings_csv [id=" + id + ", avaerageRating=" + avaerageRating + ", numVotes=" + numVotes + "]";
	}
	
	

}
