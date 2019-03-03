
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>pojo form example</p>
<form action="userbase" method="post">
<%--名稱對應bean的屬性名--%>
    name: <input type="text" name="name"/><br/>
    city: <input type="text" name="address.city"/><br/>
    <input type="submit" value="summit">
</form>
<p>User info</p>
<p>name:${userBase.name}</p>
<p>city:${userBase.address.city}</p>

<p>model attribute example</p>
<form action="maa" method="post">
    <%--username:<input type="text" name="name" value="user1"/><br/>--%>
    password:<input type="password" name="passwd" value="password01"/><br/>
    age:<input type="text" name="age" value="11"/><br/>
    <input type="submit">
</form>

<p>request & session attribute</p>
<%--request & session的範例--%>
<p>requestScope: ${requestScope.userBase}</p>
<p>requestScope: ${requestScope.sessString}</p>
<p>session: ${sessionScope.userBase}</p>
<p>session: ${sessionScope.sessString}</p>
</body>
</html>
