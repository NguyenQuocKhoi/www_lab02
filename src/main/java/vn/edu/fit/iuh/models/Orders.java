package vn.edu.fit.iuh.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@NamedQueries(@NamedQuery(
    name = "order.findAll", query = "select o from Orders o"
))
public class Orders implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "order_id")

  private long id;

  @Column(name = "order_date", columnDefinition = "DATETIME(6)")
  private LocalDateTime orderDate;
  @ManyToOne
  @JoinColumn(name = "emp_id")
  private Employee employee;

  @ManyToOne
  @JoinColumn(name = "cust_id")
  private Customer customer;


  public Orders() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public LocalDateTime getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(LocalDateTime orderDate) {
    this.orderDate = orderDate;
  }

  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }
}
