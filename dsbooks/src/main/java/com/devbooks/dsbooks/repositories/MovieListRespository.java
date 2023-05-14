package com.devbooks.dsbooks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devbooks.dsbooks.entities.MovieList;

public interface MovieListRespository extends JpaRepository<MovieList, Long>  {
    
}
