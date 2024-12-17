package com.example.Cinemas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.Cinemas.entity.Movie;
import com.example.Cinemas.service.MovieService;

@RestController
@RequestMapping("/cinemas")

public class MovieController {
	@Autowired
	private MovieService movieService;
	
	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public String addMovies(@RequestBody Movies movies) {
		 movieService.addMovies(movies);
		 return "Your Movie database is added Successfully";
	}
	
	@PostMapping("/addActorName")
	@ResponseStatus(HttpStatus.CREATED)
	public String setActorname(@RequestBody Movies movies) {
		 movieService.setActorName(movies.getActorName());
		 return "Actor name set Successfully";
	}
	@PostMapping("/addContactNumber")
	@ResponseStatus(HttpStatus.CREATED)
	public String setContactNumber(@RequestBody Movies movies) {
		 movieService.setContactNumber(movies.getContactNumber());
		 return "Contact Number set Successfully";
	}
	
	@PostMapping("/addMovieName")
	@ResponseStatus(HttpStatus.CREATED)
	public String setMovieName(@RequestBody Movies movies) {
		 movieService.setMovieName(movies.getMovieName());
		 return "MovieName set Successfully";
	}
	
	
	@PostMapping("/addProductionHouse")
	@ResponseStatus(HttpStatus.CREATED)
	public String setProductionHouse(@RequestBody Movies movies) {
		 movieService.setProductionHouse(movies.getProductionHouse());
		 return "Production house set Successfully";
	}

	
	@GetMapping("/{id}")
	public Movie getAllMoviesById(@PathVariable Integer id) {
        
        return movieService.getMoviesById(id);
    }
	
	  @PutMapping("/{id}")
	 
	  public Movie updateMovie(@PathVariable Integer id, @RequestBody Movie existingMovie) {
	      existingMovie.setId(id); 
	      return movieService.updateMovie(existingMovie);
	  }
	  
	  
	  @DeleteMapping("/{id}")
	  @ResponseStatus(HttpStatus.NO_CONTENT) 
	  public void deleteMovie(@PathVariable Integer id) {
	      movieService.deleteMovie(id);
	      
	  }

}


	 
	
	


