package com.devbooks.dsbooks.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devbooks.dsbooks.entities.Movie;
import com.devbooks.dsbooks.projections.MovieMinProjection;


public interface MovieRespository extends JpaRepository<Movie, Long>  {
    @Query(nativeQuery = true, value = """
			SELECT tb_filme.id, tb_filme.title, tb_filme.movie_year AS movieYear, tb_filme.img_url AS imgUrl,
			tb_filme.short_description AS shortDescription, tb_belonging.position
			FROM tb_filme
			INNER JOIN tb_belonging ON tb_filme.id = tb_belonging.movie_id
			WHERE tb_belonging.list_id = :listId
			ORDER BY tb_belonging.position
				""")
	List<MovieMinProjection> searchByList(Long listId);
}
