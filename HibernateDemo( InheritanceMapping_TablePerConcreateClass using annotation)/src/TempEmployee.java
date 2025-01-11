import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

@Table(name = "TempEmployeeDetails")
@AttributeOverrides({@AttributeOverride(name = "ename",column=@Column(name="TeName",length=10)),
                     @AttributeOverride(name = "eid",column=@Column(name="TempId")),
                       @AttributeOverride(name = "esal",column=@Column(name="TempSalary"))})

public class TempEmployee extends Employee{
	@Column(name = "Contractor" ,length = 10)
	String cname;
	@Column(name = "Workdays" ,length = 10)
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
		return "TempEmployee [cname=" + cname + ", workdays=" + workdays + ", eid=" + eid + ", name=" + ename + ", esal="
				+ esal + "]";
	}

}
