package com.lkb.designMode.chainOfResponsibility.test;

import javax.servlet.*;
import java.io.IOException;

public class TestFilter implements Filter {

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {

        chain.doFilter(request, response);
    }

    public void destroy() {
    }

    public void init(FilterConfig filterConfig) throws ServletException {
    }

}