<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<h1> GetMyCar</h1>
<form action="adduser">
			<table style="width: 50%">
				<tr>
					<td>ID </td>
					<td><input type="text" name="ID" /></td>
				</tr>
				<tr>
					<td>UserName</td>
					<td><input type="text" name="username" /></td>
				</tr>
				<tr>
					<td>Mobile</td>
					<td><input type="text" name="mobile" /></td>
				</tr>
					<tr>
					<td>UserType</td>
					<td><select name="usertype" id="usertype">
    <option value="user">user</option>
    <option value="vendor">vendor</option>
    <option value="admin">admin</option>
    
  </select> </td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email"/></td>
				</tr>
				</table>
			<input type="submit" value="Submit" /></form>
</body>
</html>