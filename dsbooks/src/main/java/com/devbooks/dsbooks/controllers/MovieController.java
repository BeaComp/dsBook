package com.devbooks.dsbooks.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devbooks.dsbooks.dto.MovieMinDTO;
import com.devbooks.dsbooks.entities.Movie;
import com.devbooks.dsbooks.services.MovieService;

@RestController
@RequestMapping(value = "/movie")
public class MovieController {
    
    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<MovieMinDTO> findAll() {
        List<MovieMinDTO> result = movieService.findAll();
        return result;
    }

}
