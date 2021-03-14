<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
    <style>
        div{
            margin: 10px;
        }
    </style>
</head>
<body>
<h1>Registration</h1>
<form action="registration" method="post">
    <div>
        <label for="name">Name: </label>
        <input type="text" name="name" id="name"><br>
    </div>
    <div>
        <label for="surname">Surname: </label>
        <input type="text" name="surname" id="surname"><br>
    </div>
    <div>
        <label for="email">Email: </label>
        <input type="email" name="email" id="email"><br>
    </div>
    <div>
        <label for="password">Password</label>
        <input type="password" name="password" id="password">
    </div>
    <input type="submit" value="Register">
</form>
</body>
</html>
