package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.repositories.CarRepository;
import com.compay.model.Car;

@RestController
@ComponentScan(basePackages = "com.company.config")
public class RegistrationController {

	@Autowired
	MongoTemplate mongoTemplate;

	@Autowired
	CarRepository carRepository;
	// http://localhost:8080/register?username=xxxx&password=xxxx

	// get or post
	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String registerMethod(@RequestParam String brand, @RequestParam String model) {
		// insert into database mongodb
		// mongoTemplate.save(new Car(brand, model));
		carRepository.save(new Car(brand, model));
		return null;

	}

	// Page fooPage = FooRepository.findByMethod('John', new PageRequest(0,20));
	/*
	 * @RequestMapping( value = "admin/foo",params = { "page", "size" }, method
	 * = GET )
	 * 
	 * @ResponseBody public List< Foo > findPaginated(  @RequestParam( "page" )
	 * int page, @RequestParam( "size" ) int size,  UriComponentsBuilder
	 * uriBuilder, HttpServletResponse response ){      Page< Foo > resultPage =
	 * service.findPaginated( page, size );    if( page >
	 * resultPage.getTotalPages() ) {       throw new
	 * ResourceNotFoundException();    }    eventPublisher.publishEvent( new
	 * PaginatedResultsRetrievedEvent< Foo >     ( Foo.class, uriBuilder,
	 * response, page, resultPage.getTotalPages(), size ) );      return
	 * resultPage.getContent(); }
	 */
	//http://localhost:9999/findPaginated?startnumber=0&endnumber=10
	@GetMapping("/findPaginated")
	@ResponseBody
	public List<Car> findPaginated(@RequestParam String startnumber, @RequestParam String endnumber) {
		Page carPage = carRepository.findByMethod("mobile",
				new PageRequest(Integer.valueOf(startnumber), Integer.valueOf(endnumber)));
		return carPage.getContent();

	}
}
