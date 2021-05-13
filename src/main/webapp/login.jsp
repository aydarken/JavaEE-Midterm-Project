<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>

</head>
<body>
<jsp:include page="navbar.jsp"/>

<div class="col-4 mx-auto">

    <h1>Login</h1>
    <form action="login" method="post">

        <div class="mb-3 row">
            <label for="Email" class="col-sm-2 col-form-label">Email</label>
            <div class="col-sm-10">
                <input type="email" name="email" class="form-control" id="Email">
            </div>
        </div>
        <div class="mb-3 row my-2">
            <label for="inputPassword" class="col-sm-2 col-form-label">Password</label>
            <div class="col-sm-10">
                <input type="password" name="password" class="form-control" id="inputPassword">
            </div>
        </div>
        <input type="submit" class="btn btn-primary" value="Login">

    </form>
</div>

</body>
</html>
