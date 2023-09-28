package vn.edu.fit.iuh.controllersfrontend;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import vn.edu.fit.iuh.modelfrontend.CustomerModel;
import vn.edu.fit.iuh.modelfrontend.EmployeeModel;
import vn.edu.fit.iuh.modelfrontend.ProductModel;

@WebServlet("/controls")
public class ServletController extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    try {
      Object actionObject = req.getParameter("action");
      if (actionObject != null) {
        String action = actionObject.toString();
        if (action.equals("insertEmp")) {
          EmployeeModel employeeModel = new EmployeeModel();
          employeeModel.insertEmp(req, resp);
        } else if (action.equals("insertCus")) {
          CustomerModel customerModel = new CustomerModel();
          customerModel.insertCus(req, resp);
        } else if (action.equals("update_emp")) {
          EmployeeModel employeeModel = new EmployeeModel();
          employeeModel.update(req, resp);
        } else if (action.equals("updateCus")) {
          CustomerModel customerModel = new CustomerModel();
          customerModel.updateCus(req, resp);
        } else if (action.equals("insertP")) {
          ProductModel productModel = new ProductModel();
          productModel.insert(req, resp);
        } else if (action.equals("updateP")) {
          ProductModel productModel = new ProductModel();
          productModel.update(req, resp);
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    try {
      Object actionObject = req.getParameter("action");
      if (actionObject != null) {
        String action = actionObject.toString();
        if (action.equals("emp_list")) {
//         resp.sendRedirect("employee.jsp");
//          EmployeeModel employeeModel = new EmployeeModel();
//          employeeModel.listing(req, resp);
          resp.sendRedirect("employee.jsp");
        } else if (action.equals("cus_list")) {
          resp.sendRedirect("customer.jsp");
        } else if (action.equals("p_list")) {
          resp.sendRedirect("product.jsp");
        } else if (action.equals("delete_emp")) {
          EmployeeModel employeeModel = new EmployeeModel();
          employeeModel.delete(req, resp);
        } else if (action.equals("delete_p")) {
          ProductModel productModel = new ProductModel();
          productModel.delete(req, resp);
        }

      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
