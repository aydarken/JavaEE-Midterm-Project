<%@ page import="com.example.JavaEEmidtermProject.models.Book" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.JavaEEmidtermProject.models.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of books</title>
</head>
<body>
<jsp:include page="navbar.jsp"/>

<h3>Book List</h3>
<table border="1" cellpadding="2" cellspacing="2">
    <tr>
        <th>Id</th>
        <th>Title</th>
        <th>Author</th>
        <th>Genre</th>
        <th>Published</th>
    </tr>
    <%List<?> books =
            (List<?>)request.getAttribute("books");
        for(Object element: books){
            final Book book = (Book) element;
    %>
    <tr>
        <td><%=book.getId() %></td>
        <td><%=book.getTitle() %></td>
        <td><%=book.getAuthor() %></td>
        <td><%=book.getGenre() %></td>
        <td><%=book.getPublished() %></td>
        <td><input type="button" name="borrow" value="borrow"></td>

    </tr>
    <%}%>
</table>
</body>
</html>
