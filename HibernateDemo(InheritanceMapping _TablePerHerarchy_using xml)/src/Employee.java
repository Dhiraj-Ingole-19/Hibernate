
public class Employee {
	

	int eid;
	String name;
	double esal;
	
	public Employee(int eid, String name, double esal) {
		super();
		this.eid = eid;
		this.name = name;
		this.esal = esal;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", esal=" + esal + "]";
	}


	
}
