<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + 	request.getServerPort() + request.getContextPath() + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Ajax</title>
    <script src="js/jquery-1.8.3.min.js"></script>
    <script>
        $(function () {
            $("#djBtn").click(
                function () {
                    $.ajax({
                        url : "servlet03.do",//访问后台servlet地址
                        type : "get", //请求方式
                        dataType : "json", //从后台接收数据的方式 text或者json
                        // async : true,
                        success : function (data) {
                            //回调函数(后台执行完毕后才会执行)
                            //data：从后台响应回来的数据
                            alert(data);
                        }
                    })
                })
        })
    </script>
</head>
<body>

<button id="djBtn">点击</button>

</body>
</html>
