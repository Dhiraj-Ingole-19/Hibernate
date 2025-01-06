import javax.persistence.*;

@Entity
@Table(name="Employee1")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="EmpType" ,discriminatorType =DiscriminatorType.STRING,length = 10)
@DiscriminatorValue(value="Emp"  )
public class Employee {
	@Id
	@GeneratedValue
	@Column(name="eid" ,length=3)
	int eid;
	
	@Column(name="name",length = 10)
	String name;
	
	@Column(name="esal",length=10)
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
