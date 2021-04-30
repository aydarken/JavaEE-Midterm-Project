package com.example.JavaEEmidtermProject.servlets;

import com.example.JavaEEmidtermProject.db_migration.FlywayIntegration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/migrate")
public class DatabaseMigration extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FlywayIntegration flywayIntegration = new FlywayIntegration();
        flywayIntegration.init();
    }
}
