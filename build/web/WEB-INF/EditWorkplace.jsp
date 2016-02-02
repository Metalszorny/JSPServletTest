<%-- 
    Document   : EditWorkplace
--%>

<%@page import="Model.Workplace"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSPServlet - Edit Workplace</title>
    </head>
    <body>
        <form name="EditWorkplace" method="post">
            <h2>Workplace</h2>
            <br />
            <label for="workplaceId"><b>Id:</b></label>
            <input type="text" value="<%=((Model.Workplace) request.getAttribute("Workplace")).getWorkplaceId()%>" name="workplaceId" id="workplaceId" readonly />
            <br />
            <label for="workplaceName"><b>Name:</b></label>
            <input type="text" value="<%=((Model.Workplace) request.getAttribute("Workplace")).getWorkplaceName()%>" name="workplaceName" id="workplaceName" />
            <br />
            <label for="workplaceIsDeleted"><b>Is Deleted:</b></label>
            <label id="workplaceIsDeleted" name="workplaceIsDeleted"><%=((Model.Workplace) request.getAttribute("Workplace")).getWorkplaceIsDeleted()%></label>
            <br />
            <br />
            <input type="submit" value="Edit" name="EditWorkplaceEditButton" />
        </form>
        <br />
        <div><a href="/JSPServletTest/Index">Back</a></div>
    </body>
</html>
