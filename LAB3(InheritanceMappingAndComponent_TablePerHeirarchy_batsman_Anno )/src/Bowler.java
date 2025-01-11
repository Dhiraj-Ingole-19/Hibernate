import javax.persistence.*;
@Entity
@DiscriminatorValue(value="Bowler"  )

public class Bowler extends Player {

	@Column(name="Wickets" ,length=10)
	int wickets;


	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public Bowler(int pid, String name, double mcount, Address addr, int wickets) {
		super(pid, name, mcount, addr);
		this.wickets = wickets;
	}


	public Bowler() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bowler [wickets=" + wickets + ", pid=" + pid + ", name=" + name + ", mcount=" + mcount + ", addr="
				+ addr + "]";
	}


	
}