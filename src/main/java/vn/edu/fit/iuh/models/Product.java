package vn.edu.fit.iuh.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Set;
import vn.edu.fit.iuh.enums.ProductStatus;
import vn.edu.fit.iuh.models.ProductImage;
import vn.edu.fit.iuh.models.ProductPrice;


@Entity
@Table(name = "product")
@NamedQueries(@NamedQuery(
    name = "Product.findAll",
    query = "select p from Product p where p.status = ?1"))
//    query = "select  p from  Product  p"))
public class Product implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "product_id")

  private long id;

  @Column(name = "name", columnDefinition = "varchar(150)", nullable = false)
  private String name;

  @Column(name = "description", columnDefinition = "varchar(250)", nullable = false)
  private String description;

  @Column(name = "unit", columnDefinition = "varchar(25)", nullable = false)
  private String unit;

  @Column(name = "manufacturer_name", columnDefinition = "varchar(100)", nullable = false)
  private String manufacturerName;

  @Column(name = "status", nullable = false)
  @Enumerated(EnumType.ORDINAL)
  private ProductStatus status;

  @OneToMany(mappedBy = "product")
  private Set<ProductImage> productImages;


  @OneToMany(mappedBy = "product")
  private Set<ProductPrice> productPrices;

  public Product() {
  }

  public Product(long id, String description, String manufacturerName, String name,
      ProductStatus status, String unit
  ) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.unit = unit;
    this.manufacturerName = manufacturerName;
    this.status = status;
  }

  public Product(String description, String manufacturerName, String name,
      ProductStatus status, String unit) {
    this.name = name;
    this.description = description;
    this.unit = unit;
    this.manufacturerName = manufacturerName;
    this.status = status;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public String getManufacturerName() {
    return manufacturerName;
  }

  public void setManufacturerName(String manufacturerName) {
    this.manufacturerName = manufacturerName;
  }

  public ProductStatus getProductStatus() {
    return status;
  }

  public void setProductStatus(ProductStatus status) {
    this.status = status;
  }

  public Set<ProductImage> getProductImages() {
    return productImages;
  }

  public void setProductImages(Set<ProductImage> productImages) {
    this.productImages = productImages;
  }

  public Set<ProductPrice> getProductPrices() {
    return productPrices;
  }

  public void setProductPrices(Set<ProductPrice> productPrices) {
    this.productPrices = productPrices;
  }
}
