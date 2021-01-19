package com.movie.demo.domain.movie.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

import com.movie.demo.domain.movie.Movie;
import com.movie.demo.domain.movie.dto.CommonDto;
import com.movie.demo.domain.movie.dto.PostReqDto;
import com.movie.demo.domain.movie.dto.PutReqDto;

@Configuration
public class MovieRepository {
	
	public List<Movie> findAll() {
		List<Movie> movies = new ArrayList<>();
		
		Movie movie1 = Movie.builder()
				.id(1)
				.title("제목1")
				.rating(4.7)
				.build();
		movies.add(movie1);
		Movie movie2 = Movie.builder()
				.id(2)
				.title("제목2")
				.rating(4.3)
				.build();
		movies.add(movie2);
		
		return movies;
	}
	
	public Movie findById(int id) {
		Movie movie1 = Movie.builder()
				.id(id)
				.title("제목"+id)
				.rating(4.7)
				.build();
		
		return movie1;
	}
	
	public CommonDto<String> post(PostReqDto dto) {
		if (dto.getTitle() == null || dto.getTitle().equals("")) {
			return new CommonDto<>(HttpStatus.INTERNAL_SERVER_ERROR.value(), "fail");
		}
		return new CommonDto<>(HttpStatus.OK.value(), "ok");
	}
	
	public CommonDto<String> deleteById(int id) {
		int result = 1;
		if (result == 1) {
			return new CommonDto<>(HttpStatus.OK.value(), "ok");
		} else {
			return new CommonDto<>(HttpStatus.INTERNAL_SERVER_ERROR.value(), "fail");
		}
	}
	
	public CommonDto<String> putById(int id, PutReqDto dto) {
		if (dto.getTitle() == null || dto.getTitle().equals("")) {
			return new CommonDto<>(HttpStatus.INTERNAL_SERVER_ERROR.value(), "fail");
		}
		return new CommonDto<>(HttpStatus.OK.value(), "ok");
	}
	
}
