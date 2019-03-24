<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        
        <!-- Title -->
        <title>TanoShop | Đăng nhập</title>
        
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
        <meta charset="UTF-8">
        <meta name="description" content="Responsive Admin Dashboard Template" />
        <meta name="keywords" content="admin,dashboard" />
        <meta name="author" content="Steelcoders" />
        
        <!-- Styles -->
        <link type="text/css" rel="stylesheet" href='<c:url value = "/resources/assets/plugins/materialize/css/materialize.min.css"/>'/>
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href='<c:url value = "/resources/assets/plugins/material-preloader/css/materialPreloader.min.css"/>' rel="stylesheet">        

        	
        <!-- Theme Styles -->
        <link href='<c:url value = "/resources/assets/css/alpha.min.css"/>' rel="stylesheet" type="text/css"/>
        <link href='<c:url value = "/resources/assets/css/custom.css"/>' rel="stylesheet" type="text/css"/>
     
    </head>
    <body class="signin-page">
        <div class="loader-bg"></div>
        <div class="loader">
            <div class="preloader-wrapper big active">
                <div class="spinner-layer spinner-blue">
                    <div class="circle-clipper left">
                        <div class="circle"></div>
                    </div><div class="gap-patch">
                    <div class="circle"></div>
                    </div><div class="circle-clipper right">
                    <div class="circle"></div>
                    </div>
                </div>
                <div class="spinner-layer spinner-red">
                    <div class="circle-clipper left">
                        <div class="circle"></div>
                    </div><div class="gap-patch">
                    <div class="circle"></div>
                    </div><div class="circle-clipper right">
                    <div class="circle"></div>
                    </div>
                </div>
                <div class="spinner-layer spinner-yellow">
                    <div class="circle-clipper left">
                        <div class="circle"></div>
                    </div><div class="gap-patch">
                    <div class="circle"></div>
                    </div><div class="circle-clipper right">
                    <div class="circle"></div>
                    </div>
                </div>
                <div class="spinner-layer spinner-green">
                    <div class="circle-clipper left">
                        <div class="circle"></div>
                    </div><div class="gap-patch">
                    <div class="circle"></div>
                    </div><div class="circle-clipper right">
                    <div class="circle"></div>
                    </div>
                </div>
            </div>
        </div>
        <div class="mn-content valign-wrapper">
            <main class="mn-inner container">
                <div class="valign">
                      <div class="row">
                          <div class="col s12 m6 l4 offset-l4 offset-m3">
                              <div class="card white darken-1">
                                  <div class="card-content ">
                                      <span class="card-title">Đăng Nhập</span>
                                       <div class="row">
                                            <div class="input-field col s12">
                                                   <input id="tendangnhap" name="tendangnhap" type="text" class="validate">
                                                   <label for="tendangnhap">Tài Khoản</label>
                                               </div>
                                               <div class="input-field col s12">
                                                   <input id="matkhau" name="matkhau" type="password" class="validate">
                                                   <label for="matkhau">Mật khẩu</label>
                                               </div>
                                               <div class="col s12 right-align m-t-sm">
                                                   <a href="dangky" class="waves-effect waves-grey btn-flat">Đăng ký</a>
                                                   <input type="button" id="btnDangNhap" class="waves-effect waves-light btn teal" value="Đăng nhập"></input>
                                               </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                    </div>
                </div>
            </main>
        </div>
        
        <!-- Javascripts -->
        <script src='<c:url value = "/resources/assets/plugins/jquery/jquery-2.2.0.min.js"/>'></script>
        <script src='<c:url value = "/resources/assets/plugins/materialize/js/materialize.min.js"/>'></script>
        <script src='<c:url value = "/resources/assets/plugins/material-preloader/js/materialPreloader.min.js"/>'></script>
        <script src='<c:url value = "/resources/assets/plugins/jquery-blockui/jquery.blockui.js"/>'></script>
        <script src='<c:url value = "/resources/assets/js/alpha.min.js"/>'></script> 
        <script src='<c:url value = "/resources/js/custom.js"/>'></script>   
    </body>
</html>