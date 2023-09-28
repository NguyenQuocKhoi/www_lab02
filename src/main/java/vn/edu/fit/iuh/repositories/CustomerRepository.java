package vn.edu.fit.iuh.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.edu.fit.iuh.models.Customer;

public class CustomerRepository {

  private EntityManager cus;
  private EntityTransaction trans;

  private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

  public CustomerRepository() {
    cus = Persistence.createEntityManagerFactory("lab_week_2").createEntityManager();
    trans = cus.getTransaction();
  }

  public void insertCus(Customer customer) {
    try {
      trans.begin();
      cus.persist(customer);
      trans.commit();
    } catch (Exception e) {
      trans.rollback();
      logger.error(e.getMessage());
    }
  }

  public void updateCus(Customer customer) {
    try {
      trans.begin();
      cus.merge(customer);
      trans.commit();
    } catch (Exception e) {
      trans.rollback();
      logger.error(e.getMessage());
    }
  }

  public Optional<Customer> findById(long id) {
    TypedQuery<Customer> query = cus.createQuery("select c From Customer c where  c.id = :id",
        Customer.class);
    query.setParameter("id", id);
    Customer customer = query.getSingleResult();
    return customer == null ? Optional.empty() : Optional.of(customer);
  }

  public List<Customer> getAllCustomer() {
    return cus.createNamedQuery("Customer.findAll", Customer.class).getResultList();
  }


}
