package com.KoreaIT.java.jam;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/printDan") // http://localhost:8081/2023_JSP_AM/home/main2
public class HomeMainServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		int dan = 8;
		response.getWriter().append(dan + "단" + "<br>");

		for (int j = 1; j < 10; j++) {
			response.getWriter().append(dan + "*" + j + " = " + dan * j + "<br>");
		}

	}

}
