package org.hh.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hh.entity.Student;
import org.hh.service.IStudentService;
import org.hh.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class AddStudentServlet
 * 一个Servlet对应一个功能，如果有增删改查，则需要四个查询单个
 */
@WebServlet("/AddStudentServlet")
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		     request.setCharacterEncoding("utf-8");
			int no= Integer.parseInt(request.getParameter("sno").trim());
	        String name = request.getParameter("sname");
	        int age = Integer.parseInt(request.getParameter("sage").trim());
	        String address = request.getParameter("saddress");
	       //浼犲埌JavaBean
	        response.setContentType("text/html; charset=UTF-8");
	        response.setCharacterEncoding("utf-8");
	        Student student=new Student(no,name,age,address);
	        IStudentService studentService=new StudentServiceImpl();
	        boolean result= studentService.addStudent(student);
	        PrintWriter out = response.getWriter(); 
	        if(!result) {//如果增加失败，给request域放入一条数据error
	        	request.setAttribute("error", "adderror");
	        	
	        }  request.getRequestDispatcher("QueryAllServlet").forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
