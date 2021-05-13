<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Library System</a>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="index">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="books">Books </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="profile">Profile </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="migrate">Migrate DB </a>
                </li>
            </ul>
            <% if (session.getAttribute("email") == null) { %>
            <a class="btn btn-outline-success mx-1" href="login">Login </a>
            <a class="btn btn-outline-success" href="registration">Registration </a>
            <% } else { %>
            <a class="btn btn-outline-success mx-1 " href="add_book">Add book </a>
            <a class="btn btn-outline-success" href="logout">Logout </a>
            <% } %>
        </div>
    </div>
</nav>

</body>