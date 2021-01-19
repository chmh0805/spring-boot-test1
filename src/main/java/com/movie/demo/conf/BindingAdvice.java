package com.movie.demo.conf;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import com.movie.demo.domain.movie.dto.CommonDto;

@Component
@Aspect
public class BindingAdvice {
	
	@Around("execution(* com.movie.demo.web..*Controller.*(..))")
	public Object bindingPrint(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		
		Object[] args = proceedingJoinPoint.getArgs();
		
		for (Object arg : args) {
			if (arg instanceof BindingResult) {
				BindingResult bindingResult = (BindingResult) arg;
				if (bindingResult.hasErrors()) {
					return new CommonDto<>(HttpStatus.BAD_REQUEST.value(), "fail");
				}
			}
		}
		
		return proceedingJoinPoint.proceed();
	}
}
