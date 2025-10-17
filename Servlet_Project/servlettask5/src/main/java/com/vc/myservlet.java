package com.vc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class myservlet
 */
@WebServlet("/result")
public class myservlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String m=request.getParameter("tbMath");
		int math=Integer.parseInt(m);
		String p=request.getParameter("tbMath");
		int phy=Integer.parseInt(p);
		String c=request.getParameter("tbMath");
		int chem=Integer.parseInt(c);
		
		//percentage
		float per=(math+phy+chem)*100/100;
		String grade=null;
		if(per>=60) {
			grade="First Class";
		}
		else if(per>=35 && per<60) {
			grade="Second Class";
		}
		else {
			grade="Fail";
		}
		request.setAttribute("Percentage",per);
		request.setAttribute("Grade", grade);
		RequestDispatcher dispatcher=request.getRequestDispatcher("result.jsp");
		dispatcher.forward(request, response);
		
	}

}
