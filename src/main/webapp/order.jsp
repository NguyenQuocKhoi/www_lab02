<%@ page import="java.util.List" %>
<%@ page import="vn.edu.fit.iuh.models.Employee" %>
<%@ page import="vn.edu.fit.iuh.services.EmployeeService" %>
<%@ page import="vn.edu.fit.iuh.models.Product" %>
<%@ page import="vn.edu.fit.iuh.services.ProductService" %>
<%@ page import="vn.edu.fit.iuh.models.Orders" %>
<%@ page import="vn.edu.fit.iuh.services.OrderService" %><%--
  Created by IntelliJ IDEA.
  User: quockhoi
  Date: 27/09/2023
  Time: 2:05 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
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
    List<Orders> list = new OrderService().findAll();
%>
<div class="col-xs-12" style="height: 1090px; width: 960px; margin: auto;">
    <h4 style="text-align:center;">Danh sách Order</h4>
    <table class="table table-striped" role="table">

            <tr>
                <th>Order Date</th>
                <th>Employee Name</th>
                <th>Customer Name</th>
            </tr>
            <tbody>
            <%for (Orders o : list) {%>
            <tr>
                <td><%=o.getOrderDate()%>
                </td>
                <td><%=o.getEmployee().getFullName()%>
                </td>
                <td><%=o.getCustomer().getCustName()%>
                </td>
                <%
                    }
                %>
            </tr>

            </tbody>
    </table>
</div>
</body>
</html>
