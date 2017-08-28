<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head><title>Tables from database MYDB</title></head>
<body>
<h1>Table: expenses</h1>
<table border="2">
    <tr><th>NUM </th><th>PAYDATE </th><th>RECEIVER </th><th>VALUE </th></tr>
    <%= request.getAttribute("expenses")%>
</table>
<h1>Table: receivers</h1>
<table border="2">
    <tr>
        <th>NUM</th>
        <th>RECEIVER</th>
    </tr>
    <%= request.getAttribute("receivers")%>
</table>
</body>
</html>tml>