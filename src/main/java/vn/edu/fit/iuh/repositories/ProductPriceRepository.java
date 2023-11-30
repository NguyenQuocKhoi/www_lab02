//package vn.edu.fit.iuh.repositories;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Persistence;
//import jakarta.persistence.TypedQuery;
//import java.util.List;
//import java.util.Optional;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import vn.edu.fit.iuh.models.Product;
//import vn.edu.fit.iuh.models.ProductPrice;
//
//public class ProductPriceRepository {
//
//  private EntityManager em;
//  private EntityTransaction trans;
//  private final Logger logger =
//      LoggerFactory.getLogger(this.getClass().getName());
//
//  public ProductPriceRepository() {
//    em = Persistence.createEntityManagerFactory("lab_week_2")
//        .createEntityManager();
//    trans = em.getTransaction();
//  }
//
//  public void insert(ProductPrice productPrice) {
//    try {
//      trans.begin();
//      em.persist(productPrice);
//      trans.commit();
//    } catch (Exception e) {
//      trans.rollback();
//      e.printStackTrace();
//    }
//  }
//
////  public List<ProductPrice> getAll() {
////    return em.createNamedQuery("ProductPrice.findAll", ProductPrice.class)
////        .getResultList();
////  }
//
//  public Optional<ProductPrice> findById(long id) {
//    TypedQuery<ProductPrice> query = em.createQuery("SELECT ProductPrice.priceDateTime, ProductPrice .note,ProductPrice .price,ProductPrice.product.id\n"
//            + " FROM ProductPrice INNER JOIN Product ON  ProductPrice.product.id = Product.id WHERE ProductPrice.product.id = :id",
//        ProductPrice.class);
//    query.setParameter("id", id);
//    ProductPrice pp = query.getSingleResult();
//    return pp == null ? Optional.empty() : Optional.of(pp);
//
//  }
//
//  public Double getPrice(long productId){
//    return em.createNamedQuery("ProductPrice.getPriceByProductId",Double.class)
//        .setParameter("id",productId)
//        .getSingleResult();
//  }
//
//}
