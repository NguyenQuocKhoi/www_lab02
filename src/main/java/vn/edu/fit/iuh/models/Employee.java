package vn.edu.fit.iuh.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.joda.ser.LocalDateSerializer;
import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;
import vn.edu.fit.iuh.enums.EmployeeStatus;


@Entity
@Table(name = "employee")
@NamedQueries(
      @NamedQuery(name = "Employee.findAll",
    query = "select e from Employee e where e.status = ?1"))
public class Employee implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "emp_id")
  private long id;

  @Column(name = "full_name", nullable = false, columnDefinition = "VARCHAR(150)")
  private String fullName;
  @Column(name = "dob", nullable = false)
  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd")
  @JsonSerialize(using = LocalDateSerializer.class)
  private LocalDate dob;
  @Column(name = "email", nullable = false, columnDefinition = "VARCHAR(150)")
  private String email;
  @Column(name = "address", nullable = false, columnDefinition = "VARCHAR(250)")
  private String address;

  @Column(name = "phone", nullable = false, columnDefinition = "VARCHAR(250)")
  private String phone;
  @Column(name = "status", nullable = false)
  @Enumerated(EnumType.ORDINAL)
  private EmployeeStatus status;

  @OneToMany(mappedBy = "employee")

  private Set<Orders> orders;



  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public EmployeeStatus getStatus() {
    return status;
  }

  public void setStatus(EmployeeStatus status) {
    this.status = status;
  }

  public Set<Orders> getOrders() {
    return orders;
  }

  public void setOrders(Set<Orders> orders) {
    this.orders = orders;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Employee() {
  }

  public Employee(String fullName, LocalDate dob, String email, String address, String phone,
      EmployeeStatus status) {
    this.fullName = fullName;
    this.dob = dob;
    this.email = email;
    this.address = address;
    this.phone = phone;
    this.status = status;
  }

  public Employee(String fullName, LocalDate dob, String email, String address, String phone) {
    this.fullName = fullName;
    this.dob = dob;
    this.email = email;
    this.address = address;
    this.phone = phone;
  }

  public Employee(long id, String fullName, LocalDate dob, String email, String address,
      String phone,
      EmployeeStatus status) {
    this.id = id;
    this.fullName = fullName;
    this.dob = dob;
    this.email = email;
    this.address = address;
    this.phone = phone;
    this.status = status;
  }
}
