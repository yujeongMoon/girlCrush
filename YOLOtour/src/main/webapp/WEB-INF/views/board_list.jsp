<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Travel Board</title>
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


<style>
div.gallery {
	margin: 5px;
	border: 1px solid #ccc;
	float: left;
	width: 180px;
}

div.gallery:hover {
	border: 1px solid #777;
}

div.gallery img {
	width: 100%;
	height: auto;
}

div.desc {
	padding: 15px;
	text-align: center;
}

form {
	margin: 5px;
	width: 100%;
	height: 100%;
}
form.box {
	overflow: hidden;
}
</style>

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
				<h1 class="text-white" align="right">Let's go on a trip :)</h1>
			</div>
		</div>
	</div>
	</section>

	<!-- board -->
	<form class="price-area section-gap box">
		<div class="container">
			<div>
				<div class="single-price">
					<div class="gallery">
						<a target="_blank" href="Maldives.jpg"> <img
							src="img/Maldives.jpg" alt="5Terre" width="1000" height="800">
						</a>
						<div class="desc">신혼부부 강력추천 몰디브여행 초특가!!</div>
					</div>

					<div class="gallery">
						<a target="_blank" href="Nepal.jpg"> <img src="img/Nepal.jpg"
							alt="Nepal" width="1000" height="800">
						</a>
						<div class="desc">맨날 가던데 말고 네팔한번 가보자!</div>
					</div>

					<div class="gallery">
						<a target="_blank" href="NewYork.jpg"> <img
							src="img/NewYork.jpg" alt="NewYork" width="1000" height="800">
						</a>
						<div class="desc">뉴욕에서 뉴요커가 되어보자 BAAM!!!</div>
					</div>

					<div class="gallery">
						<a target="_blank" href="Singapore.jpg"> <img
							src="img/Singapore.jpg" alt="Singapore" width="1000" height="800">
						</a>
						<div class="desc">싱가포르에서 여름휴가 얼마나 재밌게요~~!</div>
					</div>

					<div class="gallery">
						<a target="_blank" href="SriLanka.jpg"> <img
							src="img/SriLanka.jpg" alt="SriLanka" width="1000" height="800">
						</a>
						<div class="desc">스리랑카.. 어디까지 가봤니?</div>
					</div>

					<div class="gallery">
						<a target="_blank" href="Thiland.jpg"> <img
							src="img/Thiland.jpg" alt="Thiland" width="1000" height="800">
						</a>
						<div class="desc">마사지는 역시 태국이지 사와디캅!</div>
					</div>

				</div>
			</div>
		</div>
	</form>

	<c:import url="footer.jsp"></c:import>
	
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>

</body>
</html>
