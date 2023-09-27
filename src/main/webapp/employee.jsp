<%@ page import="java.util.List" %>
<%@ page import="vn.edu.fit.iuh.models.Employee" %><%--
  Created by IntelliJ IDEA.
  User: quockhoi
  Date: 27/09/2023
  Time: 2:05 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="css.jsp" %>
</head>
<body>
<%
  List<Employee> list = (List<Employee>) session.getAttribute("emp_list");
%>
<div class="col-xs-12" style="height: 1090px; width: 960px; margin: auto;">
    <h4 style="text-align:center;">Danh sách các Account</h4>
    <table class="table table-striped" role="table">
        <form action="" method="post">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>DOB</th>
                <th>Email</th>
                <th>Address</th>
                <th>Phone</th>
                <th>Status</th>
                <th colspan="2"><a href="">Insert </a></th>
            </tr>
            <tbody>
            <tr>
                <%for(Employee employee: list){%>
                <td><%=employee.getId()%></td>
                <td><%=employee.getFullName()%></td>
                <td><%=employee.getDob()%></td>
                <td><%=employee.getEmail()%></td>
                <td><%=employee.getAddress()%></td>
                <td><%=employee.getPhone()%></td>
                <td><%=employee.getStatus()%></td>
                <td><a href="">Update</a></td>
                <td><a href="">Delete</a></td>
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
