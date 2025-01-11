import java.util.Set;
import javax.persistence.*;
@Entity
@Table( name="hib_dept")
public class Department {
	@Id
	@GeneratedValue 
	@Column(name="deptId", length=10)
	private int deptId;


	@Column(name="deptName", length=10)
	private String deptName;
	
	
	@OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
	private Set<Employee>employees;
	
	public Department(int deptId, String deptName, Set<Employee> employees) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.employees = employees;
	}

	public Department() {
	
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", employees=" + employees + "]";
	}

	
	

}
