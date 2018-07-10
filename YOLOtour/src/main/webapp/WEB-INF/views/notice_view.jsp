<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="/">
<title>Notice</title>
<link rel="stylesheet" href="css/linearicons.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/magnific-popup.css">
<link rel="stylesheet" href="css/jquery-ui.css">
<link rel="stylesheet" href="css/nice-select.css">
<link rel="stylesheet" href="css/animate.min.css">
<link rel="stylesheet" href="css/owl.carousel.css">
<link rel="stylesheet" href="css/main.css">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<c:import url="nav_top.jsp"></c:import>
	<!-- #header -->
	<!-- start banner Area -->
	<section class="about-banner relative">
	<div class="overlay overlay-bg"></div>
	<div class="container">
		<div class="row d-flex align-items-center justify-content-center">
			<div class="about-content col-lg-12">
				<h1 class="text-white">Notice</h1>
				<p class="text-white link-nav">
					<a href="/">Home </a> <span class="lnr lnr-arrow-right"></span> <a
						href="/mypage"> Notice</a>
				</p>
			</div>
		</div>
	</div>
	</section>

	<!-- board -->
	<section class="price-area section-gap">
	<div class="container">
		<div class="row d-flex justify-content-center">
			<div class="menu-content pb-70 col-lg-8">
				<div class="title text-center">
					<h1 class="mb-10">Notice</h1>
				</div>
			</div>
		</div>
		<div>
			<div class="single-price">
				<h4>Notice</h4>
				<div class="row">
					<div class="col-xs-8 col-sm-8 col-md-8 col-lg-8">
						<ul class="pagination">
							<c:set var="target" value="boards" />
							<c:if test="${pager.rows==0 }">
								<li class="active"><a href="#">1</a></li>
							</c:if>
							<c:if test="${pager.rows > 0 }">
								<c:set var="common"
									value="size=${pager.size }&bsize=${pager.bsize }" />
								<c:if test="${pager.bspage > pager.bsize }">
									<c:set var="home" value="page=1&${common }" />
									<c:set var="prev" value="page=${pager.bspage-1 }&${common }" />
									<li><a href="${target }?${home }">Home</a></li>
									<li><a href='<c:url value="${target }?${prev }"/>'>&laquo;</a></li>
								</c:if>
								<c:forEach var="pno" begin="${pager.bspage }"
									end="${pager.bepage }">
									<c:if test="${pno==pager.page }">
										<li class="active"><a href="#">${pno }</a></li>
									</c:if>
									<c:if test="${pno!=pager.page }">
										<c:if test="${pno <= pager.pages }">
											<c:set var="page" value="page=${pno }&${common }" />
											<li><a href='<c:url value="${target }?${page }"/>'>${pno }</a></li>
										</c:if>
									</c:if>
								</c:forEach>
								<c:if test="${pager.bepage < pager.pages }">
									<c:set var="next" value="page=${pager.bepage+1 }&${common }" />
									<c:set var="last" value="page=${pager.pages }&${common }" />
									<li><a href='<c:url value="${target }?${next }"/>'>&raquo;</a></li>
									<li><a href="${target }?${last }">Last</a></li>
								</c:if>
							</c:if>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	</section>

	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
	<c:import url="footer.jsp"></c:import>
</body>
</html>
