<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request" />
<% 
String id = "";
		Cookie[] cookies = request.getCookies();
		if(cookies!= null) { 
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("alwaysRemember")) {
					id = cookie.getValue();
				}
			}
		}
		%>
<body>

	<fieldset align='center'>
		<legend>Login</legend>
		<form action='./login' method='post'>
			<table align='center'>
				<h1 align='center'>Login Page</h1>
				<tr>
					<td>Id:</td>
					<td><input type='number' name='id' value='<%=id%>'></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type='password' name='password'></td>
				</tr>
				<tr>
					<td>Remember Me</td>
					<td><input type='checkbox' name='rememberme' value='checked'></td>
				</tr>
				<tr>
					<td><button type='submit' value='login'>login</button></td>
					<td><button type='submit' value='reset'>Reset</button></td>
				</tr>


				</form>
				</fieldset>
			</table>
			<a href='register.html'>Register here</a>
</body>
</html>