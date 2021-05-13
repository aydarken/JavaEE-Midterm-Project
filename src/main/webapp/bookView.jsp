<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.JavaEEmidtermProject.models.Book" %>
<html>
<head>
    <title>View book</title>
</head>
<body>
<jsp:include page="navbar.jsp"/>

<h3>Book List</h3>
<form action="book_view" method="post">
    <%
        Book book = (Book) session.getAttribute("book");
        System.out.println("book view " + book.getPublished());
    %>
    <h1>
        <%= book.getTitle() %>
    </h1>
    <h3>
        <%=book.getAuthor() %>
    </h3>
    <h3>
        <%=book.getGenre() %>
    </h3>
    <h3>
        <%=book.getPublished() %>
    </h3>
    <input type="submit" name="borrow" value="borrow">

</form>
</body>
</html>
