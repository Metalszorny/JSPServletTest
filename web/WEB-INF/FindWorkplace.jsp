<%-- 
    Document   : FindWorkplace
--%>

<%@page import="Model.Workplace"%>
<%@page import="Model.Workplaces"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSPServlet - Find Workplace</title>
    </head>
    <body>
        <form name="FindWorkplace" method="post">
            <h3>Sort:</h3>
            <label for="workplaceName"><b>Name:</b></label>
            <input type="text" value="" name="workplaceName" id="workplaceName" />
            <input type="submit" value="Query" name="FindWorkplaceFindButton" />
        </form>
        <table border="1">
            <tr>
                <td colspan="3">
                    <h2>Workplaces</h2>
                </td>
            </tr>
            <tr>
                <td><b>Id:</b></td>
                <td><b>Name:</b></td>
                <td><b>Is Deleted:</b></td>
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
