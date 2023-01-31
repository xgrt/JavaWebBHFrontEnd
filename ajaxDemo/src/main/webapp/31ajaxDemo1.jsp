<%--
  Created by IntelliJ IDEA.
  User: xgrt
  Date: 2023/1/31
  Time: 13:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>ajaxDemo1</title>
</head>
<body>
<script>
    //1. 创建核心对象
    var xhttp;//核心对象创建
    if (window.XMLHttpRequest) {
        xhttp = new XMLHttpRequest();//针对新版浏览器
    } else {
        // 针对IE6, IE5老版浏览器
        xhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }

    //2. 发送请求
    xhttp.open("GET", "http://localhost:8080/ajaxServlet");//第一个参数是访问方式，第二个要写访问的全路径
    xhttp.send();

    //3. 获取响应
    xhttp.onreadystatechange = function () {
        //readyState（准备状态）：4：请求完成且响应已就绪
        //status：200："OK"
        if (this.readyState === 4 && this.status === 200) {
            alert(this.responseText);
        }
    };
</script>
</body>
</html>
