package com.movie.demo.domain.movie;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Movie {
	private int id;
	private String title;
	private double rating;
	private Timestamp makeDate;
}
