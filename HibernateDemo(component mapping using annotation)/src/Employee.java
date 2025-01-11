import javax.persistence.*;

@Entity
@Table(name = "Employee2")

public class Employee  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="eid" ,length=3)
	private int eid;
	
	@Column(name="ename" ,length=10)
	private String ename;
	
	@Column(name="salary" ,length=10)
	private double salary;
	@Embedded
	private Address addr;

	public Employee(int eid, String ename, double salary, Address addr) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.addr = addr;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", addr=" + addr + "]";
	}

}
