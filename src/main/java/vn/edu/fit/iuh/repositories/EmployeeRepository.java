package vn.edu.fit.iuh.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;
import vn.edu.fit.iuh.enums.EmployeeStatus;
import vn.edu.fit.iuh.models.Employee;


public class EmployeeRepository {

  private EntityManager em;

  public EmployeeRepository() {
    em = Persistence.createEntityManagerFactory("lab_week_2")
        .createEntityManager();
  }

  public void insertEmp(Employee employee) {
    em.persist(employee);
  }

  public void setStatus(Employee employee, EmployeeStatus employeeStatus) {
    employee.setStatus(employeeStatus);
  }

  public void update(Employee employee) {
    em.merge(employee);
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
