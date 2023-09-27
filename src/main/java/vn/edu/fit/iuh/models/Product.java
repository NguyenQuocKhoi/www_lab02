package vn.edu.fit.iuh.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Set;
import vn.edu.fit.iuh.enums.ProductStatus;
import vn.edu.fit.iuh.models.ProductImage;
import vn.edu.fit.iuh.models.ProductPrice;


@Entity
@Table(name = "product")
public class Product implements Serializable {

  @Id
  @Column(name = "product_id", columnDefinition = "bigint(20)")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "name", columnDefinition = "varchar(150)", nullable = false)
  private String name;

  @Column(name = "description", columnDefinition = "varchar(250)", nullable = false)
  private String description;

  @Column(name = "unit", columnDefinition = "varchar(25)", nullable = false)
  private String unit;

  @Column(name = "manufacturer_name", columnDefinition = "varchar(100)", nullable = false)
  private String manufacturerName;

  @Column(name = "status")
  private ProductStatus productStatus;

  @OneToMany(mappedBy = "product")
  private Set<ProductImage> productImages;


  @OneToMany(mappedBy = "product")
  private Set<ProductPrice> productPrices;

  public Product() {
  }
}
