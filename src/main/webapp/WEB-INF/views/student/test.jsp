<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Users</title>
    <link rel="stylesheet" href="<c:url value='/styles/default.css'/>">
</head>
<body>
<h1>TEST</h1>

<ul>
    <c:forEach var="question" items="${questions}">
        <li>${question.question}</li>
        <ul>
            <c:forEach var="answer" items="${question.answers}">
                <li>${answer}</li>
            </c:forEach>
        </ul>
    </c:forEach>
</ul>
</body>
</html>
