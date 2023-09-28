<%@ page import="java.util.Optional" %>
<%@ page import="vn.edu.fit.iuh.models.Customer" %>
<%@ page import="vn.edu.fit.iuh.services.CustomerService" %>
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
                <h2 class="text-left" style="text-align: center">Update Customer</h2>
            </div>
            <div class="body" style="margin-top: 10px">
                <form action="controls?action=updateCus" method="post">
                    <%
                        long id = Long.parseLong(request.getParameter("id"));
                        Optional<Customer> customer = new CustomerService().findById(id);
                    %>

                    <label class="control-label col-xs-3">ID</label>
                    <input type="text" name="id" class="form-control"
                           value="<%=id%>">


                    <label  class="control-label col-xs-3">Address</label>
                    <input type="text" name="address" class="form-control"
                    value="<%=customer.get().getAddress()%>">


                    <label class="control-label col-xs-3">Name</label>
                    <input type="text" name="name" class="form-control" value="<%=customer.get().getCustName()%>">

                    <label class="control-label col-xs-3">Email</label>
                    <input type="text" name="email" class="form-control"
                           value="<%=customer.get().getEmail()%>">

                    <label  class="control-label col-xs-3">Phone</label>
                    <input type="text" name="phone" class="form-control"
                           value="<%=customer.get().getPhone()%>">

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
