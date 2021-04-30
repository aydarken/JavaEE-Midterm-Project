package com.example.JavaEEmidtermProject.servlets;

import com.example.JavaEEmidtermProject.db_connection.ConnectionToDB;
import com.example.JavaEEmidtermProject.models.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(value = "/borrowBook")
public class BorrowBook extends HttpServlet {
    Statement statement;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ConnectionToDB connection = new ConnectionToDB();

        int bookId = Integer.parseInt(request.getParameter("id"));

        Book book = getBookById(bookId);
        if (book != null) {
            int userId = (Integer) request.getSession(false).getAttribute("userId");
            int borrowed = borrowBook(userId, book);

            if (borrowed != 0) {
                request.setAttribute("message", "Book " + book.getTitle() + " borrowed by You successfully!");
                request.getRequestDispatcher("allBooks.jsp").forward(request, response);
            }
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public Book getBookById(int id) {
        String sqlString = "SELECT * FROM books WHERE book_id=" + id;
        Book book = new Book();
        try {
            ResultSet resultSet = statement.executeQuery(sqlString);
            while (resultSet.next()) {
                book.setId(resultSet.getInt("book_id"));
                book.setTitle(resultSet.getString("title"));
                book.setAuthor(resultSet.getString("author"));
                book.setGenre(resultSet.getString("genre"));
                book.setPublished(resultSet.getInt("publisher"));
                book.setUserId(resultSet.getInt("user_id"));

            }
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return book;
    }

    public int borrowBook(int userId, Book book) {
        String sqlString;
        sqlString = "insert into book(user_id, book_id) values("
                + userId + ", "
                + book.getId() + ")";

        int result = 0;
        try {
            result = statement.executeUpdate(sqlString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}