<%@ page import="vn.edu.fit.iuh.services.EmployeeService" %>
<%@ page import="vn.edu.fit.iuh.models.Employee" %>
<%@ page import="java.util.Optional" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Employee</title>
    <%@include file="css.jsp" %>
</head>
<body>
<div class="container p-4">
    <div class="row" style="margin-top:10px;">
        <div class="content" style="height: 1090px; width: 960px; margin: auto">
            <div class="header">
                <h2 class="text-left" style="text-align: center">Update Employee</h2>
            </div>
            <div class="body" style="margin-top: 10px">
                <form action="controls?action=update_emp" method="post">


                    <%
                        long id = Long.parseLong(request.getParameter("id"));

                        Optional<Employee> employee = new EmployeeService().findById(id);
                    %>
                    <label class="control-label col-xs-3">ID</label>
                    <input type="hidden" name="id" class="form-control"
                           value="<%=id%>">

                    <label class="control-label col-xs-3">Full Name</label>
                    <input type="text" name="name" class="form-control"
                           value="<%=employee.get().getFullName()%>">

                    <label class="control-label col-xs-3">Date of birth</label>
                    <input type="text" name="dob" class="form-control"
                           value="<%=employee.get().getDob()%>">

                    <label class="control-label col-xs-3">Email</label>
                    <input type="text" name="email" class="form-control"
                           value="<%=employee.get().getEmail()%>">

                    <label class="control-label col-xs-3">Address</label>
                    <input type="text" name="address" class="form-control"
                           value="<%=employee.get().getAddress()%>">

                    <label class="control-label col-xs-3">Phone</label>
                    <input type="text" name="phone" class="form-control"
                           value="<%=employee.get().getPhone()%>">


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
