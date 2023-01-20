package com.demo.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.demo.main.Service.Movies_csvService;
import com.demo.main.model.Movies_csv;

@RestController
public class controller {
	
		@Autowired 
		Movies_csvService mv;

		@GetMapping("/getmovi")
		public List<Movies_csv>getAllmovies()
		{
			List<Movies_csv> list=mv.getAllMovies();
			return list;
			
		}
		
		@PostMapping("/saveMovies")
		public String saveData(@RequestBody Movies_csv m)
		{
			Movies_csv mo=mv.saveData(m);
			
			if(mo!=null)
			{
				return "Success";
			}
			return "Not Success";
		}
		
		@GetMapping("/getListOfMoviesOnAverageRating")
		public List getListOfMoviesOnAverageRating()
		{
			List listOfMoviesOnAverageRating = mv.getListOfMoviesOnAverageRating();
			return listOfMoviesOnAverageRating;
		}
		
		@GetMapping("/topTenMoviesWithLongestRuntime")
		public List topTenMoviesWithLongestRuntime()
		{
			return mv.topTenMoviesWithLongestRuntime();
		}
}
