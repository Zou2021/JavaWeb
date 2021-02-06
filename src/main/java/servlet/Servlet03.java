package servlet;

import domain.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author: 邹祥发
 * @date: 2021/1/30 21:35
 */
@WebServlet("/servlet03.do")
public class Servlet03 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("...");

        Student s = new Student("001","zou",21);
//        {"id":"?","name":"?","age":"?"}
        String str = "{\"id\":\""+s.getId()+"\",\"name\":\""+s.getName()+"\",\"age\":\""+s.getAge()+"\"}";
        PrintWriter out = response.getWriter();
        out.print(str);
        out.close();
    }
}
