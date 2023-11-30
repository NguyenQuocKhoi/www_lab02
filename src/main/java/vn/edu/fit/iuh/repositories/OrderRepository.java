package vn.edu.fit.iuh.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.edu.fit.iuh.models.Orders;

public class OrderRepository {

  private EntityManager em;
  private EntityTransaction trans;
  private final Logger logger =
      LoggerFactory.getLogger(this.getClass().getName());
  public OrderRepository() {
    em = Persistence.createEntityManagerFactory("lab_week_2")
        .createEntityManager();
    trans = em.getTransaction();
  }

  public List<Orders> getAll(){
    return em.createNamedQuery("order.findAll",Orders.class).getResultList();
  }
}
