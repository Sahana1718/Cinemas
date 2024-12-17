package com.example.Cinemas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Cinemas.entity.Movie;





public interface MovieRepository extends JpaRepository< Movie,Integer> {

}
