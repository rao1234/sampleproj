package jsondemo.jsondemo;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JsonGenerationException, JsonMappingException, IOException
    {
        //System.out.println( "Hello World!" );
    	ObjectMapper objectMapper=new ObjectMapper();
    	Employee employee=new Employee();
    	employee.setId(101);
    	employee.setName("apparao");
    	employee.setSalary(10000);
    	
    	// java to json
    	String jsonstr=objectMapper.writeValueAsString(employee);
    	System.out.println(jsonstr);
    	System.out.println(",,,,,,,,,,,,,,,,,,,,,,");
    	
    	//json to java convert
    	Employee revobj=objectMapper.readValue(jsonstr, Employee.class);
    	System.out.println(revobj);
    	
    	
    	
    	System.out.println("............gson...............");
    	Gson gson=new Gson();
    	//java to json
    	String gsonjsonstr=gson.toJson(employee);
    	System.out.println(gsonjsonstr);
    	//json to java
    	Employee gsonrevobj=gson.fromJson(jsonstr, Employee.class);
    	System.out.println(gsonrevobj);
    }
}
