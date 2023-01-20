package com.demo.main.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.main.Repository.Movies_csvRepository;
import com.demo.main.Service.Movies_csvService;
import com.demo.main.model.Movies_csv;


@Service
public class Movies_csvServiceImpl implements Movies_csvService{
	@Autowired
	Movies_csvRepository mr;

	@Override
	public List<Movies_csv> getAllMovies() {
		
		return mr.findAll();
		
	}

	@Override
	public Movies_csv saveData(Movies_csv m) {
		
		return mr.save(m);
	}

	@Override
	public List getListOfMoviesOnAverageRating() {
		
		
		return mr.getListOfMoviesOnAverageRating(); //average bonus Question
	}

	@Override
	public List topTenMoviesWithLongestRuntime() {
		
		
		return mr.getAllMovies(); //top 10
	}

	
	
	

}
