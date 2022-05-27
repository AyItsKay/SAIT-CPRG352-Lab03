<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculators</title>
    </head>
    <body>
        <h1>Arithmetic Calculators</h1>
        <form method="post" action="arithmetic">
            <label>First:</label>
            <input type="text" name="first" value="${first}">
            <br>
            <label>Second:</label>
            <input type="text" name="second" value="${second}">
            <br>
            <button type="submit" name="operation" value="add"> + </button>
            <button type="submit" name="operation" value="minus"> - </button>
            <button type="submit" name="operation" value="multiply"> * </button>
            <button type="submit" name="operation" value="divide"> % </button>
            <br><br>
            Result: ${message}
            <br>
            <a href="age">Age Calculator</a>
        </form>
        
    </body>
</html>
