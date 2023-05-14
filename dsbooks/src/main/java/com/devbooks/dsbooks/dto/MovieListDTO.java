package com.devbooks.dsbooks.dto;

import com.devbooks.dsbooks.entities.MovieList;

public class MovieListDTO {

	private Long id;
	private String name;
	
	public MovieListDTO(MovieList entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
