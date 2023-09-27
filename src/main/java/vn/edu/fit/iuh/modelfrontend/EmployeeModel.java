package vn.edu.fit.iuh.modelfrontend;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import vn.edu.fit.iuh.enums.EmployeeStatus;
import vn.edu.fit.iuh.models.Employee;
import vn.edu.fit.iuh.services.EmployeeService;

public class EmployeeModel {
  private final EmployeeService service = new EmployeeService();
  public Object insertEmp(HttpServletRequest request, HttpServletResponse response)
      throws IOException, InterruptedIOException {
    String name = request.getParameter("name");
    String s_dob = request.getParameter("dob");
    String phone = request.getParameter("phone");
    String email = request.getParameter("email");
    String address = request.getParameter("address");

    DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate dob = LocalDate.parse(s_dob, df);

    Employee e = new Employee(name, dob, email, phone, address, EmployeeStatus.IN_ACTIVE);

    service.insertEmp(e);
    return e;

  }

  public void listing(HttpServletRequest req, HttpServletResponse resp) throws Exception{
     List<Employee> list = service.getAll();
    HttpSession session = req.getSession(true);
    session.setAttribute("emp_list", list);
    resp.sendRedirect("employee.jsp");
  }
}
