<%-- 
    Document   : EditEmployee
--%>

<%@page import="Model.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSPServlet - Edit Employee</title>
    </head>
    <body>
        <form name="EditEmployee" method="post">
            <h2>Employee</h2>
            <br />
            <label for="employeeId"><b>Id:</b></label>
            <input type="text" value="<%=((Model.Employee) request.getAttribute("Employee")).getEmployeeId()%>" name="employeeId" id="employeeId" readonly />
            <br />
            <label for="employeeName"><b>Name:</b></label>
            <input type="text" value="<%=((Model.Employee) request.getAttribute("Employee")).getEmployeeName()%>" name="employeeName" id="employeeName" />
            <br />
            <label for="employeeEmail"><b>Email:</b></label>
            <input type="text" value="<%=((Model.Employee) request.getAttribute("Employee")).getEmployeeEmail()%>" name="employeeEmail" id="employeeEmail" />
            <br />
            <label for="employeeIsDeleted"><b>Is Deleted:</b></label>
            <label id="employeeIsDeleted" name="employeeIsDeleted"><%=((Model.Employee) request.getAttribute("Employee")).getEmployeeIsDeleted()%></label>
            <br />
            <br />
            <input type="submit" value="Edit" name="EditEmployeeEditButton" />
        </form>
        <br />
        <div><a href="/JSPServletTest/Index">Back</a></div>
    </body>
</html>
