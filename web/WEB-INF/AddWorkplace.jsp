<%-- 
    Document   : AddWorkplace
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSPServlet - Add Workplace</title>
    </head>
    <body>
        <form name="AddWorkplace" method="post">
            <h2>Workplace</h2>
            <br />
            <label for="workplaceName"><b>Name:</b></label>
            <input type="text" value="" name="workplaceName" id="workplaceName" />
            <br />
            <br />
            <input type="submit" value="Add" name="AddWorkplaceAddButton" />
        </form>
        <br />
        <div><a href="/JSPServletTest/Index">Back</a></div>
    </body>
</html>
