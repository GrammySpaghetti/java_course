package com.ryan.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Sets the content type of the response
//        response.setContentType("text/html");
//        // writes the response
//        PrintWriter out = response.getWriter();
//        out.write("<h1>Hello World</h1>");
        String userName = request.getParameter("name");
        String favoriteLanguage = request.getParameter("language");
        String hometown = request.getParameter("hometown");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        if(userName != null) {
            out.write("<h1>Welcome, " + userName + "</h1>");
        }
        else {
        	out.write("<h1>Welcome, Unkown</h1>");
        }
        if(favoriteLanguage != null) {
        	out.write("<h2>Your favorite language is: " + favoriteLanguage + "</h2>");
        }
        else {
        	out.write("<h2>Your favorite language is: Unknown</h2>");
        }
        if(hometown != null) {
        	out.write("<h2>Your hometown is: " + hometown + "</h2>");
        }
        else {
        	out.write("<h2>Your hometown is: Unknown</h2>");
        }
        out.write("<h2>This is the new world order</h2>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
