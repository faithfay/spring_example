
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title></title>
</head>
<body>
<%--用JSTL顯示i18n的值--%>
<p><fmt:message key="my.i18n.name"/></p>
<p><a href="i18n?locale=zh_TW">chinese</a></p>
<p><a href="i18n?locale=en_US">english</a></p>
</body>
</html>
