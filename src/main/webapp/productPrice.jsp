<%@ page import="java.util.List" %>
<%@ page import="vn.edu.fit.iuh.models.Employee" %>
<%@ page import="vn.edu.fit.iuh.services.EmployeeService" %>
<%@ page import="vn.edu.fit.iuh.models.Product" %>
<%@ page import="vn.edu.fit.iuh.services.ProductService" %>
<%@ page import="vn.edu.fit.iuh.models.ProductPrice" %>
<%@ page import="vn.edu.fit.iuh.services.ProductPriceService" %><%--
  Created by IntelliJ IDEA.
  User: quockhoi
  Date: 27/09/2023
  Time: 2:05 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Price</title>
    <%@include file="css.jsp" %>
</head>
<body>
<%
    //  List<Employee> list = (List<Employee>) session.getAttribute("emp_list");
//    List<Employee> list = (List<Employee>) request.getAttribute("emp_list");
    List<ProductPrice> list = new ProductPriceService().getAll();
%>
<div class="col-xs-12" style="height: 1090px; width: 960px; margin: auto;">
    <h4 style="text-align:center;"> Danh sách ProductPrice </h4>
    <table class="table table-striped" role="table">
        <form action="" method="post">
            <tr>
                <th>PriceDateTime</th>
                <th>Note</th>
                <th>Price</th>
                <th>ID</th>
                <th></th>
<%--                <th><a href="insertProductPrice.jsp">Add Product Price</a></th>--%>
            </tr>
            <tbody>
            <%for (ProductPrice productPrice : list) {%>
            <tr>
                <td><%=productPrice.getPriceDateTime()%>
                </td>
                <td><%=productPrice.getNote()%>
                </td>
                <td><%=productPrice.getPrice()%>
                </td>
                <td><%=productPrice.getProduct().getId()%>
                </td>
                <td><a href="insertProductPrice.jsp?id"<%=productPrice.getProduct().getId()%>>Add Product Price</a></td>
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
