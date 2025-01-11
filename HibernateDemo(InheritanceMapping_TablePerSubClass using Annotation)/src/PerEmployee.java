import javax.persistence.*;


@Entity
@Table(name = "PerEmployeeDetails")
@PrimaryKeyJoinColumn(name="Peid")


public class PerEmployee extends Employee {

	@Column(name = "Designation" ,length = 10)
	String disign;
	@Column(name = "Department" ,length = 10)
	String deptname;
	

	public PerEmployee(int eid, String name, double esal, String disign, String deptname) {
		super(eid, name, esal);
		this.disign = disign;
		this.deptname = deptname;
	}

	
	public String getDisign() {
		return disign;
	}

	public void setDisign(String disign) {
		this.disign = disign;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}


	@Override
	public String toString() {
		return "PerEmployee [disign=" + disign + ", deptname=" + deptname + ", eid=" + eid + ", name=" + ename
				+ ", esal=" + esal + "]";
	}


	

}
