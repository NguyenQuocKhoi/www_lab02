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
//@NamedQueries(value = {
//    @NamedQuery(
//        name = "ProductPrice.getPriceByProductId",
//        query = "select price from ProductPrice where product.id=:id"
//    )
//})
public class ProductPrice implements Serializable {

  @ManyToOne
  @JoinColumn(name = "product_id")
  private Product product;
  @Id
  @Column(name = "price_date_time")
  private LocalDateTime priceDateTime;
  private double price;
  private String note;

  public ProductPrice() {
  }

  public ProductPrice(Product product, LocalDateTime priceDateTime, double price, String note) {
    this.product = product;
    this.priceDateTime = priceDateTime;
    this.price = price;
    this.note = note;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public LocalDateTime getPriceDateTime() {
    return priceDateTime;
  }

  public void setPriceDateTime(LocalDateTime priceDateTime) {
    this.priceDateTime = priceDateTime;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }
}
