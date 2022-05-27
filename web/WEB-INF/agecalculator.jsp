<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            <label>Enter your age:</label>
            <input type="text" name="age" value="${ageinput}">
            <br>
            <button type="submit">Age next birthday</button>
            <br>
            ${message}
            <br>
            <a href="arithmetic">Arithmetic Calculator</a>
        </form>
        
    </body>
</html>
