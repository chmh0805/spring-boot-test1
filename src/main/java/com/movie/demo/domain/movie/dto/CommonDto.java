package com.movie.demo.domain.movie.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Builder
public class CommonDto<T> {
	private int statusCode;
	private T data;
	
	public CommonDto(int statusCode, T data) {
		super();
		this.statusCode = statusCode;
		this.data = data;
	}

	public CommonDto(int statusCode) {
		super();
		this.statusCode = statusCode;
	}

	public CommonDto(T data) {
		super();
		this.data = data;
	}
	
}
