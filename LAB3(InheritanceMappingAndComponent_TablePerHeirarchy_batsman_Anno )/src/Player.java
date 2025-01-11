import javax.persistence.*;
@Entity
@Table(name="Player")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="PType" ,discriminatorType =DiscriminatorType.STRING,length = 10)
@DiscriminatorValue(value="player"  )

public class Player {
	@Id
	@GeneratedValue
	@Column(name="pid" ,length=3)
	int pid;
	@Column(name="name",length = 10)
	String name;
	@Column(name="mcount",length=10)
	double mcount;
	@Embedded
	Address addr;
	public Player(int pid, String name, double mcount, Address addr) {
		super();
		this.pid = pid;
		this.name = name;
		this.mcount = mcount;
		this.addr = addr;
	}
	public Player() {
		super();

	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMcount() {
		return mcount;
	}
	public void setMcount(double mcount) {
		this.mcount = mcount;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Player [pid=" + pid + ", name=" + name + ", mcount=" + mcount + ", addr=" + addr + "]";
	}
}