<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Ajax</title>
    <script src="js/jquery-1.8.3.min.js"></script>

</head>
<body>
<h3>学生信息管理系统</h3>

<br/><br/>

<a href="student/add.do">添加操作</a><br/><br/>
<a href="student/update.do">修改操作</a><br/><br/>
<a href="student/delete.do">删除操作</a><br/><br/>
<a href="student/select.do">查询操作</a>
</body>
</html>
