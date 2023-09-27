package vn.edu.fit.iuh.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {

  @Id
  @Column(name = "cust_id", columnDefinition = "BIGINT(20)")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column(name = "cust_name", nullable = false, columnDefinition = "VARCHAR(150)")
  private String custName;
  @Column(name = "email", nullable = false, columnDefinition = "VARCHAR(150)")
  private String email;
  @Column(name = "phone", nullable = false, columnDefinition = "VARCHAR(15)")
  private String phone;
  @Column(name = "address", nullable = false, columnDefinition = "VARCHAR(250)")
  private String address;

  @OneToMany(mappedBy = "customer")
  private Set<Orders> orders;

  public Customer() {
  }


}
