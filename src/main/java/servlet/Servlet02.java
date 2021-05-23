package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author: 邹祥发
 * @date: 2021/1/30 06:35
 */
@WebServlet("/servlet02.do")
public class Servlet02 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("..");
//        {"str1":"aaa","str2":"bbb"}
        String str = "{\"str1\":\"aaa\",\"str2\":\"bbb\"}";
        PrintWriter out = response.getWriter();
        out.print(str);
        out.close();
    }
}
