import java.util.Date;

import javax.persistence.*;
@Entity
@Table(name = " PrimaryStudent")
@PrimaryKeyJoinColumn(name="rollNO")

public class PrimaryStudent extends Student {

	public PrimaryStudent(int rollNo, String name, Date admdate, Address perAddr, String grade) {
		super(rollNo, name, admdate, perAddr);
		this.grade = grade;
	}

	@Column(name="Grade" ,length=5)
    String grade;

	public PrimaryStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PrimaryStudent(int rollNo, String name, Date admdate, Address perAddr) {
		super(rollNo, name, admdate, perAddr);
		// TODO Auto-generated constructor stub
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "PrimaryStudent [grade=" + grade + ", rollNo=" + rollNo + ", name=" + name + ", admdate=" + admdate
				+ ", perAddr=" + perAddr + "]";
	}
	

	

}