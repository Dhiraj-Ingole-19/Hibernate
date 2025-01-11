import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hib_Employee")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "empId", length = 5)
	private int empid;
	@Column(name = "empFirstname", length = 10)
	private String fristname;
	@Column(name = "empLastname", length = 10)
	private String lastname;
	@Column(name = "DOB", length = 10)
	private String birthDate;
	@Column(name = "CellPhone", length = 12)
	private String cellphone;
	@ManyToOne
	@JoinColumn(name="deptId")
	
	private Department department;
	

	public Employee(int empid, String fristname, String lastname, String birthDate, String cellphone,Department department) {
		super();
		this.empid = empid;
		this.fristname = fristname;
		this.lastname = lastname;
		this.birthDate = birthDate;
	    this.cellphone = cellphone;
	    this.department=department;
	      
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getFristname() {
		return fristname;
	}

	public void setFristname(String fristname) {
		this.fristname = fristname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", fristname=" + fristname + ", lastname=" + lastname + ", birthDate="
				+ birthDate + ", cellphone=" + cellphone + ", department=" + department + "]";
	}


}
