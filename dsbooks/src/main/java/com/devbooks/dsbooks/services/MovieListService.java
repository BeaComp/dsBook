package com.devbooks.dsbooks.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devbooks.dsbooks.dto.MovieDTO;
import com.devbooks.dsbooks.dto.MovieListDTO;
import com.devbooks.dsbooks.dto.MovieMinDTO;
import com.devbooks.dsbooks.entities.Movie;
import com.devbooks.dsbooks.entities.MovieList;
import com.devbooks.dsbooks.repositories.MovieListRespository;
import com.devbooks.dsbooks.repositories.MovieRespository;
@Service
public class MovieListService {

    @Autowired
    private MovieListRespository movieListRepository;

    @Transactional(readOnly = true)
    public List<MovieListDTO> findAll() {
        List<MovieList> result = movieListRepository.findAll();
        return result.stream().map(x -> new MovieListDTO(x)).toList();
    }
}