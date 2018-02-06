package springboothello.mongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employee")
public class Employee {
	@Id
private String id;
private String employeename;
@Override
public String toString() {
	return "Employee [id=" + id + ", employeename=" + employeename + ", employeesal=" + employeesal + "]";
}
private int employeesal;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public Employee(String id, String employeename, int employeesal) {
	super();
	this.id = id;
	this.employeename = employeename;
	this.employeesal = employeesal;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public String getEmployeename() {
	return employeename;
}
public void setEmployeename(String employeename) {
	this.employeename = employeename;
}
public int getEmployeesal() {
	return employeesal;
}
public void setEmployeesal(int employeesal) {
	this.employeesal = employeesal;
}
}
