<%-- 
    Document   : DeleteRelation
--%>

<%@page import="Model.Relation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSPServlet - Delete Relation</title>
    </head>
    <body>
        <form name="DeleteRelation" method="post">
            <h2>Relation</h2>
            <br />
            <label for="relationId"><b>Id:</b></label>
            <input type="text" value="<%=((Model.Relation) request.getAttribute("Relation")).getRelationId()%>" name="relationId" id="relationId" readonly />
            <br />
            <label for="relationEmployee"><b>Email:</b></label>
            <input type="text" value="<%=((Model.Relation) request.getAttribute("Relation")).getRelationEmployee()%>" name="relationEmployee" id="relationEmployee" readonly />
            <br />
            <label for="relationWorkplace"><b>Workplace:</b></label>
            <input type="text" value="<%=((Model.Relation) request.getAttribute("Relation")).getRelationWorkplace()%>" name="relationWorkplace" id="relationWorkplace" readonly />
            <br />
            <br />
            <input type="submit" value="Delete" name="DeleteRelationDeleteButton" />
        </form>
        <br />
        <div><a href="/JSPServletTest/Index">Back</a></div>
    </body>
</html>
