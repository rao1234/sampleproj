package com.orgname;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AppConfigDemo
 */
public class AppConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AppConfigDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		//ServletConfig conf= getServletConfig();
		/*String param=conf.getInitParameter("exparam");
		out.println(param);
		System.out.println(param);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Enumeration<String> elem = conf.getInitParameterNames();
		
		while (elem.hasMoreElements()) {
		String 	str  =  elem.nextElement();
			out.println("name"+str);
			out.print("value"+conf.getInitParameter(str));
		}*/
		ServletContext context = getServletContext();
		String authorname= context.getInitParameter("author");
		System.out.println(authorname);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
