
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>pojo form example</p>

<form:form action="validexample" method="post" modelAttribute="validexp">
    name: <form:input path="name" /><form:errors path="name"></form:errors><br/>
    age: <form:input path="age" /><br/>
    email: <form:input path="email" /><br/>
    birthday: <form:input path="birthday"/><br/>
    <input type="submit" value="submit">
</form:form>


</body>
</html>
