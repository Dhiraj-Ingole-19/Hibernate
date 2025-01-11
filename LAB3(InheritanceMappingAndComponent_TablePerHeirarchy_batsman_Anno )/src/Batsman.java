import javax.persistence.*;
@Entity
@DiscriminatorValue(value="Batsman"  )

public class Batsman extends Player {

	@Column(name="Runs" ,length=10)
	int runs ;

	public Batsman() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public Batsman(int pid, String name, double mcount, Address addr, int runs) {
		super(pid, name, mcount, addr);
		this.runs = runs;
	}

	@Override
	public String toString() {
		return "Batsman [runs=" + runs + ", pid=" + pid + ", name=" + name + ", mcount=" + mcount + ", addr=" + addr
				+ "]";
	}

	

}