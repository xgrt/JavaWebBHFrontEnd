<%--
  Created by IntelliJ IDEA.
  User: xgrt
  Date: 2023/2/1
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSON基础语法</title>
</head>
<body>
<script>
    //定义JSON
    var json={
        "name":"xgrt",
        "age":18,
        "addr":["北京","上海","西安"]
    };

    //获取值
    alert(json.name);
</script>
</body>
</html>
