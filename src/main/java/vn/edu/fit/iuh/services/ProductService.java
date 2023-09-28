package vn.edu.fit.iuh.services;

import java.util.List;
import java.util.Optional;
import vn.edu.fit.iuh.enums.ProductStatus;
import vn.edu.fit.iuh.models.Product;
import vn.edu.fit.iuh.repositories.ProductRepository;

public class ProductService {
  private ProductRepository repository;

  public ProductService() {

    repository = new ProductRepository();
  }

  public void insert(Product p) {
    repository.insertP(p);
  }

  public Optional<Product> findById(long id) {
    return repository.findById(id);
  }


  public void update(Product product) {
    repository.update(product);
  }

  public boolean delete(long id) {
    Optional<Product> op = findById(id);
    if (op.isPresent()) {
      Product product = op.get();
      product.setProductStatus(ProductStatus.TERMINATED);
      repository.update(product);
      return true;
    }
    return false;
  }

  public boolean activePro(long id) {
    Optional<Product> op = findById(id);
    if (op.isPresent()) {
      Product product = op.get();
      product.setProductStatus(ProductStatus.ACTIVE);
      return
          true;
    }
    return false;
  }

  public List<Product> getAll() {
    return repository.getAllP();
  }


}
