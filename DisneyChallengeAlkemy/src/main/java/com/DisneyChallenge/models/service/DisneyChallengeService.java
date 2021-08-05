package com.DisneyChallenge.models.service;

import javax.validation.Valid;

import com.DisneyChallenge.DTO.CharactersDTO;
import com.DisneyChallenge.DTO.MovieGenreDTO;
import com.DisneyChallenge.DTO.MoviesAndTVSeriesDTO;

public interface DisneyChallengeService {

	public CharactersDTO create (@Valid CharactersDTO role);
	
	public MovieGenreDTO create(@Valid MovieGenreDTO role);
	
	public MoviesAndTVSeriesDTO create(@Valid MoviesAndTVSeriesDTO role);
}
