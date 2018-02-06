package boothello.SpringAutowiringexample;

public class Address {

	private String addressid;
	private String addressname;
	public String getAddressid() {
		return addressid;
	}
	public void setAddressid(String addressid) {
		this.addressid = addressid;
	}
	public String getAddressname() {
		return addressname;
	}
	public void setAddressname(String addressname) {
		this.addressname = addressname;
	}
	@Override
	public String toString() {
		return "Address [addressid=" + addressid + ", addressname=" + addressname + "]";
	}
	
}
