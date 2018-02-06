package springxmldemo.com.xml;


public class Patient {


    private int pid;
	
	private String pname;
	
	private String paddress;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public Patient(int pid, String pname, String paddress) {
//	/	super();
		this.pid = pid;
		this.pname = pname;
		this.paddress = paddress;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPaddress() {
		return paddress;
	}
	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", pname=" + pname + ", paddress=" + paddress + "]";
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	

}
