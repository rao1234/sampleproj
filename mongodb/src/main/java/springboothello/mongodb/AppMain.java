package springboothello.mongodb;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

public class AppMain {
	public static void main(String[] args) {
		// For Annotation
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
		MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
		// constrcutor data
		Employee conemp = new Employee("101", "apparao", 1000);

		// pass data using setter method.........
		Employee setemp = new Employee();
		setemp.setId("201");
		setemp.setEmployeename("VamsiKrishna");
		setemp.setEmployeesal(2000);

		// mongoOperation.save(setemp);
		// mongoOperation.save(conemp);
		// find
		// select * from employee where id=201 sql
		// db.employee.find({"id":"201"})
		Query findEmpQuery = new Query();
		// where clause
		findEmpQuery.addCriteria(Criteria.where("id").is("201"));
		Employee emp = mongoOperation.findOne(findEmpQuery, Employee.class, "employee");
		System.out.println(emp);

		// find or get all employees
		List<Employee> employees = mongoOperation.findAll(Employee.class);
		System.out.println(employees);
		
		
		
		//update
		//first find record to be uodated
		//find the field to be be updated
		Query query = new Query();
		query.addCriteria(Criteria.where("employeesal").is(2000));
		//field to be changed
		Update update = new Update();
		update.set("employeename", "srinadh");

		//mongoOperation.updateFirst(query, update, Employee.class);
		
		
		Query delquery = new Query();
		delquery.addCriteria(Criteria.where("employeesal").is(1000));
		Employee delemp = mongoOperation.findOne(delquery, Employee.class);
		
		//delete 
		mongoOperation.remove(delemp);

	}
}
