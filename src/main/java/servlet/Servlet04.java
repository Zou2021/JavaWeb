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
 * @date: 2021/1/30 22:02
 */
@WebServlet("/servlet04.do")
public class Servlet04 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("....");

        Student s1 = new Student("001", "zou", 21);
        Student s2 = new Student("002", "qi", 21);
//        {"s1":{"id":"?","name":"?","age":"?"}}
        String str = "{\"s1\":{\"id\":\"" + s1.getId()
                + "\",\"name\":\"" + s1.getName()
                + "\",\"age\":\"" + s1.getAge()
                + "\"},\"s2\":{\"id\":\"" + s2.getId()
                + "\",\"name\":\"" + s2.getName()
                + "\",\"age\":\"" + s2.getAge() + "\"}}";
        PrintWriter out = response.getWriter();
        out.print(str);
        out.close();
    }
}
