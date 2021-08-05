package com.DisneyChallenge.models.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import com.DisneyChallenge.DTO.CharactersDTO;
import com.DisneyChallenge.DTO.MovieGenreDTO;
import com.DisneyChallenge.DTO.MoviesAndTVSeriesDTO;
import com.DisneyChallenge.models.entity.Characters;
import com.DisneyChallenge.models.entity.MovieGenre;
import com.DisneyChallenge.models.entity.MoviesAndTVSeries;

@Service 
public class DisneyChallengeServices implements DisneyChallengeService{
	
	@Autowired
	private JpaRepository DisneyChallengeRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public CharactersDTO create(CharactersDTO Characters) {
		Characters charactersEntity = modelMapper.map(Characters,Characters.class);
		DisneyChallengeRepository.save(charactersEntity);
		return modelMapper.map(charactersEntity , CharactersDTO.class);
	}

	@Override
	public MovieGenreDTO create(MovieGenreDTO MovieGenre ) {
	
		MovieGenre MovieGenreEntity = modelMapper.map(MovieGenre, MovieGenre.class);
		DisneyChallengeRepository.save(MovieGenreEntity);
		return modelMapper.map(MovieGenreEntity , MovieGenreDTO.class);
		
	}

	@Override
	public MoviesAndTVSeriesDTO create(MoviesAndTVSeriesDTO MoviesAndTVSeries) {
	
		MoviesAndTVSeries MoviesAndTVSeriesEntity = modelMapper.map(MoviesAndTVSeries,MoviesAndTVSeries.class);
		DisneyChallengeRepository.save(MoviesAndTVSeriesEntity);
		return modelMapper.map(MoviesAndTVSeriesEntity , MoviesAndTVSeriesDTO.class);
	}

}
