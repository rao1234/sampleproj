package com.vsstech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.vsstech.controller" })
@RestController
public class App {
	@Autowired
	CustomerRepository repository;

	@RequestMapping("/save")
	public String process() {
		Customer customer = new Customer();
		customer.setId(101L);
		customer.setFirstName("Vamsikrishna");
		customer.setLastName("Mupparaju");
		repository.save(customer);
		/*
		 * repository.save(new Customer("Adam", "Johnson")); repository.save(new
		 * Customer("Kim", "Smith")); repository.save(new Customer("David",
		 * "Williams")); repository.save(new Customer("Peter", "Davis"));
		 */ return "Done";
	}

	public static void main(String[] args) {
		// System.out.println( "Hello World!" );
		SpringApplication.run(App.class, args);
	}
}
