<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
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
                        url: "servlet04.do",//访问后台servlet地址
                        type: "get", //请求方式
                        dataType: "json", //从后台接收数据的方式 text或者json
                        // async : true,
                        success: function (data) {
                            $("#io").html(data.s1.id);
                            $("#no").html(data.s1.name);
                            $("#ao").html(data.s1.age);

                            $("#it").html(data.s2.id);
                            $("#nt").html(data.s2.name);
                            $("#at").html(data.s2.age);
                        }
                    })
                })
        })
    </script>
</head>
<body>

<button id="djBtn">点击</button>
<br/>
<br/>
学员一：<br/>
编号：<span id="io"></span><br/>
姓名：<span id="no"></span><br/>
年龄：<span id="ao"></span><br/>
<br/>
学员二：<br/>
编号：<span id="it"></span><br/>
姓名：<span id="nt"></span><br/>
年龄：<span id="at"></span><br/>

</body>
</html>
