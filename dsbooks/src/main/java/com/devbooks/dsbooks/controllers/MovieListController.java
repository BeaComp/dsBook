package com.devbooks.dsbooks.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.devbooks.dsbooks.dto.MovieListDTO;
import com.devbooks.dsbooks.dto.MovieMinDTO;
import com.devbooks.dsbooks.services.MovieListService;
import com.devbooks.dsbooks.services.MovieService;


@RestController
@RequestMapping(value = "/lists")
public class MovieListController {
    
    @Autowired
    private MovieListService movieListService;

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<MovieListDTO> findAll() {
        List<MovieListDTO> result = movieListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/movies")
    public List<MovieMinDTO> findByList(@PathVariable Long listId) {
        List<MovieMinDTO> result = movieService.findByList(listId);
        return result;
    }

}
