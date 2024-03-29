<%--
  Created by IntelliJ IDEA.
  User: luten
  Date: 2022/3/25
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8" />
    <title></title>
    <link rel="stylesheet" href="css/bootstrap.css" />
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        a {
            text-decoration: none;
            color: #ffffff;
        }

        .logoimg {
            margin-left: 200px;
            margin-top: 50px;
        }

        .sdxt {
            margin-top: -70px;
            margin-left: 760px;
            color: rgba(16, 16, 16, 100);
            font-size: 28px;
            text-align: left;
            font-family: "微软雅黑";
        }

        .main {
            width: 1920px;
            height: 762px;
            background-image: url(img/logo_img.png);
            margin-top: 50px;

            position: absolute;
        }

        .htdl_div {
            background-color: white;
            width: 432px;
            height: 388px;
            margin-top: 150px;
            margin-left: 1400px;
            opacity: 0.75;
            position: absolute;
        }

        .htdl {
            width: 96px;
            height: 35px;
            color: rgba(16, 16, 16, 100);
            font-size: 24px;
            font-family: SourceHanSansSC-regular;
            margin-top: 20px;
            margin-left: 50px;

        }

        .txt1 img {
            width: 35px;
            height: 35px;
            opacity: 1;
            margin-left: 20px;
            margin-right: 20px;
            line-height: 35px;
        }

        .txt1 {
            margin-top: 40px;
        }

        .txt1 input {
            width: 293px;
            height: 46px;
            color: black;
            font-size: 20px;
            text-align: center;
            font-family: Microsoft Yahei;
            border: 1px solid rgba(187, 187, 187, 100);
            opacity: 1;
        }

        .btn {
            margin-left: 25px;
            margin-top: 40px;
            width: 350px;
            height: 46px;
            border-radius: 4px;
            background-color: rgba(16, 26, 122, 100);
            color: rgba(255, 255, 255, 100);
            font-size: 18px;
            text-align: center;
            font-family: Microsoft Yahei;

        }
    </style>

</head>

<body>
<div class="top">
    <img src="./img/sdcit_logo__blue.png" class="logoimg">
    <div class="sdxt">
        师德考核测评系统
    </div>
</div>
<div class="main">
    <div class="htdl_div">
        <div class="htdl">
            <span>后台登录</span>
        </div>
        <form action="<%=request.getContextPath()%>/login" method="post">
            <!-- 输入用户名 -->
            <div class="txt1">
                <img src="img/main.png">
                <input type="text" name="name" id="admin"  required="required" placeholder="请输入用户名" />
            </div>
            <!-- 输入密码 -->
            <div class="txt1">
                <img src="img/lock.png">
                <input type="password" name="password" id="password"  required="required" placeholder="请输入密码" />
            </div>
            <%
                if(request.getAttribute("message")!= null){
                    out.print(request.getAttribute("message"));
                }
            %>
            <!-- 点击按钮跳转 -->
            <input type="submit" class="btn" value="登录">
        </form>
    </div>
</div>

<script src="./js/jquery.min.js"></script>
<script src="./js/bootstrap.js"></script>
<script src="./js/bootstrap.bundle.js"></script>
</script>
</body>
</html>
