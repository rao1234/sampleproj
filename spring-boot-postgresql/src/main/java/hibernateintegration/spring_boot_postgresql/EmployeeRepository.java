package hibernateintegration.spring_boot_postgresql;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Serializable>{
	
	
	
}