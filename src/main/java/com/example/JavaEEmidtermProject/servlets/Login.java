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
import java.sql.*;

@WebServlet(name = "loginServlet", value = "/login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        String email = req.getParameter("email");
        String password = req.getParameter("password");
        boolean status = false;
        User user = new User();

        try {

            Connection connection = ConnectionToDB.getNewConnection();

            PreparedStatement ps = connection.prepareStatement
                    ("select * from user where email=? and password=?");
            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet resultSet = ps.executeQuery();
            status = resultSet.next();
                        user.setId( resultSet.getInt(1));
                        user.setName(resultSet.getString(2));
                        user.setSurname(resultSet.getString(3));
                        user.setEmail(email);
                        user.setPassword(password);

            resultSet.close();
            ps.close();
            connection.close();

        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();

        }

        if (status) {
            session.setAttribute("email", email);
            session.setAttribute("user", user);
            resp.sendRedirect("profile");
//            req.getRequestDispatcher("/profile").forward(req, resp);
        } else {
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
            req.setAttribute("error", "Username or password incorrect");
        }

    }
}
