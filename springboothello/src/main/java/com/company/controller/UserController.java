package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.repositories.CarRepository;
import com.compay.model.Car;

@RestController
public class UserController {
	@Autowired
	CarRepository carRepository;

	// get or post
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public void registerMethod(Car car) {
		// insert into database mongodb
		// mongoTemplate.save(new Car(brand, model));
		carRepository.save(car);

	}
}
