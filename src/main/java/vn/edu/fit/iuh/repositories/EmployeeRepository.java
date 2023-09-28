package vn.edu.fit.iuh.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;
import vn.edu.fit.iuh.enums.EmployeeStatus;
import vn.edu.fit.iuh.models.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class EmployeeRepository {

  private EntityManager em;
  private EntityTransaction trans;
  private final Logger logger =
      LoggerFactory.getLogger(this.getClass().getName());
  public EmployeeRepository() {
    em = Persistence.createEntityManagerFactory("lab_week_2")
        .createEntityManager();
    trans = em.getTransaction();
  }

  public void insertEmp(Employee employee) {
    try {
      trans.begin();
      em.persist(employee);
      trans.commit();
    } catch (Exception ex) {
      trans.rollback();
      logger.error(ex.getMessage());
    }
  }

  public void setStatus(Employee employee, EmployeeStatus employeeStatus) {
    employee.setStatus(employeeStatus);
  }

  public void update(Employee employee) {
    try {
      trans.begin();
      em.merge(employee);
      trans.commit();
    } catch (Exception ex) {
      trans.rollback();
      logger.error(ex.getMessage());
    }
  }

  public Optional<Employee> findById(long id) {
    TypedQuery<Employee> query = em.createQuery("SELECT e FROM Employee e WHERE e.id = :id",
        Employee.class);
    query.setParameter("id", id);
    Employee emp = query.getSingleResult();
    return emp == null ? Optional.empty() : Optional.of(emp);

  }

  public List<Employee> getAllEmp() {
    return em.createNamedQuery("Employee.findAll", Employee.class).setParameter(1, EmployeeStatus.ACTIVE)
        .getResultList();
  }
}
