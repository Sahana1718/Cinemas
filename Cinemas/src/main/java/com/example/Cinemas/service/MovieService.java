package com.example.Cinemas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Cinemas.Repository.MovieRepository;
import com.example.Cinemas.controller.Movies;
import com.example.Cinemas.entity.Movie;

@Service
public class MovieService {
	
 @Autowired
 private MovieRepository movieRepository;
 
 public Movie addMovies(Movies movies) {
	 Movie movie = new Movie();
	
	 movie.setActorName(movies.getActorName());
	 movie.setContactNumber(movies.getContactNumber());
	 movie.setMovieName(movies.getMovieName());
	 movie.setProductionHouse(movies.getProductionHouse());
	 
	return movieRepository.save(movie);
	 
 }
 private Movies movies = new Movies();

public void setActorName(String actorName) {
	movies.setActorName(actorName);
}


public void setContactNumber(String contactNumber) {
	movies.setContactNumber(contactNumber);
}

public void setMovieName(String movieName) {
	movies.setMovieName(movieName);
	
}

public void setProductionHouse(String productionHouse) {
	movies.setProductionHouse(productionHouse);
	
}



public Movie getMoviesById(Integer id) {
	
	return movieRepository.findById(id).orElse(null);
}


public Movie updateMovie( Movie existingMovie) {
	
	Movie movieupdate= movieRepository.findById(existingMovie.getId()).orElse(null);
	movieupdate.setMovieName(existingMovie.getMovieName());
    movieupdate.setActorName(existingMovie.getActorName());
    movieupdate.setContactNumber(existingMovie.getContactNumber());
    movieupdate.setProductionHouse(existingMovie.getProductionHouse());
	return  movieRepository.save(movieupdate);
}

public void deleteMovie(Integer id) {
    movieRepository.deleteById(id);
}

}
	
