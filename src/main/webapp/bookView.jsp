<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.JavaEEmidtermProject.models.Book" %>
<html>
<head>
    <title>View book</title>
</head>
<body>
<jsp:include page="navbar.jsp"/>

<h3>Book List</h3>
<form action="books" method="post">
    <table border="1" cellpadding="2" cellspacing="2">
        <tr>
            <th>Id</th>
            <th>Title</th>
            <th>Author</th>
            <th>Genre</th>
            <th>Published</th>
        </tr>
        <%
           Book book =
                   (Book) request.getAttribute("books");

        %>
        <tr>
            <td><%=book.getId() %>
            </td>
            <td><%=book.getTitle() %>
            </td>
            <td><%=book.getAuthor() %>
            </td>
            <td><%=book.getGenre() %>
            </td>
            <td><%=book.getPublished() %>
            </td>
            <td><input type="submit" name="borrow" value="borrow"></td>

        </tr>
        <%}%>
    </table>
</body>
</html>
