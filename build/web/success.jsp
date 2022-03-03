<%-- 
    Document   : success
    Created on : Jan 24, 2022, 10:10:54 AM
    Author     : jike
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Success With Save Content!!!</h1>
        <c:set var="dto" value="${requestScope.INFOR}"/>
        <p>
            ${requestScope.content}
        </p>
        <p>
            ${requestScope.date}
        </p>
    </body>
</html>
