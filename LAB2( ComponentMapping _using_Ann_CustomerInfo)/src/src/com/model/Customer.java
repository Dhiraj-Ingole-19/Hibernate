package src.com.model;
import javax.persistence.*;
@Entity
@Table(name = "Customer")

 public class Customer {
	    @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "CustId",length=4)
     	int cid;
		@Column(name = "CustName",length=10)
		String name;
		 @Column(name = "Phone",length=10)
		String ContactNo;
		 @Column(name = "DOB",length=10)
		String birthdate;
		 @Embedded
	
	    Address addr;
	 public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}
	public Customer(int cid, String name, String contactNo, String birthdate, Address addr) {
		super();
		this.cid = cid;
		this.name = name;
		ContactNo = contactNo;
		this.birthdate = birthdate;
		this.addr = addr;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNo() {
		return ContactNo;
	}
	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", ContactNo=" + ContactNo + ", birthdate=" + birthdate
				+ ", addr=" + addr + "]";
	}
}
	 
	 
	
