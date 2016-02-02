<%-- 
    Document   : FindRelation
--%>

<%@page import="Model.Relation"%>
<%@page import="Model.Relations"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSPServlet - Find Relation</title>
    </head>
    <body>
        <form name="FindRelation" method="post">
            <h3>Sort:</h3>
            <label for="relationEmployee"><b>Employee:</b></label>
            <input type="text" value="" name="relationEmployee" id="relationEmployee" />
            <label for="relationWorkplace"><b>Workplace:</b></label>
            <input type="text" value="" name="relationWorkplace" id="relationWorkplace" />
            <input type="submit" value="Query" name="FindRelationFindButton" />
        </form>
        <table border="1">
            <tr>
                <td colspan="3">
                    <h2>Relations</h2>
                </td>
            </tr>
            <tr>
                <td><b>Id:</b></td>
                <td><b>Employee:</b></td>
                <td><b>Workplace:</b></td>
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
