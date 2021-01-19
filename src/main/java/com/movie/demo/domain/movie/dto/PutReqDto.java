package com.movie.demo.domain.movie.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PutReqDto {
	@NotBlank(message = "fail")
	private String title;
	
	@Positive
	private double rating;
}
