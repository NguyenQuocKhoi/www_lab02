package vn.edu.fit.iuh.services;

import com.sun.tools.javac.Main;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import vn.edu.fit.iuh.enums.EmployeeStatus;
import vn.edu.fit.iuh.models.Employee;
import vn.edu.fit.iuh.repositories.EmployeeRepository;


public class EmployeeService {

  private EmployeeRepository repository;

  public EmployeeService() {
    repository = new EmployeeRepository();
  }

  public void insertEmp(Employee employee) {
    repository.insertEmp(employee);
  }

  public Optional<Employee> findById(long id) {
    return repository.findById(id);
  }


  public void update(Employee employee) {
    repository.update(employee);
  }

  public boolean delete(long id) {
    Optional<Employee> op = findById(id);
    if (op.isPresent()) {
      Employee employee = op.get();
      employee.setStatus(EmployeeStatus.TERMINATED);
      repository.update(employee);
      return true;
    }
    return false;
  }

  public boolean activeEmp(long id) {
    Optional<Employee> op = findById(id);
    if (op.isPresent()) {
      Employee employee = op.get();
      employee.setStatus(EmployeeStatus.ACTIVE);
      return
          true;
    }
    return false;
  }

  public List<Employee> getAll() {
    return repository.getAllEmp();
  }
  

}

