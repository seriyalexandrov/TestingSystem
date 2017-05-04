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
<h1>${course.name}</h1>
<h3><p>${course.info}</p></h3>

<ul>
    <c:forEach var="test" items="${course.testList}">
        <li><p><a href="../test/${test.id}">${test.name}</a></p></li>
    </c:forEach>
</ul>
</body>
</html>
