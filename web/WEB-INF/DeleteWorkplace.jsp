<%-- 
    Document   : DeleteWorkplace
--%>

<%@page import="Model.Relation"%>
<%@page import="Model.Workplace"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSPServlet - Delete Workplace</title>
    </head>
    <body>
        <form name="DeleteWorkplace" method="post">
            <h2>Workplace</h2>
            <br />
            <label for="workplaceId"><b>Id:</b></label>
            <input type="text" value="<%=((Model.Workplace) request.getAttribute("Workplace")).getWorkplaceId()%>" name="workplaceId" id="workplaceId" readonly />
            <br />
            <label for="workplaceName"><b>Name:</b></label>
            <input type="text" value="<%=((Model.Workplace) request.getAttribute("Workplace")).getWorkplaceName()%>" name="workplaceName" id="workplaceName" readonly />
            <br />
            <label for="workplaceIsDeleted"><b>Is Deleted:</b></label>
            <label id="workplaceIsDeleted" name="workplaceIsDeleted"><%=((Model.Workplace) request.getAttribute("Workplace")).getWorkplaceIsDeleted()%></label>
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
                if (((Model.Workplace) request.getAttribute("Workplace")).getWorkplaceIsDeleted() != false)
                {
%>
                    <h3>Delete is not allowed, because record already deleted.</h3>
<%
                }
                else
                {
%>
                    <input type="submit" value="Delete" name="DeleteWorkplaceDeleteButton" />
<%
                }
            }
%>
        </form>
        <br />
        <div><a href="/JSPServletTest/Index">Back</a></div>
    </body>
</html>
