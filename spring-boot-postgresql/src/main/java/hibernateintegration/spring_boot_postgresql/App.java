package hibernateintegration.spring_boot_postgresql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages={"hibernateintegration.spring_boot_postgresql"})
@RestController
public class App 
{
	@Autowired
	CustomerRepository repository;
	@Autowired
	EmployeeRepository employeeRepository;

	@RequestMapping("/save")
	public String process() {
		repository.save(new Customer("Jack", "Smith"));
		repository.save(new Customer("Adam", "Johnson"));
		repository.save(new Customer("Kim", "Smith"));
		repository.save(new Customer("David", "Williams"));
		repository.save(new Customer("Peter", "Davis"));
		return "Done";
	}

    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	SpringApplication.run(App.class, args);
    }
    @RequestMapping("/saveemployee")
	public String saveemployee() {
    	employeeRepository.save(new Employee("1001", "vamsi", 1000));
		
		return "Done";
	}
}
