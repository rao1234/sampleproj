package onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
	@Id
	@Column
	private int cid;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCadress() {
		return cadress;
	}
	public void setCadress(String cadress) {
		this.cadress = cadress;
	}
	@Column
	private String cadress;
	
	

}
