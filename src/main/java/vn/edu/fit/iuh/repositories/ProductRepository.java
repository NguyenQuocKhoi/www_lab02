package vn.edu.fit.iuh.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import vn.edu.fit.iuh.enums.ProductStatus;

import vn.edu.fit.iuh.models.Product;

public class ProductRepository {

  private EntityManager p;
  private EntityTransaction trans;
  private final Logger logger =
      LoggerFactory.getLogger(this.getClass().getName());

  public ProductRepository() {
    p = Persistence.createEntityManagerFactory("lab_week_2")
        .createEntityManager();
    trans = p.getTransaction();
  }

  public void insertP(Product product) {
    try {
      trans.begin();
      p.persist(product);
      trans.commit();
    } catch (Exception ex) {
      trans.rollback();
      logger.error(ex.getMessage());
    }
  }

  public void setStatus(Product product, ProductStatus productStatus) {
    product.setProductStatus(productStatus);
  }

  public void update(Product product) {
    try {
      trans.begin();
      p.merge(product);
      trans.commit();
    } catch (Exception ex) {
      trans.rollback();
      logger.error(ex.getMessage());
    }
  }

  public Optional<Product> findById(long id) {
    TypedQuery<Product> query = p.createQuery("SELECT p FROM Product p WHERE p.id = :id",
        Product.class);
    query.setParameter("id", id);
    Product p = query.getSingleResult();
    return p == null ? Optional.empty() : Optional.of(p);

  }

  public List<Product> getAllP() {
    return p.createNamedQuery("Product.findAll", Product.class)
        .setParameter(1, ProductStatus.ACTIVE)
        .getResultList();
  }
}
