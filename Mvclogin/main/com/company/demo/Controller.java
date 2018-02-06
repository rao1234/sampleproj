package com.company.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class Controller {
   @RequestMapping("/login")  
   public ModelAndView login(HttpServletRequest request,
		   HttpServletResponse response) {
	  String user name=request.getParameter("user name");  
      String password=request.getParameter("password");
      String message;
      if(user name != null && 
    		  !user name.equals("") 
    		  && user name.equals("jai") && 
    		  password != null && 
    		  !password.equals("") && 
    		  password.equals("123")){
    	  message = "Welcome " +user name + ".";
	      return new ModelAndView("welcome", 
	    		  "message", message);  
 
      }else{
    	  message = "Wrong username or password.";
    	  return new ModelAndView("errorPage", 
    			  "message", message);
      }
   }
}