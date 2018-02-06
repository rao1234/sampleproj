package javatojson;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonApp {
public static void main(String[] args) {
	//objectmapper 
	//gson
	
	ObjectMapper objectMapper=new ObjectMapper();
	
	
	Product p=new Product();
	p.setPid(20);
	p.setPname("vamsi");
	
	
}
}
