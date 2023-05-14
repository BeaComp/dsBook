package com.devbooks.dsbooks.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devbooks.dsbooks.dto.MovieMinDTO;
import com.devbooks.dsbooks.entities.Movie;
import com.devbooks.dsbooks.repositories.MovieRespository;
@Service
public class MovieService {

    @Autowired
    private MovieRespository movieRepository;
    
    public List<MovieMinDTO> findAll() {
        List<Movie> result = movieRepository.findAll();
        return result.stream().map(x -> new MovieMinDTO(x)).toList();
    }
}