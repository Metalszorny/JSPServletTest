<%-- 
    Document   : AddEmployee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSPServlet - Add Employee</title>
    </head>
    <body>
        <form name="AddEmployee" method="post">
            <h2>Employee</h2>
            <br />
            <label for="employeeName"><b>Name:</b></label>
            <input type="text" value="" name="employeeName" id="employeeName" />
            <br />
            <label for="employeeEmail"><b>Email:</b></label>
            <input type="text" value="" name="employeeEmail" id="employeeEmail" />
            <br />
            <br />
            <input type="submit" value="Add" name="AddEmployeeAddButton" />
        </form>
        <br />
        <div><a href="/JSPServletTest/Index">Back</a></div>
    </body>
</html>
