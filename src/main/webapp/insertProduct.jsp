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
                <h2 class="text-left" style="text-align: center">Insert Employee</h2>
            </div>
            <div class="body" style="margin-top: 10px">
                <form action="controls?action=insertP" method="post">

                    <label class="control-label col-xs-3">Description</label>
                    <input type="text" name="description" class="form-control">

                    <label  class="control-label col-xs-3">Manufacturer Name</label>
                    <input type="text" name="mn"  class="form-control">

                    <label class="control-label col-xs-3">Name</label>
                    <input type="text" name="name" class="form-control">

                    <label class="control-label col-xs-3">Unit</label>
                    <input type="text" name="unit" class="form-control">

                    <button class="btn btn-group-justified"
                            type="submit"
                            style="color: white; margin-top: 10px; background-color: green; width: 100%;">
                        Insert
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
