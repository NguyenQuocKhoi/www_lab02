package vn.edu.fit.iuh.modelfrontend;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InterruptedIOException;
import vn.edu.fit.iuh.models.Customer;
import vn.edu.fit.iuh.services.CustomerService;

public class CustomerModel {

  private final CustomerService service = new CustomerService();

  public void insertCus(HttpServletRequest request, HttpServletResponse response)
      throws IOException, InterruptedIOException {

    String address = request.getParameter("address");
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String phone = request.getParameter("phone");

    Customer c = new Customer(address, name, email, phone);

    service.insertCust(c);
    response.sendRedirect("customer.jsp");
  }

  public void updateCus(HttpServletRequest request, HttpServletResponse response)
      throws IOException, InterruptedIOException {
  long id  = Long.parseLong(request.getParameter("id"));
    String address = request.getParameter("address");
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String phone = request.getParameter("phone");

    Customer c = new Customer(id, address, name, email, phone);

    service.updateCust(c);
    response.sendRedirect("customer.jsp");
  }
}
