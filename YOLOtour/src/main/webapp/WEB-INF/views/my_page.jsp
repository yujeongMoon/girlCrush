<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MyPage</title>
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
	<header id="header">
	<div class="header-top">
		<div class="container">
			<div class="row align-items-center">
				<div class="col-lg-6 col-sm-6 col-6 header-top-left">
					<ul>
						<li><a href="#">Visit Us</a></li>
						<li><a href="#">Buy Tickets</a></li>
					</ul>
				</div>
				<div class="col-lg-6 col-sm-6 col-6 header-top-right">
					<div class="header-social">
						<a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i
							class="fa fa-twitter"></i></a> <a href="#"><i
							class="fa fa-dribbble"></i></a> <a href="#"><i
							class="fa fa-behance"></i></a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="container main-menu">
		<div class="row align-items-center justify-content-between d-flex">
			<div id="logo">
				<a href="index.html"><img src="img/logo.png" alt="" title="" /></a>
			</div>
			<nav id="nav-menu-container">
			<ul class="nav-menu">
				<li><a href="index.html">Home</a></li>
				<li><a href="about.html">About</a></li>
				<li><a href="packages.html">Packages</a></li>
				<li><a href="hotels.html">Hotels</a></li>
				<li><a href="insurance.html">Insurence</a></li>
				<li class="menu-has-children"><a href="">Blog</a>
					<ul>
						<li><a href="blog-home.html">Blog Home</a></li>
						<li><a href="blog-single.html">Blog Single</a></li>
					</ul></li>
				<li class="menu-has-children"><a href="">Pages</a>
					<ul>
						<li><a href="elements.html">Elements</a></li>
						<li class="menu-has-children"><a href="">Level 2 </a>
							<ul>
								<li><a href="#">Item One</a></li>
								<li><a href="#">Item Two</a></li>
							</ul></li>
					</ul></li>
				<li><a href="contact.html">Contact</a></li>
			</ul>
			</nav>
			<!-- #nav-menu-container -->
		</div>
	</div>
	</header>
	<!-- #header -->


	<!-- start banner Area -->
	<section class="about-banner relative">
	<div class="overlay overlay-bg"></div>
	<div class="container">
		<div class="row d-flex align-items-center justify-content-center">
			<div class="about-content col-lg-12">
				<h1 class="text-white">My Page</h1>
				<p class="text-white link-nav">
					<a href="index.html">Home </a> <span class="lnr lnr-arrow-right"></span>
					<a href="about.html"> my page</a>
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
					<h1 class="mb-10">My page</h1>
				</div>
			</div>
		</div>
		<div class="col-lg-4">
			<div class="single-price">
				<h4>Cart</h4>
				<ul class="price-list">
					<li class="d-flex justify-content-between align-items-center">
						<span>New York</span> <a href="#" class="price-btn">$1500</a>
					</li>
					<li class="d-flex justify-content-between align-items-center">
						<span>Maldives</span> <a href="#" class="price-btn">$1500</a>
					</li>
					<li class="d-flex justify-content-between align-items-center">
						<span>Sri Lanka</span> <a href="#" class="price-btn">$1500</a>
					</li>
					<li class="d-flex justify-content-between align-items-center">
						<span>Nepal</span> <a href="#" class="price-btn">$1500</a>
					</li>
					<li class="d-flex justify-content-between align-items-center">
						<span>Thiland</span> <a href="#" class="price-btn">$1500</a>
					</li>
					<li class="d-flex justify-content-between align-items-center">
						<span>Singapore</span> <a href="#" class="price-btn">$1500</a>
					</li>
				</ul>
			</div>
		</div>
	</div>
	</section>
</body>
</html>