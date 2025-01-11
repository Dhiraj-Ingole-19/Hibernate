import java.util.Date;

import javax.persistence.*;
@Entity
@Table(name = " SecondaryStudent")
@PrimaryKeyJoinColumn(name="rollNO")

public class SecondaryStudent extends Student {
	@Column(name="Percentage" ,length=5)
	float percentage;
	

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public SecondaryStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SecondaryStudent(int rollNo, String name, Date admdate, Address perAddr) {
		super(rollNo, name, admdate, perAddr);
		// TODO Auto-generated constructor stub
	}

	public SecondaryStudent(int rollNo, String name, Date admdate, Address perAddr, float percentage) {
		super(rollNo, name, admdate, perAddr);
		this.percentage = percentage;
	}

	
	@Override
	public String toString() {
		return "SecondaryStudent [percentage=" + percentage + ", rollNo=" + rollNo + ", name=" + name + ", admdate="
				+ admdate + ", perAddr=" + perAddr + "]";
	}

	
}