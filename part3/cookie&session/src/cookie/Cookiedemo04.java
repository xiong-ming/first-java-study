package cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*cookie快速入门*/
@WebServlet("/Cookiedemo04")
public class Cookiedemo04 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1.创建cookie对象
        Cookie c1=new Cookie("msg","hello");
        //设置cookie存活时间
        //c1.setMaxAge(30);
        c1.setMaxAge(-2);
        //c1.setMaxAge(0);
        //3.发送Cookie
        response.addCookie(c1);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
