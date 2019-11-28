package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.html")
public class LoginPageServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();


		String id = "";
		Cookie[] cookies = req.getCookies();
		if(cookies!= null) { 
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("alwaysRemember")) {
					id = cookie.getValue();
				}
			}
		}
		out.println("<fieldset align='center'>\r\n" + 
				"		<legend>Login</legend>\r\n" + 
				"		<form action='./login' method='post'>\r\n" + 
				"			<table align='center'>\r\n" + 
				"				<h1 align='center'>Login Page</h1>\r\n" + 
				"				<tr>\r\n" + 
				"					<td>Id:</td>\r\n" + 
				"					<td><input type='number' name='id'></td>\r\n" + 
				"				</tr>\r\n" + 
				"				<tr>\r\n" + 
				"					<td>Password:</td>\r\n" + 
				"					<td><input type='password' name='password'></td>\r\n" + 
				"				</tr>\r\n" + 
				"				<tr>\r\n" + 
				"					<td>Remember Me</td>\r\n" + 
				"					<td><input type='checkbox' name='rememberme' value='checked'></td>\r\n" + 
				"				</tr>\r\n" + 
				"				<tr>\r\n" + 
				"					<td><button type='submit' value='login'>login</button></td>\r\n" + 
				"				</tr>\r\n" + 
				"				</form>\r\n" + 
				"				</fieldset>\r\n" + 
				"				<a href='register.html'></a>\r\n" + 
				"				\r\n" + 
				"			</table>");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req,resp);
	}

}

