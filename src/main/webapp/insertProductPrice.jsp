<%@ page import="vn.edu.fit.iuh.models.Product" %>
<%@ page import="java.util.Optional" %>
<%@ page import="vn.edu.fit.iuh.services.ProductService" %>
<%@ page import="vn.edu.fit.iuh.models.ProductPrice" %>
<%@ page import="vn.edu.fit.iuh.services.ProductPriceService" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert Product Price</title>
    <%@include file="css.jsp" %>
</head>
<body>>
<div class ="container p-4">
    <div class="row" style="margin-top:10px;">
        <div class="content" style="height: 1090px; width: 960px; margin: auto">
            <div class="header">
                <h2 class="text-left" style="text-align: center">Insert Product Price</h2>
            </div>
            <div class="body" style="margin-top: 10px">
                <form action="controls?action=insertPP" method="post">

<%--                    <%--%>
<%--                        long id = Long.parseLong(request.getParameter("id"));--%>

<%--                        Optional<ProductPrice> p = new ProductPriceService().findById(id);--%>
<%--                    %>--%>
                    <label class="control-label col-xs-3">ID</label>
                    <input type="text" name="id" class="form-control">
<%--    value="<%=id%>">--%>

                    <label class="control-label col-xs-3">PriceDateTime</label>
                    <input type="text" name="pdt" class="form-control">

                    <label  class="control-label col-xs-3">Note</label>
                    <input type="text" name="note"  class="form-control">

                    <label class="control-label col-xs-3">Price</label>
                    <input type="text" name="price" class="form-control">


                    <button class="btn btn-group-justified"
                            type="submit"
                            style="color: white; margin-top: 10px; background-color: green; width: 100%;">
                        Add
                    </button>

                    <button class="btn btn-group-justified" name="submit1" id="Clear"
                            type="reset"
                            style="color: white; margin-top: 10px; background-color: green; width: 100%;">
                        Clear
                    </button>

                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
