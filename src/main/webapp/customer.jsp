<%@ page import="java.util.List" %>
<%@ page import="vn.edu.fit.iuh.models.Employee" %>
<%@ page import="vn.edu.fit.iuh.services.EmployeeService" %>
<%@ page import="vn.edu.fit.iuh.models.Customer" %>
<%@ page import="vn.edu.fit.iuh.services.CustomerService" %><%--
  Created by IntelliJ IDEA.
  User: quockhoi
  Date: 27/09/2023
  Time: 2:05 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer</title>
    <%@include file="css.jsp" %>
</head>
<body>
<%
    List<Customer> list = new CustomerService().getAll();
%>
<div class="col-xs-12" style="height: 1090px; width: 960px; margin: auto;">
    <h4 style="text-align:center;">Danh sách Customer</h4>
    <table class="table table-striped" role="table">
        <form action="controls?action=insertCus" method="post">
            <tr>
                <th>ID</th>
                <th>Address</th>
                <th>Name</th>
                <th>Email</th>
                <th>Phone</th>
                <th colspan="2"><a href="insertCustomer.jsp">Insert</a></th>
            </tr>
            <tbody>
            <%for (Customer customer : list) {%>
            <tr>

                <td><%=customer.getId()%>
                </td>
                <td><%=customer.getAddress()%>
                </td>
                <td><%=customer.getCustName()%>
                </td>
                <td><%=customer.getEmail()%>
                </td>
                <td><%=customer.getPhone()%>
                </td>
                <td><a href="updateCustomer.jsp?id=<%=customer.getId()%>">Update</a></td>
<%--                <td><a href="controls?action=delete_emp&id=<%=customer.getId()%>">Delete</a></td>--%>
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
