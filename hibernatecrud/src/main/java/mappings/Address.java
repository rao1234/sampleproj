package mappings;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Address {
	@Id
	@Column
	private int addressid;
	@Column
	private String adressname;
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public String getAdressname() {
		return adressname;
	}
	public void setAdressname(String adressname) {
		this.adressname = adressname;
	}

}
