<%@ page contentType="text/html;charset=UTF-8" %>
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
                    // $("#msg").html(123)
                    /*
                设置async:true 异步
                通过观察得到结果，下面的alert弹框没有等到上面的ajax执行完毕，就执行了
                全程是两根线程，一根主线程负责执行方法中普通的代码，一根线程负责执行ajax
                两根线程彼此之间相互独立，互相是不受影响的

                async:false 同步
                通过观察得到结果，下面的alert弹框必须要等到上面的ajax执行完毕后，才能够执行
                全程是一根线程，线程是按照代码从上向下的顺序依次执行
                下面的代码必须要等到上面的代码执行完毕后，才能够执行


               未来实际项目开发中，一般情况下，我们都是使用异步请求可以有效的提升用户体验
               在特殊需求下，也会使用到同步
                     */
                    $.ajax({
                        url: "servlet02.do",//访问后台servlet地址
                        // data : {
                        //     "key1" : "value1",
                        //     "key2" : "value2"
                        // },
                        type: "get", //请求方式
                        dataType: "json", //从后台接收数据的方式 text或者json
                        // async : true,
                        success: function (data) {
                            //回调函数(后台执行完毕后才会执行)
                            //data：从后台响应回来的数据
                            alert(data.str1);
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
