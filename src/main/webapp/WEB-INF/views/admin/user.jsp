<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@
        taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@
        taglib prefix="spring" uri="http://www.springframework.org/tags"
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Users</title>
</head>
<body>
<h1>Users</h1>
<form:form action="" method="post" modelAttribute="user">
    <div>
        <div>
            <form:label for="name" path="name">Name:</form:label>
            <form:errors path="name"/>
            <form:input path="name"/>
        </div>
        <div class="field">
            <form:label for="password" path="password">Password:</form:label>
            <form:errors path="password"/>
            <form:input path="password"/>
        </div>
    </div>

    <div>
        <input type="submit" value="Create new user">
    </div>
</form:form>

<form:form action="" method="put" modelAttribute="userGrid">
    <table>
        <thead>
        <tr>
            <th>Name</th>
            <th>Password</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="user" items="${userGrid}">
            <tr>
                <td>
                        ${user.name}
                </td>
                <td>
                        ${user.password}
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</form:form>
</body>
</html>
