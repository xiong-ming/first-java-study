package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class FilterDemo02 implements Filter {


    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //对request对象请求消息增强
        System.out.println("FilterDemo02被执行了。。。");
        chain.doFilter(req, resp);
        System.out.println("FilterDemo02回来了。。。");
    }

    public void init(FilterConfig config) throws ServletException {

    }

    public void destroy() {
    }

}
