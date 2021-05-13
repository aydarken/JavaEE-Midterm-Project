<%@ page import="com.example.JavaEEmidtermProject.models.User" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.JavaEEmidtermProject.models.Book" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>
<jsp:include page="navbar.jsp"/>

<h1>Profile page</h1>
<%
    User user = (User) request.getAttribute("user");
%>
<h4><%= user.getName() +" "+ user.getSurname() %></h4>
<h5><%= user.getEmail()%></h5>

<h3>Your books list</h3>
<table border="1" cellpadding="2" cellspacing="2">
    <tr>
        <th>Id</th>
        <th>Title</th>
        <th>Author</th>
        <th>Genre</th>
        <th>Published</th>
    </tr>
    <%
        List<Book> books =
                (List<Book>) request.getAttribute("UserBooks");
        for(Book book: books){
    %>
    <tr>
        <td><%=book.getId() %></td>
        <td><%=book.getTitle() %></td>
        <td><%=book.getAuthor() %></td>
        <td><%=book.getGenre() %></td>
        <td><%=book.getPublished() %></td>
    </tr>
    <%}%>
</table>
</body>
</html>
