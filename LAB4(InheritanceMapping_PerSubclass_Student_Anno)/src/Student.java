import java.util.Date;

import javax.persistence.*;
@Entity
@Table(name="Student")
@Inheritance(strategy = InheritanceType.JOINED)

public class Student {
	public Student(int rollNo, String name, Date admdate, Address perAddr) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.admdate = admdate;
		this.perAddr = perAddr;
	}
	
	@Id
	@GeneratedValue
	@Column(name="RollNO" ,length=3)
	int rollNo;
	@Column(name="Name",length = 10)
	String name;
	@Column(name="AdmissionDate",length=10)
	Date admdate;
	@Embedded
	Address perAddr;
	
	public Student() {
		super();
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getAdmdate() {
		return admdate;
	}
	public void setAdmdate(Date admdate) {
		this.admdate = admdate;
	}
	public Address getPerAddr() {
		return perAddr;
	}
	public void setPerAddr(Address perAddr) {
		this.perAddr = perAddr;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", admdate=" + admdate + ", perAddr=" + perAddr + "]";
	}
}