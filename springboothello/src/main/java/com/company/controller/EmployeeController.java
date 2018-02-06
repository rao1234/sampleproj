package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.repositories.CarRepository;
import com.compay.model.Car;
import com.compay.model.Employee;

@RestController
public class EmployeeController {
	@Autowired
	MongoTemplate mongoTemplate;

	// get or post
	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public void saveEmployee(@RequestBody Employee employee) {
		// insert into database mongodb
		mongoTemplate.save(employee);

	}
	//http://localhost:9999/saveEmployeeParam?id=2000&employeename=krishna&employeesal=5000
	// get or post
		@RequestMapping(value = "/saveEmployeeParam", method = RequestMethod.POST)
		public String saveEmployeeParam(@RequestParam String id, @RequestParam String employeename,@RequestParam String employeesal) {
			// insert into database mongodb
			// mongoTemplate.save(new Car(brand, model));
			// pass data using setter method.........
			Employee setemp = new Employee();
			setemp.setId(id);
			setemp.setEmployeename(employeename);
			setemp.setEmployeesal(Integer.valueOf(employeesal));
			mongoTemplate.save(setemp);

			return null;

		}
		//http://localhost:9999/saveEmployeeParam/3000/krishna/5000
		@RequestMapping(value = "/saveEmployeePath/{id}/{employeename}/{employeesal}")
		public String saveEmployeePath(@PathVariable String id, @PathVariable String employeename,@PathVariable String employeesal) {
			// insert into database mongodb
			// mongoTemplate.save(new Car(brand, model));
			// pass data using setter method.........
			Employee setemp = new Employee();
			setemp.setId(id);
			setemp.setEmployeename(employeename);
			setemp.setEmployeesal(Integer.valueOf(employeesal));
			mongoTemplate.save(setemp);

			return null;

		}
}
