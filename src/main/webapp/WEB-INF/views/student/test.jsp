<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Questions</title>
    <link rel="stylesheet" href="<c:url value='/styles/default.css'/>">
</head>
<body>
<h1>TEST</h1>

<ul>
    <form method="post">
        <c:forEach var="question" items="${questions}">
            <li><p><b>${question.text}</b></p></li>
            <c:forEach var="answer" items="${question.answers}">
                <p><input type="radio" name="${question.id}" value="${answer}"/>${answer}</p>
            </c:forEach>
        </c:forEach>
        <input type="submit" value="Send"/>
    </form>
</ul>
</body>
</html>
