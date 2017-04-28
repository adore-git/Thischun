<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>南方微博</title>
</head>
<link rel="stylesheet" type="text/css" href="/css/index.css"/>
<link rel="stylesheet" type="text/css" href="/js/bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
<script src="/js/bootstrap-3.3.7-dist/js/jquery-2.1.1.min.js" type="text/javascript" charset="utf-8"></script>
<script src="/js/bootstrap-3.3.7-dist/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
<body background="/img/index.jpg">
<h1 id="h1">南方微博</h1>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="tabbable" id="tabs-711412">
                <ul class="nav nav-tabs">
                    <li class="active">
                        <a href="#panel-730951" data-toggle="tab">注册</a>
                    </li>
                    <li>
                        <a href="#panel-289535" data-toggle="tab">登录</a>
                    </li>
                </ul>
                <div class="tab-content">
                    <div class="tab-pane active" id="panel-730951">
                        <div class="section-1">
                            <div class="t1">
                                <br/><br/><br/>

                                <%--注册--%>
                                <form action="/regist" method="post">
                                    <input class="text"  name="oemail"  placeholder="邮箱/用户名" type="text" >
                                    <br/><br/>
                                    <input class="text" name="opassword"   placeholder="密码" type="password" >
                                    <br/><br/>
                                    <button  type="submit" class="b1">注册</button>
                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="tab-pane" id="panel-289535">
                        <div class="section-2">
                            <div class="t1">
                                <br/><br/><br/>
                                <%--     登录--%>
                                <form action="/loginDo" method="post">
                                    <input class="text" name="oemail"  placeholder="邮箱/用户名" type="text" ><br/>
                                                <br/>
                                    <input class="text" name="opassword"  placeholder="密码"  type="password" >
                                                <br/><br/>
                                    <button  type="submit" class="b1">登录</button>
                                    <div id="d2">
                                        <input type="checkbox" id="type-checkbox" name="vehicle" value="Bike">
                                        <span id="s1">记住密码</span>
                                    </div>
                                </form>


                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>

