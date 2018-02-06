package com.hcl.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class RegisterController {
//http://localhost:8080/springbasic/register?username=****&password=*****
	/*@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerUser(HttpServletRequest httpServletRequest)
	{
		System.out.println(httpServletRequest.getParameter("username"));
		System.out.println(httpServletRequest.getParameter("password"));
		return "login";
	}*/
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerUser(@RequestParam String username,@RequestParam String password)
	{
		System.out.println(username);
		System.out.println(password);
		return "login";
	}
	
	
	
	//http://localhost:8080/springbasic/register/apparao/apparao
	@RequestMapping(value = "/register/{username}/{password}", method = RequestMethod.GET)
	public String registerUserPathDemo(@PathVariable String username,@PathVariable String password)
	{
		System.out.println(username);
		System.out.println(password);
		return "login";
	}
}
