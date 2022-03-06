<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add car</title>
</head>
<body>

<h1>GetMyCar</h1>

<form action="addingcar" method="post" >
			<table style="width: 50%; class:center; border:1px solid black">
				<tr>
					<td>CarName </td>
					<td><input type="text" name="carname" /></td>
				</tr>
				<tr>
					<td>CarNum</td>
					<td><input type="text" name="carnum" /></td>
				</tr>
				
					<tr>
					<td>CarType</td>
					<td>
					<select name="cartype" id="cartype">
    <option value="mini">mini</option>
    <option value="sedan">Sedan</option>
    <option value="Xuv">xuv</option></select> </td>
				</tr>
				<tr>
					<td>ownername</td>
					<td><input type="text" name="ownername"/></td>
				</tr>
				</table>
			<input type="submit" value="Submit" /></form>
</body>
</html>