<%@ page import="cartPacage.Cart" %><%--
  Created by IntelliJ IDEA.
  User: andrey
  Date: 28.09.2019
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
<%@page import="cartPacage.Cart" %>
<% Cart cart =(Cart)session.getAttribute("cart");%>
<p>Наименование <%=cart.getName() %></p>
<p>Количество <%=cart.getQuantity() %></p>

</body>
</html>
