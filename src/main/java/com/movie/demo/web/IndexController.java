package com.movie.demo.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.demo.domain.movie.Movie;
import com.movie.demo.domain.movie.dto.CommonDto;
import com.movie.demo.domain.movie.dto.PostReqDto;
import com.movie.demo.domain.movie.dto.PutReqDto;
import com.movie.demo.domain.movie.repo.MovieRepository;

@RestController
public class IndexController {

	private MovieRepository movieRepository;
	
	public IndexController(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}
	
	@GetMapping("/movie")
	public CommonDto<List<Movie>> findAll() {
		System.out.println("findAll()");
		return new CommonDto<>(HttpStatus.OK.value(), movieRepository.findAll());
	}
	
	@GetMapping("/movie/{id}")
	public CommonDto<Movie> findById(@PathVariable int id) {
		System.out.println("findById("+id+")");
		return new CommonDto<>(HttpStatus.OK.value(), movieRepository.findById(id));
	}
	
	@PostMapping("/movie")
	public CommonDto<String> post(@RequestBody PostReqDto dto) {
		System.out.println("post()");
		return movieRepository.post(dto);
	}
	
	@DeleteMapping("/movie/{id}")
	public CommonDto<String> deleteById(@PathVariable int id) {
		return movieRepository.deleteById(id);
	}
	
	@PutMapping("/movie/{id}")
	public CommonDto<String> putById(@PathVariable int id, @RequestBody PutReqDto dto) {
		return movieRepository.putById(id, dto);
	}
	
}
