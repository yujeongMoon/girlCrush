<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
</head>
<body>
	<c:import url="nav_top.jsp"></c:import>


	<!-- start banner Area -->
	<section class="about-banner relative">
	<div class="overlay overlay-bg"></div>
	<div class="container">
		<div class="row d-flex align-items-center justify-content-center">
			<div class="about-content col-lg-12">
				<h1 class="text-white">Let's go on a trip :)</h1>
			</div>
		</div>
	</div>
	</section>

	<!-- Travel list Area -->
	<section class="price-area section-gap">
	<div class="container">
	
		<div class="row d-flex justify-content-center">
			<div class="menu-content pb-70 col-lg-8">
				<div class="title text-center">
					<h1 class="mb-10"></h1>
				</div>
			</div>
		</div>
		
		<div class="col-lg-4">
			<div class="travelboard">
				<ul class="travel-list">
					<li class="d-flex justify-content-between align-items-center">
						<span>New York</span> <a href="NY" class="view-btn">VIEW</a>
					</li>
					<li class="d-flex justify-content-between align-items-center">
						<span>Maldives</span> <a href="Maldi" class="view-btn">VIEW</a>
					</li>
					<li class="d-flex justify-content-between align-items-center">
						<span>Sri Lanka</span> <a href="SL" class="view-btn">VIEW</a>
					</li>
					<li class="d-flex justify-content-between align-items-center">
						<span>Nepal</span> <a href="NP" class="view-btn">VIEW</a>
					</li>
					<li class="d-flex justify-content-between align-items-center">
						<span>Thiland</span> <a href="TL" class="view-btn">VIEW</a>
					</li>
					<li class="d-flex justify-content-between align-items-center">
						<span>Singapore</span> <a href="SP" class="view-btn">VIEW</a>
					</li>
				</ul>
			</div>
		</div>
		
	</div>
	
	</section>
</body>
</html>
