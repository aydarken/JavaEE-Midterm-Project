package com.example.JavaEEmidtermProject.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/borrowBook")
public class GetBookFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filterConfig.getFilterName() = " + filterConfig.getFilterName());
    }

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
