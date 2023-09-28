<%@ page import="vn.edu.fit.iuh.models.Product" %>
<%@ page import="java.util.Optional" %>
<%@ page import="vn.edu.fit.iuh.services.ProductService" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert Employee</title>
    <%@include file="css.jsp" %>
</head>
<body>>
<div class ="container p-4">
    <div class="row" style="margin-top:10px;">
        <div class="content" style="height: 1090px; width: 960px; margin: auto">
            <div class="header">
                <h2 class="text-left" style="text-align: center">Insert Product</h2>
            </div>
            <div class="body" style="margin-top: 10px">
                <form action="controls?action=updateP" method="post">

                    <%
                        long id = Long.parseLong(request.getParameter("id"));

                        Optional<Product> p = new ProductService().findById(id);
                    %>
                    <label class="control-label col-xs-3">ID</label>
                    <input type="text" name="id" class="form-control" value="<%=id%>">

                    <label class="control-label col-xs-3">Description</label>
                    <input type="text" name="description" class="form-control"
                    value="<%=p.get().getDescription()%>">

                    <label  class="control-label col-xs-3">Manufacturer Name</label>
                    <input type="text" name="mn"  class="form-control"
                           value="<%=p.get().getManufacturerName()%>">

                    <label class="control-label col-xs-3">Name</label>
                    <input type="text" name="name" class="form-control"
                           value="<%=p.get().getName()%>">

                    <label class="control-label col-xs-3">Unit</label>
                    <input type="text" name="unit" class="form-control"
                           value="<%=p.get().getUnit()%>">

                    <button class="btn btn-group-justified"
                            type="submit"
                            style="color: white; margin-top: 10px; background-color: green; width: 100%;">
                        Update
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
