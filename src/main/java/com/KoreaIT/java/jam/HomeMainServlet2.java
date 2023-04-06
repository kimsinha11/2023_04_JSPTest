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
		
		//inputedDan은 /printDan? 물음표 뒤에 입력된 값(파라미터)을 받아온다
		//파라미터를 여러개 받고싶으면 &로 엮어주면 된다. printDan?dan=9&limit=3
				String inputedDan = request.getParameter("dan");
				String inputedLimit = request.getParameter("limit");
				
				if (inputedDan == null) {
					inputedDan = "1";
				}
				
				if (inputedLimit == null) {
					inputedLimit = "1";
				}
				
				int dan = Integer.parseInt(inputedDan);
				int limit = Integer.parseInt(inputedLimit);
				
				response.getWriter().append(dan + "단" + "<br>");

				for (int j = 1; j <= limit; j++) {
					response.getWriter().append(dan + "*" + j + " = " + dan * j + "<br>");
//					response.getWriter().append(String.format("%d * %d = %d<br>",dan,i);
				}

	}

}
