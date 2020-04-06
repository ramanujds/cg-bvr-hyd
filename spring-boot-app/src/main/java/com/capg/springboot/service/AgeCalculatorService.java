package com.capg.springboot.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public class AgeCalculatorService {

	public int getAge(LocalDate dob) {
		LocalDate today=LocalDate.now();
		int age=today.getYear()-dob.getYear();
		return age;
	}
}
