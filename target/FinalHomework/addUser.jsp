<%--
  Created by IntelliJ IDEA.
  User: yi
  Date: 2022/3/27
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<link rel="stylesheet" href="css/bootstrap.css"/>
<!DOCTYPE html>
<html>

<head>
    <title>注册</title>
    <meta name="content-type" ; charset="UTF-8">
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        ol,
        li {
            list-style: none;
        }

        a {
            text-decoration: none;
        }

        .top {
            width: 1920px;
            height: 80px;
            background-color: rgba(16, 26, 122, 100);
        }

        .logo-img {
            margin-left: 177px;
            margin-top: 9px;
        }

        .sdxt {
            margin-left: 500px;
            margin-top: -50px;
            width: 224px;
            height: 19px;
            color: rgba(255, 255, 255, 100);
            font-size: 28px;
            text-align: left;
            font-family: SourceHanSansSC-regular;
        }

        .gly-img {
            width: 30px;
            height: 30px;
            margin-left: 1700px;
            margin-top: -9px;
        }

        .gly-ter {
            margin-left: 5px;
            width: 54px;
            height: 26px;
            color: rgba(255, 255, 255, 100);
            font-size: 18px;
            text-align: left;
            font-family: SourceHanSansSC-regular;
        }

        .exit-img {
            margin-top: -60px;
            margin-left: 1830px;
            width: 30px;
            height: 30px;

        }

        .jckb {
            margin-left: 200px;
            margin-top: 30px;
            width: 1500px;
            border: .3px solid rgba(238, 238, 238, 100);


        }

        .jckb-top {
            left: 191px;
            top: 123px;
            width: 97px;
            height: 23px;
            line-height: 23px;
            color: rgba(16, 16, 16, 100);
            font-size: 16px;
            text-align: left;
            font-family: Roboto;
        }

        .middle{
            margin: 60px;
        }

        .main-middle {
            display: flex;
        }

        .chaxun {
            width: 120px;
            height: 30px;
            border-radius: 4px;
            margin-right: 80px;
            margin-top: 30px;
            background-color: rgba(16, 26, 122, 100);
            color: rgba(255, 255, 255, 100);
            font-size: 14px;
            text-align: center;
            font-family: Microsoft Yahei;
        }

        .footer p {
            margin-top: 20px;
            width: 1400px;
            height: 30px;
            text-align: right;
        }

        .footer a {
            font-size: 13px;
        }

        .header1 button {
            position: absolute;
            right: 50px;
            top: 10px;
        }

    </style>
</head>

<body>
<div class="content" >
    <!--头部-->
    <div class="top">
        <img src="img/sdcit_logo__white.png" class="logo-img">
        <div class="sdxt">
            师德考核测评系统
        </div>
        <div class="gly">
            <img src="./img/main-1.png" alt="" class="gly-img">
            <span class="gly-ter">管理员</span>
        </div>
        <div class="exit">
            <a href="login.jsp"><img src="img/exit.png" class="exit-img"></a>
        </div>
    </div>
    <!--中部-->
    <div class="middle" align="center">
        <form action="AddUserServlet" method="post">
            <table border="0">
                <tr>
                    <td>用户名：</td>
                    <td><input type="text" name="username" required="required"></td>
                </tr>
                <tr>
                    <td>密 码：</td>
                    <td><input type="password" name="password" required="required"></td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" id="register" name="register" value="submit">
            </table>
        </form>
    </div>
</div>
</body>

</html>