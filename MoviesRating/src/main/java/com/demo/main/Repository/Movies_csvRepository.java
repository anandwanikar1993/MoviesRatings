package com.demo.main.Repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.main.model.Movies_csv;
@Transactional
@Repository
public interface Movies_csvRepository extends JpaRepository<Movies_csv , String>{

	@Modifying
	@Query(value = "SELECT * from Movies_csv m ORDER BY runtime_minutes DESC LIMIT 10",nativeQuery = true)
	public List<Movies_csv> getAllMovies();
	
//	
//	
	
	@Modifying
	@Query(value="SELECT tconst,primary_title,genres,avaerage_rating FROM movies_csv  join ratings_csv on movies_csv.rating_id=ratings_csv.id where\r\n"
			+ "avaerage_rating>6.0 order by avaerage_rating",nativeQuery = true)		
	public List getListOfMoviesOnAverageRating();
}
