<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add book</title>
    <style>
        div {
            margin: 10px;
        }
    </style>
</head>
<body>
<jsp:include page="navbar.jsp"/>

<h1>Add book</h1>
<form action="add_book" method="post">
    <div>
        <label for="title">Title: </label>
        <input type="text" name="title" id="title"><br>
    </div>
    <div>
        <label for="author">Author: </label>
        <input type="text" name="author" id="author"><br>
    </div>
    <div>
        <label for="genre">Genre: </label>
        <input type="text" name="genre" id="genre"><br>
    </div>
    <div>
        <label for="published">Published: </label>
        <input type="number" name="published" id="published">
    </div>
    <input type="submit" value="Add book">
</form>
</body>
</html>
