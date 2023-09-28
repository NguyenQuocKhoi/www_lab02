package vn.edu.fit.iuh.services;

import java.util.List;
import java.util.Optional;
import vn.edu.fit.iuh.models.Customer;
import vn.edu.fit.iuh.repositories.CustomerRepository;

public class CustomerService {

  private CustomerRepository customerRepository;

  public CustomerService() {
    customerRepository = new CustomerRepository();
  }

  public void insertCust(Customer customer) {
    customerRepository.insertCus(customer);
  }

  public void updateCust(Customer customer) {
    customerRepository.updateCus(customer);
  }

  public Optional<Customer> findById(long id) {
    return customerRepository.findById(id);

  }

  public List<Customer> getAll() {
   return customerRepository.getAllCustomer();

  }

}
