package org.hh.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hh.service.IStudentService;
import org.hh.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class DeleteStudnentServlet
 */
@WebServlet("/DeleteStudnentServlet")
public class DeleteStudnentServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//删除
	request.setCharacterEncoding("utf-8");
	//接受前端传来的学号
	System.out.println(request.getParameter("sno").trim());
	 int no=Integer.parseInt(request.getParameter("sno").trim());
	response.setContentType("text/html; charset=UTF-8");
    response.setCharacterEncoding("utf-8");
	IStudentService service =new StudentServiceImpl();
	boolean result = service.deleteStudentBySno(no);
	// response.setContentType("text/html; charset=UTF-8");
    // response.setCharacterEncoding("utf-8");
		if(result) {
			//out.print("删除成功");
			//response.getWriter().println("删除成功");
			 request.getRequestDispatcher("QueryAllServlet").forward(request,response);
			//request.getRequestDispatcher("/QueryAllSerlvet").forward(request, response);//删完重新查询
		}
		response.getWriter().println("删除失败");
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
