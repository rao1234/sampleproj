package com.javatpoint.controllers;
import java.util.ArrayList;  
import java.util.List;  
  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.ResponseBody;

import com.javatpoint.beans.Student;  
@Controller  
public class DataController {  
  
 @RequestMapping("student")  
 public @ResponseBody  
 Student getStudent() {  
  return new Student(23, "Meghna", "Naidu", "meghna@gmail.com",  
    "8978767878");  
 }  
  
 @RequestMapping("studentlist")  
 public @ResponseBody  
 StudentList getStudentList() {  
  List<student> studentList = new ArrayList<student>();  
  studentList.add(new Student(3, "Robert", "Parera", "robert@gmail.com",  
    "8978767878"));  
  studentList.add(new Student(93, "Andrew", "Strauss",  
    "andrew@gmail.com", "8978767878"));  
  studentList.add(new Student(239, "Eddy", "Knight", "knight@gmail.com",  
    "7978767878"));  
  
  return new StudentList(studentList);  
 }  
  
}  