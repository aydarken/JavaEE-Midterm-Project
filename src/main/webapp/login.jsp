<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <style>
        div {
            margin: 10px;
        }
    </style>
</head>
<body>
<h1>Login</h1>
<form action="login" method="post">
    <div>
        <label for="email">Email: </label>
        <input type="email" name="email" id="email">
    </div>
    <div>
        <label for="password">Password: </label>
        <input type="password" name="password" id="password">
    </div>
    <input type="submit" value="Login">
</form>
</body>
</html>
