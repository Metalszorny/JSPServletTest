<%-- 
    Document   : Index
--%>

<%@page import="Model.Employee"%>
<%@page import="Model.Employees"%>
<%@page import="Model.Relation"%>
<%@page import="Model.Relations"%>
<%@page import="Model.Workplace"%>
<%@page import="Model.Workplaces"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSPServlet - Index</title>
    </head>
    <body>
        <table border="1">
            <tr>
                <td colspan="5">
                    <h2>Workplaces</h2>
                </td>
            </tr>
            <tr>
                <td><b>Id:</b></td>
                <td><b>Name:</b></td>
                <td><b>Is Deleted:</b></td>
                <td colspan="2"><b>Actions:</b></td>
            </tr>
<%
            if ((Model.Workplaces) request.getAttribute("Workplaces") != null)
            {
                for (Model.Workplace oneItem : ((Model.Workplaces) request.getAttribute("Workplaces")).getItems())
                {
%>
                    <tr>
                        <td><%=oneItem.getWorkplaceId()%></td>
                        <td><%=oneItem.getWorkplaceName()%></td>
                        <td><%=oneItem.getWorkplaceIsDeleted()%></td>
                        <td><a href="/JSPServletTest/EditWorkplace?id=<%=oneItem.getWorkplaceId()%>">Edit</a></td>
                        <td><a href="/JSPServletTest/DeleteWorkplace?id=<%=oneItem.getWorkplaceId()%>">Delete</a></td>
                    </tr>
<%
                }
            }
%>
        </table>
        <br />
        <div><a href="/JSPServletTest/AddWorkplace">Add New</a></div>
        <div><a href="/JSPServletTest/FindWorkplace">Find</a></div>
        <br />
        <br />
        <br />
        <table border="1">
            <tr>
                <td colspan="6">
                    <h2>Employees</h2>
                </td>
            </tr>
            <tr>
                <td><b>Id:</b></td>
                <td><b>Name:</b></td>
                <td><b>Email:</b></td>
                <td><b>Is Deleted:</b></td>
                <td colspan="2"><b>Actions:</b></td>
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
                        <td><a href="/JSPServletTest/EditEmployee?id=<%=oneItem.getEmployeeId()%>">Edit</a></td>
                        <td><a href="/JSPServletTest/DeleteEmployee?id=<%=oneItem.getEmployeeId()%>">Delete</a></td>
                    </tr>
<%
                }
            }
%>
        </table>
        <br />
        <div><a href="/JSPServletTest/AddEmployee">Add New</a></div>
        <div><a href="/JSPServletTest/FindEmployee">Find</a></div>
        <br />
        <br />
        <br />
        <table border="1">
            <tr>
                <td colspan="5">
                    <h2>Relations</h2>
                </td>
            </tr>
            <tr>
                <td><b>Id:</b></td>
                <td><b>Employee:</b></td>
                <td><b>Workplace:</b></td>
                <td colspan="2"><b>Actions:</b></td>
            </tr>
<%
            if ((Model.Relations) request.getAttribute("Relations") != null)
            {
                for (Model.Relation oneItem : ((Model.Relations) request.getAttribute("Relations")).getItems())
                {
%>
                    <tr>
                        <td><%=oneItem.getRelationId()%></td>
                        <td><%=oneItem.getRelationEmployee()%></td>
                        <td><%=oneItem.getRelationWorkplace()%></td>
                        <td><a href="/JSPServletTest/EditRelation?id=<%=oneItem.getRelationId()%>">Edit</a></td>
                        <td><a href="/JSPServletTest/DeleteRelation?id=<%=oneItem.getRelationId()%>">Delete</a></td>
                    </tr>
<%
                }
            }
%>
        </table>
        <br />
        <div><a href="/JSPServletTest/AddRelation">Add New</a></div>
        <%--<div><a href="/JSPServletTest/FindRelation">Find</a></div>--%>
    </body>
</html>
