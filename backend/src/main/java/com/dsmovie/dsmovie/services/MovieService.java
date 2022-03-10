package com.dsmovie.dsmovie.services;

import com.dsmovie.dsmovie.dto.MovieDTO;
import com.dsmovie.dsmovie.entities.Movie;
import com.dsmovie.dsmovie.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable) {
        Page<Movie> result = repository.findAll(pageable);
        Page<MovieDTO> page = result.map(movie -> new MovieDTO(movie));
        return page;
    }
    @Transactional(readOnly = true)
    public MovieDTO findById(Long id) {
       Movie result = repository.findById(id).get();
       MovieDTO dto = new MovieDTO(result);
        return dto;
    }

}