
public class TempEmployee extends Employee{
	
	String cname;
	int workdays;
	

	public TempEmployee(int eid, String name, double esal, int workdays, String cname) {
		super(eid, name, esal);
		this.workdays = workdays;
		this.cname = cname;
	}
	
	

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getWorkdays() {
		return workdays;
	}

	public void setWorkdays(int workdays) {
		this.workdays = workdays;
	}
	@Override
	public String toString() {
		return "TempEmployee [cname=" + cname + ", workdays=" + workdays + ", eid=" + eid + ", name=" + name + ", esal="
				+ esal + "]";
	}

}
