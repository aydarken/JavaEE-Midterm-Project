package com.example.JavaEEmidtermProject.servlets;

import com.example.JavaEEmidtermProject.db_connection.ConnectionToDB;
import com.example.JavaEEmidtermProject.models.Book;
import com.example.JavaEEmidtermProject.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "listOfBooksServlet", value = "/books")
public class ListOfBooks extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Book> books = new ArrayList<>();
        books.add(new Book(0, "test", "test", "test", 2344));

        try {
            Connection connection = ConnectionToDB.getNewConnection();
            PreparedStatement ps = connection.prepareStatement("select * from book");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                books.add(new Book(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getInt(5)));

                System.out.println(books.get(1).getPublished());
            }

            rs.close();
            connection.close();




        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        req.setAttribute("books", books);
        req.getRequestDispatcher("/listOfBooks.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        User user = (User) req.getAttribute("user");

//        if (req.getParameter("borrow" )!= null)
//        user.borrowBook();
    }
}
