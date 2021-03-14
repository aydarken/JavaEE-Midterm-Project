package com.example.JavaEEmidtermProject.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/profile")
public class ProfileFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpSession session = ((HttpServletRequest) request).getSession();

        if (session.getAttribute("email") == null) {
            response.getWriter().println("You must login!");
        } else {
            chain.doFilter(request, response);
        }
    }
}
