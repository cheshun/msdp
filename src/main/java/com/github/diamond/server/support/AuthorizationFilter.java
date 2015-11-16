package com.github.diamond.server.support;

import com.github.diamond.server.utils.SessionHolder;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AuthorizationFilter implements Filter {

    public void destroy() {

    }


    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
            ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpSession session = httpRequest.getSession();
        SessionHolder.setSession(session);
        try {
            // 判断是否登录，没有就跳转到登录页面
            if (session.getAttribute("sessionUser") == null)
                ((HttpServletResponse) response).sendRedirect(httpRequest.getContextPath() + "/");
            else
                chain.doFilter(httpRequest, response);
        }
        finally {
            SessionHolder.remove();
        }
    }


    public void init(FilterConfig filterConfig) throws ServletException {
    }

}
