<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<link href='<c:url value = "/resources/assets/plugins/material-preloader/css/materialPreloader.min.css"/>'	rel="stylesheet">
</head>
<body>	
	<div class="row">	
	<c:forEach items="${danhsachsanpham}" var="sanpham">
		<div class="col s12 m6 l3">
			<div class="card white">
				<div class="card-content center" style="padding: 10px !important"> 
					<a href="chitiet/${sanpham.getMasanpham()}">
						<div class="card">
							<div class="card-image" style="height: 200px;">
								<img style="height: 100%" src='<c:url value = "/resources/Image/HinhSanPham/${sanpham.getHinhsanpham()}"/>' alt="${sanpham.getTensanpham()}"> 
								<span class="card-title" style="line-height: 5px; padding:1rem; color:black !important; background: rgba(255,255,255,0.7); font-weight:bold;">${sanpham.getGiatien()}đ</span>
							</div>
							<div style="background:rgba(0,102,255,1); margin-top:0.2em">
								<p class="z-depth-1" style="color:white; font-weight: bold; font-size: 1.3em;">
								<c:choose>
							       <c:when test="${sanpham.getTensanpham().length() < 30}">
							              ${sanpham.getTensanpham()}
							       </c:when>
							       <c:otherwise>
							         ${sanpham.getTensanpham().substring(0,27)}...
							       </c:otherwise>
							  </c:choose>
								</p>
							</div>
							<div class="card-content" style="padding:10px !important">
								<p>Thông tin sản phẩm</p>
							</div>
							<a href="#">	
								<div class="card-action z-depth-1" style="padding:3% !important; font-weight: bold; ">
									<i class="material-icons dp48">shopping_cart</i>
									<label style="color:#0033FF; font-size: 1.2rem">Thêm vào giỏ hàng</label>
								</div>
							</a>
						</div>	
					</a>
				</div>
			</div>
		</div>
		</c:forEach>	
		<script src='<c:url value = "/resources/assets/plugins/jquery/jquery-2.2.0.min.js"/>'></script>
		<script	src='<c:url value = "/resources/assets/plugins/material-preloader/js/materialPreloader.min.js"/>'></script>
	</div>
</body>
</html>