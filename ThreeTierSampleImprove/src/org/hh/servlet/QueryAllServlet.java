package org.hh.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hh.entity.Student;
import org.hh.service.IStudentService;
import org.hh.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class QueryAllServlet
 */
@WebServlet("/QueryAllServlet")
public class QueryAllServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("utf-8");
		IStudentService service=new StudentServiceImpl();
		List<Student> students =service.queryAll();
		
		//System.out.println(students);
		request.setAttribute("students", students);
		//因为request中有数据，因此需要通过请求转发的方式跳转（请求转发还会丢失数据）
		//pagacontex<request<session<application
		request.getRequestDispatcher("index.jsp").forward(request, response);;
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
