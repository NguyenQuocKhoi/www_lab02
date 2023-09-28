package vn.edu.fit.iuh.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "product_price")
public class ProductPrice implements Serializable {

  @Id
  @Column(name = "price_date_time", columnDefinition = "datetime(6)")
  private LocalDateTime priceDateTime;

  @Column(columnDefinition = "varchar(255)")
  private String note;

  @Column(nullable = false)
  private double price;


  @ManyToOne
  @JoinColumn(name = "product_id")
  private Product product;

  public ProductPrice() {
  }
}
