<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	${enrollmentMsg} 
</h1>
<br/>
<c:forEach var="course" items="${Courses}">
<table><tr>
<td>${course}</td>
</tr> </table>
</c:forEach>
</body>
</html>