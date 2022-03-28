<%@ page import="com.dashuju1.Entity.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.dashuju1.Dao.UserDao" %><%--
  Created by IntelliJ IDEA.
  User: luten
  Date: 2022/3/25
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/bootstrap.css"/>
    <title>首页</title>
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

        .main-middle {
            display: flex;
        }

        .chaxun {
            width: 120px;
            height: 30px;
            border-radius: 4px;
            margin-right: 60px;
            margin-top: 15px;
            background-color: forestgreen; /**rgba(16, 26, 122, 100)**/
            color: rgba(255, 255, 255, 100);
            font-size: 14px;
            text-align: center;
            font-family: Microsoft Yahei, serif;
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

        .status {
            width: 60px;
            height: 20px;
            border-radius: 4px;
            margin-right: 60px;
            margin-top: 15px;
            float: left;
            /*background-color: forestgreen; !**rgba(16, 26, 122, 100)**!*/
            font-size: 14px;
            text-align: center;
            font-family: Microsoft Yahei, serif;
        }
        #del{
            width:60px;
            height:20px;
            background:url(img/s.png) no-repeat center;
            cursor:pointer;
            /* 上面的代码是常规设置， 即：引入一个图片背景，设置在中心位置，大小和按钮的大小一致，以及鼠标指针为手型 */

            display:block;
            font-size:0;
            line-height:0;
            text-indent:-9999px;
            /* 上面的不用多问，四句一起拷贝就可以了，大概意思就是把value值设置为0像素，也就是肉眼无法看到，但却又是存在的（用$_POST['submit_btn'] 可以证明）*/
        }
    </style>
    <%
        UserDao d = new UserDao();
        ArrayList<User> users = d.ShouAllUser();
    %>
</head>

<body>
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
<div class="main">
    <div class="jckb">
        <div class="card-header">
            <span class="jckb-top">后台管理</span>
        </div>
        <div class="main-middle">
            <div class="card">
                <div class="card-body"
                     style="left: 60px;top: 306px;width: 1500px;line-height: 20px;text-align: center;">
                    <div class="am-g">
                        <button type="submit" class="chaxun" value="addUser" style="float:left; margin-bottom: 10px;"
                                onclick="jump()">
                            <span class="am-icon-plus"></span> + 添加用户
                        </button>
                    </div>

                    <div class="am-g">
                        <div class="am-u-sm-12">
                            <form class="am-form">
                                <table class="table table-striped">
                                    <thead>
                                    <tr>
                                        <th class="table-id">
                                            序号
                                        </th>
                                        <th class="table-title">
                                            用户名
                                        </th>
                                        <th class="table-title">
                                            密码
                                        </th>
                                        <th class="table-author">
                                            操作
                                        </th>
                                    </tr>
                                    <%--向表格中填数据--%>
                                    <%
                                        if (users != null) {
                                            for (int i = 0; i < users.size(); i++) {
                                                User u = users.get(i);
                                                String id = u.getUser_id();
                                                String tno = u.getUser_tno();
                                                String pass = u.getUser_pass();
                                    %>
                                    <tr>
                                        <th><%=id%>
                                        </th>
                                        <td><%=tno%>
                                        </td>
                                        <td><%=pass%>
                                        </td>
                                        <td>
                                            <form action="UpdateUser.jsp" method="post">
                                                <input type="submit" class="status" style="background-color: skyblue" value="修改密码">
                                            </form>
                                           <form action="DropUserServlet" method="post">
                                               <input type="submit" value="<%=id%>" id="del" name="id">
                                           </form>
                                        </td>
                                    </tr>
                                    <%
                                            }
                                        }
                                    %>
                                    </thead>
                                </table>
                            </form>
                        </div>
                    </div>
                </div>
                <!-- content end -->

            </div>
        </div>
    </div>
</div>
</div>
</div>
<script type="text/javascript">
    function jump() {
        window.location.href = "addUser.jsp"
    }
</script>
</body>
</html>
