package ru.kambear.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import ru.kambear.model.Authentication;

public class MyServlet extends HttpServlet{

	Authentication auth = null;

	public void init() throws ServletException{
		super.init();
		auth = new Authentication();
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException {
		String name = request.getParameter("login");
		String pass = request.getParameter("password");
		boolean isMember = auth.isMember(name+","+pass);

		if (isMember){
			request.setAttribute("memberName",name);
			RequestDispatcher disp = request.getRequestDispatcher("PhotoEvents.jsp");
			disp.forward(request,response);
		}else{
			RequestDispatcher disp = request.getRequestDispatcher("form.html");
			disp.forward(request,response);
		}
	}
}