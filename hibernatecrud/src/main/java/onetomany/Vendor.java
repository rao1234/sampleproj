package onetomany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Vendor {
	@Override
	public String toString() {
		return "Vendor [vid=" + vid + ", vname=" + vname + ", customers=" + customers + "]";
	}

	@Id
	@Column
	private int vid;
	@Column
	private String vname;
	@OneToMany(targetEntity = Customer.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "vid", referencedColumnName = "vid")
	Set<Customer> customers;

	public Set<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

}
