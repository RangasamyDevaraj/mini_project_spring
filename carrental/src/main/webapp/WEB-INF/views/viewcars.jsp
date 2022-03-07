<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view Cars</title>
</head>
<body>
<h1>Cars Details</h1>
<table>
<tr>
<th> carName</th>
<th> carNum</th>
<th> carType</th>
<th> ownerName</th>
</tr>
<c:forEach items="${cars}" var="c">
<tr>
<td><c:out value="${c.getCarname()}"></c:out></td>

<td><c:out value="${c.getCarnum()}"></c:out></td>

<td><c:out value="${c.getCartype()}"></c:out></td>

<td><c:out value="${c.getOwnername()}"></c:out></td>

</tr>
</c:forEach>
</table>
</body>
</html>