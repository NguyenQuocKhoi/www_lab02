<%@ page import="java.util.List" %>
<%@ page import="vn.edu.fit.iuh.models.Employee" %>
<%@ page import="vn.edu.fit.iuh.services.EmployeeService" %><%--
  Created by IntelliJ IDEA.
  User: quockhoi
  Date: 27/09/2023
  Time: 2:05 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee</title>
    <%@include file="css.jsp" %>
    <div class="container">
        <div class="col-xs-12">
            <nav class="navbar navbar-expand-sm">
                <ul class="navbar nav">

                    <li class="navbar-item"><a href="controls?action=emp_list" class="navbar-link"
                                               style="margin-right: 20px; color: black; text-decoration: none"
                                               id="btn1">Employee</a>
                    </li>
                    <li class="navbar-item"><a href="controls?action=p_list" class="navbar-link" id="btn2"
                                               style="margin-right: 20px; color: black; text-decoration: none">Product</a>
                    </li>
                    <li class="navbar-item"><a href="controls?action=cus_list" class="navbar-link" id="btn4"
                                               style="margin-right: 20px; color: black; text-decoration: none">
                        Customer</a>
                    </li>

                    <li class="navbar-item"><a href="controls?action=order_list" class="navbar-link" id="btn5"
                                               style="margin-right: 20px; color: black; text-decoration: none">
                        Order</a>
                    </li>
                </ul>
            </nav>
        </div>
</head>
<body>
<%
    //  List<Employee> list = (List<Employee>) session.getAttribute("emp_list");
//    List<Employee> list = (List<Employee>) request.getAttribute("emp_list");
    List<Employee> list = new EmployeeService().getAll();
%>
<div class="col-xs-12" style="height: 1090px; width: 960px; margin: auto;">
    <h4 style="text-align:center;">Danh sách Employee</h4>
    <table class="table table-striped" role="table">
        <form action="controls?action=insertEmp" method="post">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>DOB</th>
                <th>Email</th>
                <th>Address</th>
                <th>Phone</th>
                <th>Status</th>
                <th colspan="2"><a href="insertEmployee.jsp">Insert</a></th>
            </tr>
            <tbody>
            <%for (Employee employee : list) {%>
            <tr>

                <td><%=employee.getId()%>
                </td>
                <td><%=employee.getFullName()%>
                </td>
                <td><%=employee.getDob()%>
                </td>
                <td><%=employee.getEmail()%>
                </td>
                <td><%=employee.getAddress()%>
                </td>
                <td><%=employee.getPhone()%>
                </td>
                <td><%=employee.getStatus()%>
                </td>
                <td><a href="updateEmployee.jsp?id=<%=employee.getId()%>">Update</a></td>
                <td><a href="controls?action=delete_emp&id=<%=employee.getId()%>">Delete</a></td>
                <%
                    }
                %>
            </tr>

            </tbody>


        </form>
    </table>
</div>
</body>
</html>
