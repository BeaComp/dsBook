package com.devbooks.dsbooks.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devbooks.dsbooks.dto.MovieDTO;
import com.devbooks.dsbooks.dto.MovieMinDTO;
import com.devbooks.dsbooks.entities.Movie;
import com.devbooks.dsbooks.repositories.MovieRespository;
@Service
public class MovieService {

    @Autowired
    private MovieRespository movieRepository;

    @Transactional(readOnly = true)
    public MovieDTO findById(Long id) {
        Movie result = movieRepository.findById(id).get();
        MovieDTO dto = new MovieDTO(result);
        return dto;
    }
    
    @Transactional(readOnly = true)
    public List<MovieMinDTO> findAll() {
        List<Movie> result = movieRepository.findAll();
        return result.stream().map(x -> new MovieMinDTO(x)).toList();
    }
}