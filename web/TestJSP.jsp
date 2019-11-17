<%--
  Created by IntelliJ IDEA.
  User: andrey
  Date: 26.09.2019
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FirstJSP</title>
</head>
<body>
<p>
 <%@page import="java.util.Date,logic.TestClass" %>
    <%TestClass testClass = new TestClass(); %>
    <%=testClass.getinfo() %>

</p>
<h1>Testing JSP </h1>
<p>
<%java.util.Date now = new java.util.Date();
String someString = "Текущая Дата;"+ now; %>
<%= someString %>
</p>
</body>
</html>
