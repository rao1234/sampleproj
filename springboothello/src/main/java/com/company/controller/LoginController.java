package com.company.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.compay.model.Login;

//keep RestController Annotation
@RestController
public class LoginController {

	
	//1. http://localhost:9999/login?username=xxxxx&password=xxxx
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ResponseEntity<String> readDataUsingRequestParam(@RequestParam String username,@RequestParam String password)
	{
		System.out.println(username);
		System.out.println(password);
	return new ResponseEntity<String>("Login succesful",HttpStatus.OK);
	}
	
	//2. http://localhost:9999/login/vamsi/krishna
	@RequestMapping(value="/login/{username}/{password}",method=RequestMethod.GET)
	public ResponseEntity<String> readDataUsingPathVariable(@PathVariable String username,@PathVariable String password)
	{
		System.out.println(username);
		System.out.println(password);
		return new ResponseEntity<String>("Login succesful",HttpStatus.OK);
	}
	@RequestMapping(value="/loginjson",method=RequestMethod.POST)
	public ResponseEntity<Login> readDataUsingFromJson(@RequestBody Login login)
	{
		return new ResponseEntity<Login>(login,HttpStatus.OK);
	}
	
	
	
}
