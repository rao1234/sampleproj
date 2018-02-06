package com.vss.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping(value="/add")
	public String displaymessage(){
		System.out.println("hello");
		//data forward to entity class 
		
		return "display";
	}
	@RequestMapping(value="/update")
	public String mess(){
		return "show";
	}

	@RequestMapping(value="as")
	public String showmess(){
		return "sample";
	}
}