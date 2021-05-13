package com.example.JavaEEmidtermProject.servlets;

import com.example.JavaEEmidtermProject.db_connection.ConnectionToDB;
import com.example.JavaEEmidtermProject.models.Book;
import com.example.JavaEEmidtermProject.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(name = "borrowBook", value = "/borrow_book")
public class BorrowBook extends HttpServlet {
    Statement statement;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        try {
            Connection connection = ConnectionToDB.getNewConnection();
            statement = connection.createStatement();
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }

        Book book = (Book) session.getAttribute("book");
        System.out.println("borrow book " + book.getId());
            long userId = ((User) session.getAttribute("user")).getId();
            System.out.println("userid "+ userId);
            int borrowed = borrowBook(userId, book);

            if (borrowed != 0) {
                request.setAttribute("message", "Book " + book.getTitle() + " borrowed by You successfully!");
                request.getRequestDispatcher("allBooks.jsp").forward(request, response);
            }
//        request.getRequestDispatcher("index.jsp").forward(request, response);
    }



    public int borrowBook(long userId, Book book) {
        String sqlString;
        sqlString = "insert into user_books(user_id, book_id) values("
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