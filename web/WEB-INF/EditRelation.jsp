<%-- 
    Document   : EditRelation
--%>

<%@page import="Model.Employee"%>
<%@page import="Model.Employees"%>
<%@page import="Model.Relation"%>
<%@page import="Model.Workplace"%>
<%@page import="Model.Workplaces"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSPServlet - Edit Relation</title>
    </head>
    <body>
        <form name="EditRelation" method="post">
            <h2>Relation</h2>
            <br />
            <label for="relationId"><b>Id:</b></label>
            <input type="text" value="<%=((Model.Relation) request.getAttribute("Relation")).getRelationId()%>" name="relationId" id="relationId" readonly />
            <br />
            <label for="relationEmployee"><b>Employee:</b></label>
            <select name="relationEmployee" id="relationEmployee">
<%
                if ((Model.Employees) request.getAttribute("Employees") != null)
                {
                    for (Employee oneItem : ((Model.Employees) request.getAttribute("Employees")).getItems())
                    {
                        if (oneItem.getEmployeeIsDeleted() == false)
                        {
%>
                            <option value="<%=oneItem.getEmployeeId()%>"><%=oneItem.getEmployeeName()%></option>
<%
                        }
                    }
                }
%>
            </select>
            <br />
            <label for="relationWorkplace"><b>Employee:</b></label>
            <select name="relationWorkplace" id="relationWorkplace">
<%
                if ((Model.Workplaces) request.getAttribute("Workplaces") != null)
                {
                    for (Model.Workplace oneItem : ((Model.Workplaces) request.getAttribute("Workplaces")).getItems())
                    {
                        if (oneItem.getWorkplaceIsDeleted() == false)
                        {
%>
                            <option value="<%=oneItem.getWorkplaceId()%>"><%=oneItem.getWorkplaceName()%></option>
<%
                        }
                    }
                }
%>
            </select>
            <br />
            <br />
            <input type="submit" value="Edit" name="EditRelationEditButton" />
        </form>
        <br />
        <div><a href="/JSPServletTest/Index">Back</a></div>
    </body>
</html>
