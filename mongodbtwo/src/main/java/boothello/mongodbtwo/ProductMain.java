package boothello.mongodbtwo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class ProductMain {
	

	public static void main(String[] args) {
		 
		ApplicationContext cr = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
		MongoOperations mongoOperation = (MongoOperations) cr.getBean("mongoTemplate");
		
		// constrcutor data
		Product con = new Product("104", "rao", 1000);

		

		// mongoOperation.save(prod);
		 mongoOperation.save(con);
		// find
		// select * from employee where id=201 sql
		// db.employee.find({"id":"201"})
		Query findEmpQuery = new Query();
		// where clause
		findEmpQuery.addCriteria(Criteria.where("id").is("201"));
		Product emp = mongoOperation.findOne(findEmpQuery, Product.class, "product");
		System.out.println(emp);

		// find or get all employees
		List<Product> product = mongoOperation.findAll(Product.class);
		System.out.println(product);
		
		
	}
	
}
