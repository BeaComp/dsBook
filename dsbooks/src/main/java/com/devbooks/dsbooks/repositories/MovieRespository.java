package com.devbooks.dsbooks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devbooks.dsbooks.entities.Movie;

public interface MovieRespository extends JpaRepository<Movie, Long>  {
    
}
