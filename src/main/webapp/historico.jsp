><%--
  Created by IntelliJ IDEA.
  User: victo
  Date: 24/02/2023
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Historico de operações</title>
</head>
<body>
<h1 align="center"> Usuários cadastrados na sessão:</h1>
<c:forEach items="${historico_usuarios}" var="usuarios">
  <h3 align="center"><c:out value="${usuarios}" /></h3>
</c:forEach>

</body>
</html>
