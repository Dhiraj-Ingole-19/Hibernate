import javax.persistence.*;

@ Entity
@Table(name = "EmployeeDetails")
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "eid" ,length = 3)
	int eid;
	
	@Column(name = "ename" ,length = 10)
	String ename;
	
	@Column(name = "esal" ,length = 6)
	double esal;
	
	

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
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public Employee(int eid, String ename, double esal2) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal2;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
}
