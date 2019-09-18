package com.nit.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        
        String name=req.getParameter("name");
        int age=Integer.parseInt(req.getParameter("age"));
        
        String eligibility=null;
        if(age>=18)
           eligibility="u r eligible for Voting";
        else
        	eligibility="u r not eligible for Voting";
        
        
        pw.println("<body><table align='center'><tr><td>Name</td><td>"+name+"</td></tr>"
        		+ "<tr><td>age</td><td>"+age+"</td></tr>"
        		+"<tr><td>Eligibility - </td><td>"+eligibility+"</td></tr>"
        		+ "<tr><td><a href='home.html'>HOME</a></td></tr></table></body>");
          
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
