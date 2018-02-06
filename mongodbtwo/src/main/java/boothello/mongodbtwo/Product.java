package boothello.mongodbtwo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="product")
public class Product {
	
	@Id
	private String id;
	
	private String pname;
	public Product(String id, String pname, int pcost) {
		super();
		this.id = id;
		this.pname = pname;
		this.pcost = pcost;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", pcost=" + pcost + "]";
	}
	private int pcost;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPcost() {
		return pcost;
	}
	public void setPcost(int pcost) {
		this.pcost = pcost;
	}
	

}
