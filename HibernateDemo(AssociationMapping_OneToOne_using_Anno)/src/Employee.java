import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_seq")
    @SequenceGenerator(name = "employee_seq", sequenceName = "employee_sequence", allocationSize = 1)
    @Column(name = "empid", nullable = false)
    private int empid;

    @Column(name = "first_name", length = 50, nullable = false)
    private String fristname;

    @Column(name = "last_name", length = 50, nullable = false)
    private String lastname;

    @Column(name = "birth_date", length = 10, nullable = false)
    private String birthDate;

    @Column(name = "cell_phone", length = 15, nullable = false)
    private String cellphone;

    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
    private EmployeeDetail employeeDetail;

    // Constructors, getters, and setters
    public Employee() {}

    public Employee(String fristname, String lastname, String birthDate, String cellphone) {
        this.fristname = fristname;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.cellphone = cellphone;
    }

    public int getEmpid() {
        return empid;
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

    public EmployeeDetail getEmployeeDetail() {
        return employeeDetail;
    }

    public void setEmployeeDetail(EmployeeDetail employeeDetail) {
        this.employeeDetail = employeeDetail;
        employeeDetail.setEmployee(this); // Bidirectional link
    }

    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", fristname=" + fristname + ", lastname=" + lastname + ", birthDate="
                + birthDate + ", cellphone=" + cellphone + "]";
    }
}
