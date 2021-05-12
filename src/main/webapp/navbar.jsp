<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<a href="index">Index   </a>
<% if (session.getAttribute("email") == null){ %>
<a href="login">Login   </a>
<a href="registration">Registration   </a>
<% }else{  %>
<a href="logout">Logout   </a>
<a href="add_book">Add book  </a>
<% } %>
<a href="books">Books   </a>
<a href="profile">Profile   </a>
<a href="migrate">Migrate DB  </a>
