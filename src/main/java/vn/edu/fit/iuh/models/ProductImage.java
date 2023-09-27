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

@Entity
@Table(name = "product_image")
public class ProductImage implements Serializable {
  @Id
  @Column(name = "image_id", columnDefinition = "bigint(20)")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(columnDefinition = "varchar(250)", nullable = false)
  private String path;

  @Column(columnDefinition = "varchar(250)")
  private String alternative;

  @ManyToOne
  @JoinColumn(name = "product_id")
  private Product product;

  public ProductImage() {
  }
}
