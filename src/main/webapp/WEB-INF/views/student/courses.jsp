<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Courses</title>
</head>
<body>
<h1>COURSES</h1>

<ul>
    <c:forEach var="course" items="${courses}">
        <li><p><a href="/${course.id}">${course.name}</a></p></li>
    </c:forEach>
</ul>
</body>
</html>
