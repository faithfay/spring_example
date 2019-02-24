
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="userbase" method="post">
<%--名稱對應bean的屬性名--%>
    name: <input type="text" name="name"/><br/>
    city: <input type="text" name="address.city"/><br/>
    <input type="submit" value="summit">
</form>

<p>User info</p>
<p>name:${userinfo.name}</p>
<p>city:${userinfo.address.city}</p>
</body>
</html>
