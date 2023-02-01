<%--
  Created by IntelliJ IDEA.
  User: xgrt
  Date: 2023/1/31
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>axiosDemo</title>
</head>
<body>
<script src="js/axios.js"></script>
<script>
    //1.get
    /*axios({
        method: "get",
        url:"http://localhost:8080/axiosServlet?username=xgrt"
    }).then(function (resp){
        alert(resp.data);
    });*/

    //2.post
    axios({
        method: "post",
        url:"http://localhost:8080/axiosServlet?username=xgrt",
        data:"username=xgrt"
    }).then(function (resp){
        alert(resp.data);
    });
</script>
</body>
</html>
