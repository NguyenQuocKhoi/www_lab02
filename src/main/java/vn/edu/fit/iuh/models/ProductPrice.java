package vn.edu.fit.iuh.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "product_price")
@NamedQueries({
    @NamedQuery(name = "ProductPrice.findAll",
        query = "select pr from  ProductPrice pr")})
public class ProductPrice implements Serializable {

  @Id
  @Column(name = "price_date_time")
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

  public ProductPrice(LocalDateTime priceDateTime, String note, double price, Product product) {
    this.priceDateTime = priceDateTime;
    this.note = note;
    this.price = price;
    this.product = product;
  }

  public ProductPrice(LocalDateTime priceDateTime, String note, double price) {
    this.priceDateTime = priceDateTime;
    this.note = note;
    this.price = price;
  }

  public LocalDateTime getPriceDateTime() {
    return priceDateTime;
  }

  public void setPriceDateTime(LocalDateTime priceDateTime) {
    this.priceDateTime = priceDateTime;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }
}
