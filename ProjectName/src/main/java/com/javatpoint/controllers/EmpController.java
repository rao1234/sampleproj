package com.javatpoint.controllers;
import java.util.ArrayList;  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;  
import com.javatpoint.beans.Emp;  
@RestController  
public class EmpController {  
		
	/*@Autowired
	HibernateTemplate ibernateTemplate;*/
    @RequestMapping("/empform")  
    public ModelAndView showform(){  
         //command is a reserved request attribute name, now use <form> tag to show object data  
        return new ModelAndView("empform","command",new Emp());  
    }  
    @RequestMapping(value="/save",method = RequestMethod.POST)  
    public ModelAndView save(@ModelAttribute("emp") Emp emp){  
        //write code to save emp object  
        //here, we are displaying emp object to prove emp has data  
        System.out.println(emp.getName()+" "+emp.getSalary()+" "+emp.getDesignation());  
          
        //return new ModelAndView("empform","command",emp);//will display object data  
        return new ModelAndView("redirect:/viewemp");//will redirect to viewemp request mapping  
    }  
      
    @RequestMapping("/viewemp")  
    public ModelAndView viewemp(){  
        //write the code to get all employees from DAO  
        //here, we are writing manual code of list for easy understanding  
        List<Emp> list=new ArrayList<Emp>();  
        getAllEmp(list);  
          
        return new ModelAndView("viewemp","list",list);  
    }
    @RequestMapping(value="/getAllEmp",method = RequestMethod.GET)  
    public @ResponseBody List<Emp> getAllEmp(){  
        //write the code to get all employees from DAO  
        //here, we are writing manual code of list for easy understanding  
        List<Emp> list=new ArrayList<Emp>();  
        getAllEmp(list);  
          
        return list; 
    }
	private void getAllEmp(List<Emp> list) {
		list.add(new Emp(1,"rahul",35000f,"S.Engineer"));  
        list.add(new Emp(2,"aditya",25000f,"IT Manager"));  
        list.add(new Emp(3,"sachin",55000f,"Care Taker"));
	}  
}  