<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<jsp:include page="navbar.jsp"/>

<div class="col-5 mx-auto">

    <h1>Registration</h1>
    <form action="registration" method="post">

        <div class="mb-3 row">
            <label for="name" class="col-sm-2 col-form-label">Name: </label>
            <div class="col-sm-10">
                <input type="text" name="name" class="form-control" id="name">
            </div>
        </div>
        <div class="mb-3 row">
            <label for="surname" class="col-sm-2 col-form-label">Surname: </label>
            <div class="col-sm-10">
                <input type="text" name="surname" class="form-control" id="surname">
            </div>
        </div>
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
        <input type="submit" class="btn btn-primary" value="Register">

    </form>
</div>
</form>
</body>
</html>
