<%--
  Created by IntelliJ IDEA.
  User: luten
  Date: 2022/3/25
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/bootstrap.css" />
    <title>后台管理</title>
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

        .department {
            margin-left: 10px;
            margin-top: 5px;
            width: 200px;
            height: 24px;
            line-height: 24px;
            color: rgba(16, 16, 16, 100);
            font-size: 18px;
            text-align: left;
            font-family: Roboto;
        }

        .num-departments {
            margin-left: 209px;
            margin-top: 72px;
            width: 80px;
            height: 44px;
            line-height: 44px;
            color: rgba(16, 16, 16, 100);
            font-size: 30px;
            text-align: left;
            font-weight: bold;
            font-family: Roboto;
        }

        .num-teachers {
            margin-left: 209px;
            margin-top: 72px;
            width: 80px;
            height: 44px;
            line-height: 44px;
            color: rgba(16, 16, 16, 100);
            font-size: 30px;
            text-align: left;
            font-weight: bold;
            font-family: Roboto;
        }

        .num-recycle {
            margin-left: 209px;
            margin-top: 72px;
            width: 80px;
            height: 44px;
            line-height: 44px;
            color: rgba(16, 16, 16, 100);
            font-size: 30px;
            text-align: left;
            font-weight: bold;
            font-family: Roboto;
        }

        .num-hrecycle {
            margin-left: 209px;
            margin-top: 72px;
            width: 80px;
            height: 44px;
            line-height: 44px;
            color: rgba(16, 16, 16, 100);
            font-size: 30px;
            text-align: left;
            font-weight: bold;
            font-family: Roboto;
        }

        .main-kndi {
            display: flex;
        }

        .semester {
            margin-left: -1075px;
            margin-top: 40px;
        }

        .bumen {
            margin-top: -30px;
            margin-left: -348px;
        }

        .xiala {
            margin-left: 8px;
            width: 200px;
            height: 30px;
            color: rgba(16, 16, 16, 100);
            font-size: 14px;
            font-family: Roboto;
            border: 1px solid rgba(187, 187, 187, 100);
        }

        .main-middle {
            display: flex;
        }

        .num {
            margin-left: 390px;
            margin-top: -30px;
        }

        .num-text {
            margin-left: 8px;
            width: 200px;
            height: 30px;
            color: rgba(136, 136, 136, 100);
            font-size: 14px;
            text-align: left;
            font-family: Microsoft Yahei;

        }

        .chaxun {
            width: 80px;
            height: 30px;
            border-radius: 4px;
            background-color: rgba(16, 26, 122, 100);
            color: rgba(255, 255, 255, 100);
            font-size: 14px;
            text-align: center;
            font-family: Microsoft Yahei;
        }
        .an{
            margin-left: 960px;
            margin-top: -30px;
        }
        .shugang{
            width: 25px;
            height: 20px;
            line-height: 30px;
            margin-left: 20px;
        }
        .main-foot-top-txt{

            font-weight: bold;
            line-height: 30px;
            color: rgba(16, 16, 16, 100);
            font-size: 16px;
            text-align: left;
            font-family: Roboto;
        }
        .main-foot{
            height: 30px;
            margin-top: 2px;
        }
        .biaoge{
            width: 1450px;
            height: 350px;
            margin-left:25px;
            margin-top: 2px;
            color: rgba(153, 153, 153, 100);
        }
        .tianshu{
            margin-left: 625px;
            color: rgba(0, 0, 0, 1);
            font-size: 12px;
            text-align: center;
            font-family: Roboto;
        }
        .footer p {
            margin-top: 20px;
            width: 1400px;
            height: 30px;
            text-align: right;
        }

        .footer .footer-span {
            color: red;
        }

        .footer a {
            font-size: 13px;
        }
        .shuru {
            width: 30px;
        }


        .header1 button {
            position: absolute;
            right: 50px;
            top: 10px;
        }
        .footer-xialai{
            width: 99px;
            height: 28px;
            opacity: 0.65;
            border-radius: 4px;
            background-color: rgba(255, 0, 0, 0);
            text-align: center;
            border: 1px solid rgba(217, 217, 217, 100);
        }
    </style>
</head>

<body>
<div class="top">
    <img src="img/sdcit_logo__white.png" class="logo-img">
    <div class="sdxt">
        师德考核测评系统
    </div>
    <div class="gly">
        <img src="./img/main-1.png" alt="" class="gly-img">
        <span class="gly-ter">管理员${user.getUser_tno}</span>
    </div>
    <div class="exit">
        <a href="login.jsp"><img src="img/exit.png" class="exit-img"></a>
    </div>
</div>
<div class="main">
    <div class="jckb">
        <div class="card-header">
            <span class="jckb-top">基础数据看板</span>
        </div>
        <div class="main-kndi">
            <!-- 部门个数 -->
            <div class="card-body">
                <div class="card" style="width: 20rem;">
                    <div class="card-body" style="width:550px;height: 200px;">
                        <div class="department">部门个数(个)</div>
                        <div class="num-departments">
                            15
                        </div>
                    </div>
                </div>
            </div>
            <!-- 教师人数 -->
            <div class="card-body">
                <div class="card" style="width: 20rem;">
                    <div class="card-body" style="width:550px;height: 200px;">
                        <div class="department">教师总数(人)</div>
                        <div class="num-teachers">
                            462
                        </div>
                    </div>
                </div>
            </div>
            <div class="card-body">
                <div class="card" style="width: 20rem;">
                    <div class="card-body" style="width:550px;height: 200px;">
                        <div class="department">本学期回收问卷(份)</div>
                        <div class="num-recycle">
                            152
                        </div>
                    </div>
                </div>
            </div>
            <div class="card-body">
                <div class="card" style="width: 20rem;">
                    <div class="card-body" style="width:550px;height: 200px;">
                        <div class="department">历史回收问卷(份)</div>
                        <div class="num-hrecycle">
                            67
                        </div>
                    </div>
                </div>
            </div>

        </div>
        <div class="main-middle">
            <div class="card">
                <div class="card-body"
                     style="left: 171px;top: 306px;width: 1500px;height: 127px;line-height: 20px;text-align: center;">
                    <div class="semester">
                        <!--  学期 -->
                        <span class="semester-text">学期</span>
                        <select name="xueqi" class="xiala">
                            <option value="2021-2022第1学期">2021-2022第1学期</option>
                            <option value="2020-2021第2学期">2020-2021第2学期</option>
                            <option value="2020-2021第1学期">2020-2021第1学期</option>
                        </select>

                    </div>
                    <div class="bumen">
                        <!-- 部门 -->
                        <span class="semester-text">部门</span>
                        <select name="xueqi" class="xiala">
                            <option value=""></option>

                        </select>
                    </div>
                    <!-- 输入学号/工号 -->
                    <div class="num">
                        <span class="num-we">工号/学号</span>
                        <input type="text" name="gonghao" id="gonghao" class="num-text" />
                    </div>
                    <!-- 点击按钮进行查询 -->
                    <div class="an">
                        <button type="button" class="chaxun">查询</button>
                    </div>


                </div>
            </div>
        </div>
        <div class="main-foot">
            <div class="main-foot-top">
                <img src="img/shugang.png"class="shugang" >
                <span class="main-foot-top-txt">详细数据</span>
            </div>
            <div class="biaoge">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th scope="col">工号</th>
                        <th scope="col">姓名</th>
                        <th scope="col">所属部门</th>
                        <th scope="col">总分</th>
                        <th scope="col">部门排名</th>
                        <th scope="col">全校排名</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <th scope="row">333</th>
                        <td>王国强</td>
                        <td>软件与大数据系</td>
                        <td>100</td>
                        <td>1</td>
                        <td>15</td>
                    </tr>
                    <tr>
                        <th scope="row">444</th>
                        <td>亓琳</td>
                        <td>软件与大数据系</td>
                        <td>99.86</td>
                        <td>2</td>
                        <td>100</td>
                    </tr>
                    <tr>
                        <th scope="row">333</th>
                        <td>王国强</td>
                        <td>软件与大数据系</td>
                        <td>100</td>
                        <td>1</td>
                        <td>15</td>
                    </tr>
                    <tr>
                        <th scope="row">444</th>
                        <td>亓琳</td>
                        <td>软件与大数据系</td>
                        <td>99.86</td>
                        <td>2</td>
                        <td>100</td>
                    </tr>
                    </tbody>
                </table>
                <div class="footer">
                    <div class="btn-toolbar mb-3" role="toolbar" aria-label="Toolbar with button groups">
                        <div class="btn-group mr-2" role="group" aria-label="First group">
                            <p>
                                <a>共<span class="footer-span">462</span>条</a>&nbsp;&nbsp;
                                <button type="button" class="btn btn-outline-primary" id="but1"><</button>
                                <button type="button" class="btn btn-outline-primary" id="but1">1</button>
                                <button type="button" class="btn btn-outline-primary" id="but1">2</button>
                                <button type="button" class="btn btn-outline-primary" id="but1">3</button>
                                <button type="button" class="btn btn-outline-primary" id="but1">4</button>
                                <button type="button" class="btn btn-outline-primary" id="but1">5</button>
                                <button type="button" class="btn btn-outline-primary" id="but1">...</button>
                                <button type="button" class="btn btn-outline-primary" id="but1">47</button>
                                <button type="button" class="btn btn-outline-primary" id="but1">></button> &nbsp;&nbsp;
                                <select name="yeshu" id="yeshu" class="footer-xialai">
                                    <option value="">10 / 条</option>
                                </select>
                                <a>跳至<input type="text" class="shuru" placeholder="1" />页</a>
                            </p>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </div>
</div>
</div>
<script src="./js/jquery.min.js"></script>
<script src="./js/bootstrap.js"></script>
<script src="./js/bootstrap.bundle.js"></script>
</body>
</html>

