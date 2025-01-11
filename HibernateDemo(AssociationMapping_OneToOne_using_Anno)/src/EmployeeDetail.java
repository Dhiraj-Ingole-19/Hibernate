import javax.persistence.*;

@Entity
@Table(name = "EmployeeDetail")
public class EmployeeDetail {

    @Id
    @Column(name = "empid", nullable = false)
    private int empid;

    @Column(name = "street", length = 100, nullable = false)
    private String street;

    @Column(name = "city", length = 50, nullable = false)
    private String city;

    @Column(name = "state", length = 50, nullable = false)
    private String state;

    @Column(name = "country", length = 50, nullable = false)
    private String country;

    @OneToOne
    @MapsId // This ensures shared primary key
    @JoinColumn(name = "empid")
    private Employee employee;

    // Constructors, getters, and setters
    public EmployeeDetail() {}

    public EmployeeDetail(String street, String city, String state, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public int getEmpid() {
        return empid;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "EmployeeDetail [street=" + street + ", city=" + city + ", state=" + state
                + ", country=" + country + "]";
    }
}
