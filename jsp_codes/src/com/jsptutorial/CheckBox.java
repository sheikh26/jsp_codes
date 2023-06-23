package com.jsptutorial;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CheckBox extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		String name;
		String[] hobbies;
		res.setContentType("text/html");
		name = req.getPaparameter("name");
		PrintWriter pw = res.getWriter();
		hobbies = req.getPaparameterValues("hobbies");
		if (hobbies != null) {
			pw.println("<html><body bgcolor=#00fffff>");
			pw.println("Hi I am <h4>" + name + ".</h4><br>");
			pw.println("My hobby/hobbies are:");
			for (int i = 0; i < hobbies.length; i++) {
				pw.println(hobbies[i] + ",");
			}
			pw.println("</body></html>");
		}
		else
			pw.println("<p><font color=red>not selected</font></p>");
	}
}