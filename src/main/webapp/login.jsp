<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SL DevCode..!!</title>
</head>
<body bgcolor="cyan">

	<h1 align="center">Welcome to login page</h1>

	<form action="loginRegister" method="post">
		<table
			style="background-color: white; margin-left: 500px; margin-top: 50px">

			<tr>
				<td><h3 style="color: black;">${message}</h3>
					<h3 style="color: white;">${successMessage}</h3></td>
				<td></td>
			</tr>

			<tr>
				<td><h3 style="color: black;">Login</h3></td>
				<td></td>
			</tr>

			<tr>
				<td>UserName :</td>
				<td><input type="text" name="username"></td>
			</tr>

			<tr>
				<td>Password :</td>
				<td><input type="password" name="password1"></td>
			</tr>

			<tr>
				<td><input type="submit" name="submit" value="login"></td>
				<td><a href="Register.jsp">Registration</a></td>
			</tr>
		</table>
	</form>

</body>
</html>