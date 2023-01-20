package com.demo.main.Service;

import java.util.List;

import com.demo.main.model.Movies_csv;

public interface Movies_csvService {

	List<Movies_csv> getAllMovies();

	Movies_csv saveData(Movies_csv m);

	List getListOfMoviesOnAverageRating();
	
	List topTenMoviesWithLongestRuntime();

}
