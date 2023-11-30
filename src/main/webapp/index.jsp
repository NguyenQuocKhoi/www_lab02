<%@ page import="vn.edu.fit.iuh.services.ProductService" %>
<%@ page import="vn.edu.fit.iuh.models.Product" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <%@include file="css.jsp"%>
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
    </div>
</head>
<body>
<%--<div class="container p-4">--%>
<%--    <div class="row">--%>
<%--        <%--%>
<%--            ProductService productService = new ProductService();--%>
<%--            List<Product> products = productService.getAll();--%>
<%--//            ProductPriceService productPriceService = new ProductPriceService();--%>
<%--            for (Product p : products) {--%>
<%--        %>--%>
<%--        <div>--%>
<%--            <div>--%>
<%--                <div >--%>
<%--                    <h5><%=p.getName()%></h5>--%>
<%--&lt;%&ndash;                    <h6 class="price">Price: $<%= productPriceService.getPriceOfProduct(p.getId())%></h6>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <h6 class="category">Manufacturer name: <%=p.getManufacturerName() %></h6>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <h6 class="unit">Unit: <%=p.getUnit() %></h6>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <h6 class=""><%=p.getDescription()%></h6>&ndash;%&gt;--%>
<%--                    <div>--%>
<%--&lt;%&ndash;                        <a class="btn btn-dark" href="add-to-cart?id=<%=p.getId()%>">Add to Cart</a>&ndash;%&gt;--%>
<%--&lt;%&ndash;                        <a class="btn btn-primary" href="order-now?quantity=1&id=<%=p.getId()%>">Buy Now</a>&ndash;%&gt;--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--        <%--%>
<%--            }--%>
<%--        %>--%>
<%--    </div>--%>
<%--</div>--%>
</body>
</html>