<%-- 
    Document   : DeleteEmployee
--%>

<%@page import="Model.Employee"%>
<%@page import="Model.Relation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSPServlet - Delete Employee</title>
    </head>
    <body>
        <form name="DeleteEmployee" method="post">
            <h2>Employee</h2>
            <br />
            <label for="employeeId"><b>Id:</b></label>
            <input type="text" value="<%=((Model.Employee) request.getAttribute("Employee")).getEmployeeId()%>" name="employeeId" id="employeeId" readonly />
            <br />
            <label for="employeeName"><b>Name:</b></label>
            <input type="text" value="<%=((Model.Employee) request.getAttribute("Employee")).getEmployeeName()%>" name="employeeName" id="employeeName" readonly />
            <br />
            <label for="employeeEmail"><b>Email:</b></label>
            <input type="text" value="<%=((Model.Employee) request.getAttribute("Employee")).getEmployeeEmail()%>" name="employeeEmail" id="employeeEmail" readonly />
            <br />
            <label for="employeeIsDeleted"><b>Is Deleted:</b></label>
            <label id="employeeIsDeleted" name="employeeIsDeleted"><%=((Model.Employee) request.getAttribute("Employee")).getEmployeeIsDeleted()%></label>
            <br />
            <br />
<%
            if ((Model.Relation) request.getAttribute("Relation") != null && ((Model.Relation) request.getAttribute("Relation")).getRelationId() > 0)
            {
%>
                <h3>Delete is not allowed, because at least one relation is using the record.</h3>
<%
            }
            else
            {
                if (((Model.Employee) request.getAttribute("Employee")).getEmployeeIsDeleted() != false)
                {
%>
                    <h3>Delete is not allowed, because record already deleted.</h3>
<%
                }
                else
                {
%>
                    <input type="submit" value="Delete" name="DeleteEmployeeDeleteButton" />
<%
                }
            }
%>
        </form>
        <br />
        <div><a href="/JSPServletTest/Index">Back</a></div>
    </body>
</html>
