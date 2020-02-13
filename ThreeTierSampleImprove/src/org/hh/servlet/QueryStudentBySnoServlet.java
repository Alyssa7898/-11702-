package org.hh.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hh.entity.Student;
import org.hh.service.IStudentService;
import org.hh.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class QueryStudentBySnoServlet
 */
@WebServlet("/QueryStudentBySnoServlet")
public class QueryStudentBySnoServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("utf-8");
		int no=Integer.parseInt(request.getParameter("sno").trim());
		IStudentService service=new StudentServiceImpl();
		Student student = service.queryStudentBySno(no);
		//System.out.println(student);
		//��ѯ��������Ϣ�󽫴�����Ϣ��ǰ̨jsp��ʾ
		request.setAttribute("student", student);//���鵽����Ϣ����request��
		request.getRequestDispatcher("studentInfo.jsp").forward(request, response);;
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
