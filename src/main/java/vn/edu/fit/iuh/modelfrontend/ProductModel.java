package vn.edu.fit.iuh.modelfrontend;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import vn.edu.fit.iuh.enums.EmployeeStatus;
import vn.edu.fit.iuh.enums.ProductStatus;
import vn.edu.fit.iuh.models.Employee;
import vn.edu.fit.iuh.models.Product;
import vn.edu.fit.iuh.services.ProductService;

public class ProductModel {
private final ProductService productService = new ProductService();
  public void insert(HttpServletRequest request, HttpServletResponse response) throws IOException, InterruptedIOException {
    String des = request.getParameter("description");
    String mn = request.getParameter("mn");
    String name = request.getParameter("name");
    String unit = request.getParameter("unit");

    Product p = new Product(des, mn, name, ProductStatus.ACTIVE, unit);
    productService.insert(p);
    response.sendRedirect("product.jsp");
  }


  public void update(HttpServletRequest request, HttpServletResponse response) throws  Exception{

    long id = Long.parseLong(request.getParameter("id"));
    String des = request.getParameter("description");
    String mn = request.getParameter("mn");
    String name = request.getParameter("name");
    String unit = request.getParameter("unit");

    Product p = new Product(id, des, mn, name, ProductStatus.ACTIVE, unit);
    productService.update(p);
    response.sendRedirect("product.jsp");
  }


  public void delete(HttpServletRequest req, HttpServletResponse response)  throws  Exception{
    long id = Long.parseLong(req.getParameter("id"));

    productService.delete(id);
    response.sendRedirect("product.jsp");
  }
}
