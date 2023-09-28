<%@ page import="java.util.List" %>
<%@ page import="vn.edu.fit.iuh.models.Employee" %>
<%@ page import="vn.edu.fit.iuh.services.EmployeeService" %>
<%@ page import="vn.edu.fit.iuh.models.Product" %>
<%@ page import="vn.edu.fit.iuh.services.ProductService" %><%--
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
</head>
<body>
<%
    //  List<Employee> list = (List<Employee>) session.getAttribute("emp_list");
//    List<Employee> list = (List<Employee>) request.getAttribute("emp_list");
    List<Product> list = new ProductService().getAll();
%>
<div class="col-xs-12" style="height: 1090px; width: 960px; margin: auto;">
    <h4 style="text-align:center;">Danh sách Product</h4>
    <table class="table table-striped" role="table">
        <form action="controls?action=insertP" method="post">
            <tr>
                <th>ID</th>
                <th>Description</th>
                <th>Manufacturer Name</th>
                <th>Name</th>
                <th>Status</th>
                <th>Unit</th>
                <th colspan="2"><a href="insertProduct.jsp">Insert</a></th>
            </tr>
            <tbody>
            <%for (Product product : list) {%>
            <tr>

                <td><%=product.getId()%>
                </td>
                <td><%=product.getDescription()%>
                </td>
                <td><%=product.getManufacturerName()%>
                </td>
                <td><%=product.getName()%>
                </td>
                <td><%=product.getProductStatus()%>
                </td>
                <td><%=product.getUnit()%>
                </td>
                <td><a href="updateProduct.jsp?id=<%=product.getId()%>">Update</a></td>
                <td><a href="controls?action=delete_p&id=<%=product.getId()%>">Delete</a></td>
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
