<%-- 
    Document   : FindEmployee
--%>

<%@page import="Model.Employee"%>
<%@page import="Model.Employees"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSPServlet - Find Employee</title>
    </head>
    <body>
        <form name="FindEmployee" method="post">
            <h3>Sort:</h3>
            <label for="employeeName"><b>Name:</b></label>
            <input type="text" value="" name="employeeName" id="employeeName" />
            <label for="employeeEmail"><b>Email:</b></label>
            <input type="text" value="" name="employeeEmail" id="employeeEmail" />
            <input type="submit" value="Query" name="FindEmployeeFindButton" />
        </form>
        <table border="1">
            <tr>
                <td colspan="4">
                    <h2>Employees</h2>
                </td>
            </tr>
            <tr>
                <td><b>Id:</b></td>
                <td><b>Name:</b></td>
                <td><b>Email:</b></td>
                <td><b>Is Deleted:</b></td>
            </tr>
<%
            if ((Model.Employees) request.getAttribute("Employees") != null)
            {
                for (Model.Employee oneItem : ((Model.Employees) request.getAttribute("Employees")).getItems())
                {
%>
                    <tr>
                        <td><%=oneItem.getEmployeeId()%></td>
                        <td><%=oneItem.getEmployeeName()%></td>
                        <td><%=oneItem.getEmployeeEmail()%></td>
                        <td><%=oneItem.getEmployeeIsDeleted()%></td>
                    </tr>
<%
                }
            }
%>
        </table>
        <br />
        <div><a href="/JSPServletTest/Index">Back</a></div>
    </body>
</html>
