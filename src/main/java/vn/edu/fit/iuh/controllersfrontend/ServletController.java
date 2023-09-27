package vn.edu.fit.iuh.controllersfrontend;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import vn.edu.fit.iuh.modelfrontend.EmployeeModel;

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
          EmployeeModel employeeModel = new EmployeeModel();
          employeeModel.listing(req, resp);
        }

      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
