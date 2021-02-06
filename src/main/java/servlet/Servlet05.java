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
 * @date: 2021/1/31 22:02
 */
public class Servlet05 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("进入到学生模块相关操作");
        String path = request.getServletPath();
        if("/student/add.do".equals(path)){
            
            add(request,response);

        }else if ("/student/delete.do".equals(path)){

            delete(request,response);

        }else if ("/student/update.do".equals(path)){

            update(request,response);

        }else if ("/student/select.do".equals(path)){

            select(request,response);

        }
    }

    private void select(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("执行查询操作...");
    }

    private void update(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("执行修改操作...");
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("执行删除操作...");
    }

    private void add(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("执行添加操作...");
    }
}
