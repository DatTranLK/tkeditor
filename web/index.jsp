<%-- 
    Document   : index
    Created on : Jan 24, 2022, 9:39:20 AM
    Author     : jike
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CKEditor Page</title>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <!--        <script src="https://cdn.ckeditor.com/4.17.1/standard/ckeditor.js"></script>-->
        <script src="./ckeditor/ckeditor.js"></script>
        <script src="./ckeditor/config.js"></script>
    </head>
    <body>
        <form action="GetTextServlet" method="POST">
            <textarea name="editor1"></textarea><br/>
            <input type="submit" value="Submit" name="btAction" />

            <script>
                CKEDITOR.replace('editor1', {
                    extraPlugins: 'justify,videoembed',
                    
                });
                
            </script>

    </body>
</html>
