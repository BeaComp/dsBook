package com.devbooks.dsbooks.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.devbooks.dsbooks.dto.MovieListDTO;

import com.devbooks.dsbooks.services.MovieListService;


@RestController
@RequestMapping(value = "/lists")
public class MovieListController {
    
    @Autowired
    private MovieListService movieListService;

    @GetMapping
    public List<MovieListDTO> findAll() {
        List<MovieListDTO> result = movieListService.findAll();
        return result;
    }

}
