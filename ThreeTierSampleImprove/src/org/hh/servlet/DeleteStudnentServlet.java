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
	//ɾ��
	request.setCharacterEncoding("utf-8");
	//����ǰ�˴�����ѧ��
	System.out.println(request.getParameter("sno").trim());
	 int no=Integer.parseInt(request.getParameter("sno").trim());
	response.setContentType("text/html; charset=UTF-8");
    response.setCharacterEncoding("utf-8");
	IStudentService service =new StudentServiceImpl();
	boolean result = service.deleteStudentBySno(no);
	// response.setContentType("text/html; charset=UTF-8");
    // response.setCharacterEncoding("utf-8");
		if(result) {
			//out.print("ɾ���ɹ�");
			//response.getWriter().println("ɾ���ɹ�");
			 request.getRequestDispatcher("QueryAllServlet").forward(request,response);
			//request.getRequestDispatcher("/QueryAllSerlvet").forward(request, response);//ɾ�����²�ѯ
		}
		response.getWriter().println("ɾ��ʧ��");
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
