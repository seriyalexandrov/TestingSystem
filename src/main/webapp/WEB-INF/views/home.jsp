<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
</head>
<body>
<p>Go to <a href="<c:url value='admin/user' />">Users Management</a></p>
<p>Go to <a href="<c:url value='student/courses' />">Courses</a></p>
<p>Go to <a href="<c:url value='student/questions' />">Test Questions</a></p>
<a href="<c:url value="j_spring_security_logout" />"> Logout</a>
</body>
</html>
