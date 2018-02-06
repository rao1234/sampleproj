package com.hcl.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
 
 
@Controller
public class SpringMVCController {
	
	@RequestMapping(value = "/PostFormData", method = RequestMethod.POST)
	public @ResponseBody Person PostService(@RequestBody Person person) {
		
		return person;
	}
 
}